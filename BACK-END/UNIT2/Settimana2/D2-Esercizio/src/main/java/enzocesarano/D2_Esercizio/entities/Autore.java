package enzocesarano.D2_Esercizio.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Autore {
    private int id_autore;
    private String name;
    private String cognome;
    private String email;
    private LocalDate data_nascita;
    private String avatar;

    public Autore(String name, String cognome, String email, LocalDate data_nascita) {
        this.name = name;
        this.cognome = cognome;
        this.email = email;
        this.data_nascita = data_nascita;
    }
}
