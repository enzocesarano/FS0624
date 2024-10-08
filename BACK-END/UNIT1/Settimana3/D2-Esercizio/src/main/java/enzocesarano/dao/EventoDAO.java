package enzocesarano.dao;

import enzocesarano.entities.Evento;
import enzocesarano.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDAO {
    private final EntityManager entityManager;

    public EventoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Evento newEvent) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newEvent);
        transaction.commit();
        System.out.println("L'evento " + newEvent.getTitle() + " è stato creato con successo!");
    }

    public Evento getById(int idEvent) {
        Evento searchId = entityManager.find(Evento.class, idEvent);
        if (searchId == null) throw new NotFoundException(idEvent);
        return searchId;
    }

    public Evento deleteEvent(int idEvent) {
        Evento search = this.getById(idEvent);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(search);
        transaction.commit();

        System.out.println("L'evento " + search.getTitle() + " è stato rimosso con successo!");
        return search;
    }
}
