package enzocesarano.D1_Esercizio;

import enzocesarano.D1_Esercizio.entities.Bevande;
import enzocesarano.D1_Esercizio.entities.Menu;
import enzocesarano.D1_Esercizio.entities.Pizza;
import enzocesarano.D1_Esercizio.entities.Toppings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Collectors;

@SpringBootApplication
public class D1EsercizioApplication {

    public static void main(String[] args) {

        SpringApplication.run(D1EsercizioApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(D1EsercizioApplication.class);

        Menu menu = context.getBean(Menu.class);

        System.out.println("\nMenu Pizze:");
        for (Pizza pizza : menu.getPizze()) {
            String ingredientiNomi = pizza.getIngredienti().stream().map(Toppings::getName).collect(Collectors.joining(", "));
            System.out.println(pizza.getName() + " (" + ingredientiNomi + ") - Price: " + pizza.getPrice() + "€");
        }

        System.out.println("\nMenu Bevande:");
        for (Bevande bevanda : menu.getBevande()) {
            System.out.println(bevanda.getName() + " - Price: " + bevanda.getPrice() + "€");
        }
    }
}
