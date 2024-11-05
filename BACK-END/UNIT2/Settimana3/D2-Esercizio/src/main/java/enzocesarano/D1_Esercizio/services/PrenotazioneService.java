package enzocesarano.D1_Esercizio.services;

import enzocesarano.D1_Esercizio.entities.Dipendente;
import enzocesarano.D1_Esercizio.entities.Prenotazione;
import enzocesarano.D1_Esercizio.entities.Viaggio;
import enzocesarano.D1_Esercizio.exceptions.NotFoundException;
import enzocesarano.D1_Esercizio.payloads.PrenotazioneDTO;
import enzocesarano.D1_Esercizio.repositories.PrenotazioneRepository;
import enzocesarano.D1_Esercizio.repositories.ViaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
public class PrenotazioneService {

    @Autowired
    PrenotazioneRepository prenotazioneRepository;

    @Autowired
    DipendenteService dipendenteService;

    @Autowired
    ViaggioService viaggioService;

    @Autowired
    ViaggioRepository viaggioRepository;

    public Page<Prenotazione> findAll(int page, int size, String sortBy) {
        if (size > 20) size = 20;
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return this.prenotazioneRepository.findAll(pageable);
    }

    public Prenotazione findById(UUID id_prenotazione) {
        return this.prenotazioneRepository.findById(id_prenotazione).orElseThrow(() -> new NotFoundException(id_prenotazione));
    }

    public Prenotazione savePrenotazione(PrenotazioneDTO payload, UUID id_dipendente) {
        Viaggio viaggio = this.viaggioService.findById(UUID.fromString(payload.id_viaggio()));
        Dipendente dipendente = this.dipendenteService.findById(id_dipendente);
        boolean prenotazioniSovrapposte = dipendente.getPrenotazioni().stream().anyMatch(prenotazione -> {
            LocalDate dataAndataEsistente = prenotazione.getViaggio().getData_andata();
            LocalDate dataRitornoEsistente = prenotazione.getViaggio().getData_ritorno();
            return !(viaggio.getData_ritorno().isBefore(dataAndataEsistente) ||
                    viaggio.getData_andata().isAfter(dataRitornoEsistente));
        });
        if (prenotazioniSovrapposte) {
            throw new IllegalStateException("Il dipendente ha già una prenotazione che si sovrappone alle date del viaggio selezionato.");
        }

        Prenotazione newPrenotazione = new Prenotazione(payload.note_dipendente(), viaggio, dipendente);
        return this.prenotazioneRepository.save(newPrenotazione);
    }

    public Prenotazione findByIdAndUpdate(UUID id_dipendente, PrenotazioneDTO payload, UUID id_prenotazione) {
        Dipendente dipendente = this.dipendenteService.findById(id_dipendente);
        Prenotazione prenotazione = this.findById(id_prenotazione);
        prenotazione.setNote_dipendente(payload.note_dipendente());
        return this.prenotazioneRepository.save(prenotazione);
    }

    public void deletePrenotazione(UUID id_prenotazione) {
        Prenotazione prenotazione = this.findById(id_prenotazione);
        this.prenotazioneRepository.delete(prenotazione);
    }

}
