package enzocesarano.D4_Esercizio.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Bevande extends Prodotto {
    private double grado_alcolico;
    private double litri;

    public Bevande(String name, double price, double carlories, double grado_alcolico, double litri) {
        super(name, price, carlories);
        this.grado_alcolico = grado_alcolico;
        this.litri = litri;
    }
}


