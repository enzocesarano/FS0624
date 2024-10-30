package enzocesarano.D3_Esercizio.repositories;

import enzocesarano.D3_Esercizio.entities.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {

}
