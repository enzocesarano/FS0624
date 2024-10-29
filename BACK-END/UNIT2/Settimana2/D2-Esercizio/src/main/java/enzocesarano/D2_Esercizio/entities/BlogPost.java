package enzocesarano.D2_Esercizio.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BlogPost {
    private int id_blog_post;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempo_lettura;

    public BlogPost(String categoria, String titolo, String contenuto, int tempo_lettura) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.tempo_lettura = tempo_lettura;
    }
}
