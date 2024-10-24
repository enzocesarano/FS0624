package enzocesarano.D4_Esercizio.runners;

import enzocesarano.D4_Esercizio.entities.Pizza;
import enzocesarano.D4_Esercizio.entities.Toppings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
@Order(2)
public class PizzaRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        List<Toppings> topping = ToppingsRunner.toppingList;

        Pizza Margherita = new Pizza("Margherita", 5.00, 300, Arrays.asList(topping.get(0), topping.get(4)));
        Pizza Funghi = new Pizza("Pizza Funghi", 6.00, 350, Arrays.asList(topping.get(0), topping.get(1), topping.get(4)));
        Pizza Cipolla = new Pizza("Pizza Cipolla", 5.50, 320, Arrays.asList(topping.get(0), topping.get(2), topping.get(4)));
        Pizza Olive = new Pizza("Pizza Olive", 6.50, 360, Arrays.asList(topping.get(0), topping.get(3), topping.get(4)));
        Pizza Mista = new Pizza("Pizza Mista", 7.00, 400, Arrays.asList(topping.get(0), topping.get(1), topping.get(2), topping.get(3), topping.get(4)));

        log.info("Pizza " + Margherita.getName() + " è stata creata con successo");
        log.info("Pizza " + Funghi.getName() + " è stata creata con successo");
        log.info("Pizza " + Cipolla.getName() + " è stata creata con successo");
        log.info("Pizza " + Olive.getName() + " è stata creata con successo");
        log.info("Pizza " + Mista.getName() + " è stata creata con successo");
    }
}