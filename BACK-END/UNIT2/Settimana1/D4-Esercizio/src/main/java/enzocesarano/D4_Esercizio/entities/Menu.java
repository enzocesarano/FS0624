package enzocesarano.D4_Esercizio.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class Menu {
    private List<Pizza> pizze = new ArrayList<>();
    private List<Bevande> bevande = new ArrayList<>();

    public void addPizza(Pizza pizza) {
        pizze.add(pizza);
    }

    public void addBevanda(Bevande bevanda) {
        bevande.add(bevanda);
    }
}