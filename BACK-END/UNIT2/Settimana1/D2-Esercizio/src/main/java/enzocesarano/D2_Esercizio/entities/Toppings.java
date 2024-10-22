package enzocesarano.D2_Esercizio.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Toppings extends Prodotto {

    public Toppings(String name, double price, double carlories) {
        super(name, price, carlories);
    }

}
