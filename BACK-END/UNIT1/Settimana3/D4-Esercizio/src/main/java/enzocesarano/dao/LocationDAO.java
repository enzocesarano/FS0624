package enzocesarano.dao;

import enzocesarano.entities.Location;
import enzocesarano.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class LocationDAO {
    private final EntityManager entityManager;

    public LocationDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Location newLocation) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newLocation);
        transaction.commit();
        System.out.println("La location  " + newLocation.getLocation_id() + " è stata creata con successo!");
    }

    public Location getById(int participation_id) {
        Location searchId = entityManager.find(Location.class, participation_id);
        if (searchId == null) throw new NotFoundException(participation_id);
        return searchId;
    }

    public Location deleteLocation(int participation_id) {
        Location search = this.getById(participation_id);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(search);
        transaction.commit();

        System.out.println("La location  " + search.getLocation_id() + " è stata rimossa con successo!");
        return search;
    }
}
