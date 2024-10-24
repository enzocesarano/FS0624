package enzocesarano.D4_Esercizio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
public class Pizza extends Prodotto {
    @ManyToMany
    @JoinTable(name = "topping_pizza",
            joinColumns = @JoinColumn(name = "id_topping"),
            inverseJoinColumns = @JoinColumn(name = "id_pizza"))
    private List<Toppings> ingredienti;

    public Pizza(String name, double price, double carlories, List<Toppings> ingredienti) {
        super(name, price, carlories);
        this.ingredienti = ingredienti;
    }
}
