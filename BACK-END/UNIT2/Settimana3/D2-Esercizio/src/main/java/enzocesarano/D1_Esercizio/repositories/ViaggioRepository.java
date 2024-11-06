package enzocesarano.D1_Esercizio.repositories;

import enzocesarano.D1_Esercizio.entities.Viaggio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ViaggioRepository extends JpaRepository<Viaggio, UUID> {
}