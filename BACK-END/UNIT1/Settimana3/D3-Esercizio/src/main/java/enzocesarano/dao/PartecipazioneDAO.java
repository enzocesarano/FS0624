package enzocesarano.dao;

import enzocesarano.entities.Partecipazione;
import enzocesarano.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PartecipazioneDAO {
    private final EntityManager entityManager;

    public PartecipazioneDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Partecipazione newPartecipazione) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newPartecipazione);
        transaction.commit();
        System.out.println("La partecipazione  " + newPartecipazione.getParticipation_id() + " è stata creata con successo!");
    }

    public Partecipazione getById(int participation_id) {
        Partecipazione searchId = entityManager.find(Partecipazione.class, participation_id);
        if (searchId == null) throw new NotFoundException(participation_id);
        return searchId;
    }

    public Partecipazione deleteParticipation(int participation_id) {
        Partecipazione search = this.getById(participation_id);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(search);
        transaction.commit();

        System.out.println("La partecipazione  " + search.getParticipation_id() + " è stata rimossa con successo!");
        return search;
    }
}
