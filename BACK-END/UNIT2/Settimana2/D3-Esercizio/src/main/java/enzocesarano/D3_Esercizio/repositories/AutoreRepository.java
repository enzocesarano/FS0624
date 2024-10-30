package enzocesarano.D3_Esercizio.repositories;

import enzocesarano.D3_Esercizio.entities.Autore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoreRepository extends JpaRepository<Autore, Long> {
    boolean existsByEmail(String email);
}
