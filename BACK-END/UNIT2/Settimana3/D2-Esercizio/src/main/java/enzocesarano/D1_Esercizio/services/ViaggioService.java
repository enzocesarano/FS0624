package enzocesarano.D1_Esercizio.services;

import enzocesarano.D1_Esercizio.entities.Enum.StatoViaggio;
import enzocesarano.D1_Esercizio.entities.Viaggio;
import enzocesarano.D1_Esercizio.exceptions.NotFoundException;
import enzocesarano.D1_Esercizio.payloads.StatoViaggioDTO;
import enzocesarano.D1_Esercizio.payloads.ViaggioDTO;
import enzocesarano.D1_Esercizio.repositories.ViaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ViaggioService {
    @Autowired
    private ViaggioRepository viaggioRepository;

    public Page<Viaggio> findAll(int page, int size, String sortBy) {
        if (size > 20) size = 20;
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return this.viaggioRepository.findAll(pageable);
    }

    public Viaggio findById(UUID id_viaggio) {
        return this.viaggioRepository.findById(id_viaggio).orElseThrow(() -> new NotFoundException(id_viaggio));
    }

    public Viaggio saveViaggio(ViaggioDTO payload) {
        Viaggio newViaggio = new Viaggio(payload.destinazione(), payload.data_andata(), payload.data_ritorno());
        return this.viaggioRepository.save(newViaggio);
    }

    public Viaggio findByIdAndUpdate(UUID id_viaggio, ViaggioDTO payload) {
        Viaggio viaggio = this.findById(id_viaggio);

        viaggio.setDestinazione(payload.destinazione());
        viaggio.setData_andata(payload.data_andata());
        viaggio.setData_ritorno(payload.data_ritorno());

        return this.viaggioRepository.save(viaggio);
    }

    public void deleteViaggio(UUID id_viaggio) {
        Viaggio viaggio = this.findById(id_viaggio);
        this.viaggioRepository.delete(viaggio);
    }

    public Viaggio updateViaggioStato(UUID id_viaggio, StatoViaggioDTO payload) {
        Viaggio viaggio = this.findById(id_viaggio);
        viaggio.setStato_viaggio(StatoViaggio.valueOf(payload.stato_viaggio()));
        return viaggioRepository.save(viaggio);
    }
}
