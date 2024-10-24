package enzocesarano.D4_Esercizio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class Prodotto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id_prodotto;

    private String name;
    private double price;
    private double carlories;

    public Prodotto(String name, double price, double carlories) {
        this.name = name;
        this.price = price;
        this.carlories = carlories;
    }
}
