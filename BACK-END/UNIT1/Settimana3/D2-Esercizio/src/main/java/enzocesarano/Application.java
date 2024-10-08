package enzocesarano;

import enzocesarano.dao.EventoDAO;
import enzocesarano.entities.Evento;
import enzocesarano.entities.TypeEvents;
import enzocesarano.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.sql.Date;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("d2_esercizio");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO ed = new EventoDAO(em);

        Evento newEvent = new Evento("DIO LO SA", Date.valueOf("2025-06-08"), "Tour dell'artistra Geolier, con l'album DIO LO SA", TypeEvents.PUBLIC, 20000);

        ed.save(newEvent);

        try {
            Evento fromDb = ed.getById(1);
            System.out.println(fromDb);

            ed.getById(1);

        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }


    }

}
