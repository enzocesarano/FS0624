package enzocesarano.D4_Esercizio.runners;

import enzocesarano.D4_Esercizio.entities.Toppings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class ToppingsRunner implements CommandLineRunner {
    public static List<Toppings> toppingList = new ArrayList<>();

    @Override
    public void run(String... args) throws Exception {
        toppingList.add(new Toppings("Pomodoro", 1.20, 50));
        toppingList.add(new Toppings("Funghi", 1.00, 35));
        toppingList.add(new Toppings("Cipolle", 0.75, 40));
        toppingList.add(new Toppings("Olive", 1.25, 50));
        toppingList.add(new Toppings("Formaggio Extra", 1.75, 400));

        toppingList.forEach(topping -> log.info("Ingrediente ", topping.getName() + " creato con successo!"));
    }
}