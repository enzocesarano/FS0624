package enzocesarano.D4_Esercizio.runners;

import enzocesarano.D4_Esercizio.entities.Toppings;
import enzocesarano.D4_Esercizio.repositories.ToppingsRepository;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
@Order(1)
public class ToppingsRunner implements CommandLineRunner {
    @Getter
    private final List<Toppings> toppingsList = new ArrayList<>();

    @Autowired
    private ToppingsRepository tr;

    @Override
    public void run(String... args) throws Exception {
        Toppings pomodoro = new Toppings("Pomodoro", 1.20, 50);
        Toppings funghi = new Toppings("Funghi", 1.00, 35);
        Toppings cipolle = new Toppings("Cipolle", 0.75, 40);
        Toppings olive = new Toppings("Olive", 1.25, 50);
        Toppings formaggioExtra = new Toppings("Formaggio Extra", 1.75, 400);

        toppingsList.add(pomodoro);
        toppingsList.add(funghi);
        toppingsList.add(cipolle);
        toppingsList.add(olive);
        toppingsList.add(formaggioExtra);

        tr.saveAll(toppingsList);

        log.info("Toppings created: {}", toppingsList);
    }

}