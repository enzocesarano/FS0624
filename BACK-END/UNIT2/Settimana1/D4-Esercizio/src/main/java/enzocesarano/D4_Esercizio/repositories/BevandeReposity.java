package enzocesarano.D4_Esercizio.repositories;

import enzocesarano.D4_Esercizio.entities.Bevande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BevandeReposity extends JpaRepository<Bevande, Long> {
}
