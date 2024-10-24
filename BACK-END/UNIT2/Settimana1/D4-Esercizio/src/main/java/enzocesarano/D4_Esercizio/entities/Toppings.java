package enzocesarano.D4_Esercizio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Toppings extends Prodotto {
    @ManyToMany(mappedBy = "ingredienti")
    private List<Pizza> pizze;

    public Toppings(String name, double price, double carlories) {
        super(name, price, carlories);
    }
}
