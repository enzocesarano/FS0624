package enzocesarano.D4_Esercizio.service;

import enzocesarano.D4_Esercizio.entities.Pizza;
import enzocesarano.D4_Esercizio.repositories.PizzaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PizzaService {

    @Autowired
    private PizzaRepository pr;

    public void savePizza(Pizza pizza) {
        pr.save(pizza);
        log.info("La pizza " + pizza.getName() + " è stata creata con successo!");

    }

    public void savePiuPizze(List<Pizza> pizze) {
        for (Pizza p : pizze) {
            System.out.println(p.getName());
        }

    }
}
