package enzocesarano.D1_Esercizio.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Bevande extends Prodotto {
    private double grado_alcolico;
    private double litri;

    public Bevande(String name, double price, double carlories, double grado_alcolico) {
        super(name, price, carlories);
        this.grado_alcolico = grado_alcolico;
    }
}


