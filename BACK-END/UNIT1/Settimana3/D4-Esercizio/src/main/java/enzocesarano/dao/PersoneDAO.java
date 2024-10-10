package enzocesarano.dao;

import enzocesarano.entities.Persone;
import enzocesarano.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PersoneDAO {
    private final EntityManager entityManager;

    public PersoneDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Persone newPersone) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newPersone);
        transaction.commit();
        System.out.println("La persona  " + newPersone.getSurname() + " è stata creata con successo!");
    }

    public Persone getById(int participation_id) {
        Persone searchId = entityManager.find(Persone.class, participation_id);
        if (searchId == null) throw new NotFoundException(participation_id);
        return searchId;
    }

    public Persone deletePerson(int participation_id) {
        Persone search = this.getById(participation_id);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(search);
        transaction.commit();

        System.out.println("La persona  " + search.getSurname() + " è stata rimossa con successo!");
        return search;
    }

}
