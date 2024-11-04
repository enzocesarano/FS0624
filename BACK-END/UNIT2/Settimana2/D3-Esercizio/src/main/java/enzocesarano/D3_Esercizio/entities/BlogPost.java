package enzocesarano.D3_Esercizio.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "blog_posts")
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_blog_post;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempo_lettura;

    @ManyToOne
    @JoinColumn(name = "autore")
    @JsonManagedReference
    private Autore autore;

    public BlogPost(String categoria, String titolo, String contenuto, int tempo_lettura, Autore autore) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.tempo_lettura = tempo_lettura;
        this.autore = autore;
    }
}
