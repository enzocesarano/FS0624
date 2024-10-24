package enzocesarano.D4_Esercizio.service;

import enzocesarano.D4_Esercizio.entities.Toppings;
import enzocesarano.D4_Esercizio.repositories.ToppingsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ToppingService {
    @Autowired
    private ToppingsRepository pr;

    public void saveTopping(Toppings topping) {
        pr.save(topping);
        log.info("L'ingrediente " + topping.getName() + " è stato creato con successo!");

    }

    public void savePiuTopping(List<Toppings> toppings) {
        for (Toppings t : toppings) {
            System.out.println(t.getName());
        }

    }
}
