package enzocesarano.D1_Esercizio;

import enzocesarano.D1_Esercizio.entities.Bevande;
import enzocesarano.D1_Esercizio.entities.Menu;
import enzocesarano.D1_Esercizio.entities.Pizza;
import enzocesarano.D1_Esercizio.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;

@Configuration
public class BeansManager {

    // bevande

    @Bean
    @Scope("prototype")
    public Bevande getCola() {
        return new Bevande("Cola", 2.0, 150, 0.0);
    }

    @Bean
    @Scope("prototype")
    public Bevande getBirra() {
        return new Bevande("Birra", 3.0, 200, 5.0);
    }

    @Bean
    @Scope("prototype")
    public Bevande getVino() {
        return new Bevande("Vino Rosso", 5.0, 300, 12.0);
    }

    @Bean
    @Scope("prototype")
    public Bevande getAranciata() {
        return new Bevande("Aranciata", 2.5, 120, 0.0);
    }


    // ingredienti

    @Bean
    @Scope("prototype")
    public Toppings getMozzarella() {
        return new Toppings("Mozzarella", 1.5, 80);
    }

    @Bean
    @Scope("prototype")
    public Toppings getOlive() {
        return new Toppings("Olive", 1.0, 50);
    }

    @Bean
    @Scope("prototype")
    public Toppings getPassataDiPomodoro() {
        return new Toppings("Passata di Pomodoro", 0.8, 30);
    }

    @Bean
    @Scope("prototype")
    public Toppings getFunghi() {
        return new Toppings("Funghi", 1.2, 30);
    }

    @Bean
    @Scope("prototype")
    public Toppings getSalsicce() {
        return new Toppings("Salsicce", 2.5, 200);
    }


    // pizze

    @Bean
    @Scope("prototype")
    public Pizza getMargherita() {
        return new Pizza("Pizza Margherita", 5.0, 250, Arrays.asList(getMozzarella(), getPassataDiPomodoro()));
    }

    @Bean
    @Scope("prototype")
    public Pizza getPizzaFunghi() {
        return new Pizza("Pizza Funghi", 8.5, 280, Arrays.asList(getMozzarella(), getFunghi(), getPassataDiPomodoro()));
    }

    @Bean
    @Scope("prototype")
    public Pizza getPizzaSalsicce() {
        return new Pizza("Pizza Salsicce", 9.0, 300, Arrays.asList(getMozzarella(), getSalsicce(), getPassataDiPomodoro()));
    }

    @Bean
    @Scope("prototype")
    public Pizza getPizzaOlive() {
        return new Pizza("Pizza Olive", 8.0, 270, Arrays.asList(getMozzarella(), getOlive(), getPassataDiPomodoro()));
    }

    @Bean
    @Scope("singleton")
    public Menu getMenu() {
        Menu menu = new Menu();

        menu.addPizza(getMargherita());
        menu.addPizza(getPizzaFunghi());
        menu.addPizza(getPizzaSalsicce());
        menu.addPizza(getPizzaOlive());
        
        menu.addBevanda(getCola());
        menu.addBevanda(getBirra());
        menu.addBevanda(getVino());
        menu.addBevanda(getAranciata());

        return menu;
    }
}