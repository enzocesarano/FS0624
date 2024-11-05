package enzocesarano.D1_Esercizio.controllers;

import enzocesarano.D1_Esercizio.entities.Dipendente;
import enzocesarano.D1_Esercizio.entities.Prenotazione;
import enzocesarano.D1_Esercizio.payloads.DipendenteDTO;
import enzocesarano.D1_Esercizio.payloads.PrenotazioneDTO;
import enzocesarano.D1_Esercizio.services.DipendenteService;
import enzocesarano.D1_Esercizio.services.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/dipendenti")
public class DipendenteController {

    @Autowired
    private DipendenteService dipendenteService;

    @Autowired
    private PrenotazioneService prenotazioneService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<Dipendente> findAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size,
                                    @RequestParam(defaultValue = "nome") String sortBy) {
        return this.dipendenteService.findAll(page, size, sortBy);
    }

    @GetMapping("/{id_dipendente}")
    @ResponseStatus(HttpStatus.OK)
    public Dipendente getDipendente(@PathVariable UUID id_dipendente) {
        Dipendente dipendente = this.dipendenteService.findById(id_dipendente);
        return dipendente;
    }

    @PutMapping("/{id_dipendente}")
    @ResponseStatus(HttpStatus.OK)
    public Dipendente putDipendente(@PathVariable UUID id_dipendente, @RequestBody DipendenteDTO dipendente) {
        Dipendente updatedDipendente = this.dipendenteService.findByIdAndUpdate(id_dipendente, dipendente);
        return updatedDipendente;
    }

    @DeleteMapping("/{id_dipendente}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDipendente(@PathVariable UUID id_dipendente) {

    }

    @PatchMapping("/{id_dipendente}/avatar")
    @ResponseStatus(HttpStatus.OK)
    public String uploadAvatar(@RequestParam("avatar") MultipartFile file, @PathVariable UUID id_dipendente) {
        return this.dipendenteService.updateAvatar(file, id_dipendente);
    }

    // EndPoint di prenotazioni dato l'id del dipendente.

    @GetMapping("/{id_dipendente}/prenotazioni")
    @ResponseStatus(HttpStatus.OK)
    public List<Prenotazione> getPrenotazioniByDipendente(@PathVariable UUID id_dipendente) {
        List<Prenotazione> prenotazioni = this.dipendenteService.findPrenotazioniByDipendenteId(id_dipendente);
        return prenotazioni;
    }

    // Creazione e modifica di una prenotazione delle prenotazioni SOLO per singolo Dipendente

    @PostMapping("/{id_dipendente}/prenotazioni")
    @ResponseStatus(HttpStatus.CREATED)
    public Prenotazione postPrenotazione(@RequestBody PrenotazioneDTO payload, @PathVariable UUID id_dipendente) {
        return this.prenotazioneService.savePrenotazione(payload, id_dipendente);
    }

    @PutMapping("/{id_dipendente}/prenotazioni/{id_prenotazione}")
    @ResponseStatus(HttpStatus.OK)
    public Prenotazione putPrenotazione(@PathVariable UUID id_dipendente, @RequestBody PrenotazioneDTO payload, @PathVariable UUID id_prenotazione) {
        return this.prenotazioneService.findByIdAndUpdate(id_dipendente, payload, id_prenotazione);
    }
}

