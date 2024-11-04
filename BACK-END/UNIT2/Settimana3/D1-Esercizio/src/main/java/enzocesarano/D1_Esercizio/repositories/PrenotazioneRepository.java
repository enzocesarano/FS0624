package enzocesarano.D1_Esercizio.repositories;

import enzocesarano.D1_Esercizio.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, UUID> {
}
