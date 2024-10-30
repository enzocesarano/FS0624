package enzocesarano.D3_Esercizio.repositories;

import enzocesarano.D3_Esercizio.entities.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {

    @Query("DELETE FROM BlogPost b WHERE b.autore.id_autore = :autoreId")
    void deleteByAutoreId(@Param("autoreId") long autoreId);
}
