package enzocesarano.D2_Esercizio.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Autore {
    private int id_autore;
    private String nome;
    private String cognome;
    private String email;
    private String data_nascita;
    private String avatar;

    public Autore(String nome, String cognome, String email, String data_nascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.data_nascita = data_nascita;
    }
}
