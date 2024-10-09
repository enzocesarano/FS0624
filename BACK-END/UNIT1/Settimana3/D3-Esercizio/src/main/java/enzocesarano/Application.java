package enzocesarano;

import enzocesarano.dao.EventoDAO;
import enzocesarano.dao.LocationDAO;
import enzocesarano.dao.PartecipazioneDAO;
import enzocesarano.dao.PersoneDAO;
import enzocesarano.entities.Persone;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("d2_esercizio");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        PersoneDAO pd = new PersoneDAO(em);
        EventoDAO ed = new EventoDAO(em);
        PartecipazioneDAO ticket = new PartecipazioneDAO(em);
        LocationDAO ld = new LocationDAO(em);

        /*Persone vincenzo = new Persone("Vincenzo", "Cesarano", "vinc.cesarano@gmail.com", LocalDate.of(1992, 11, 12), Gender.Male);
        Persone alice = new Persone("Alice", "Rossi", "alice.rossi@example.com", LocalDate.of(1987, 5, 22), Gender.Female);
        Persone marco = new Persone("Marco", "Bianchi", "marco.bianchi@example.com", LocalDate.of(1995, 8, 15), Gender.Male);
        Persone giulia = new Persone("Giulia", "Verdi", "giulia.verdi@example.com", LocalDate.of(2000, 3, 30), Gender.Female);

        pd.save(vincenzo);
        pd.save(alice);
        pd.save(marco);
        pd.save(giulia);

        Location napoli = new Location("Palapartenope", "Napoli");
        Location milano = new Location("Teatro alla Scala", "Milano");
        Location roma = new Location("Colosseo", "Roma");
        Location firenze = new Location("Piazza della Signoria", "Firenze");

        ld.save(napoli);
        ld.save(milano);
        ld.save(roma);
        ld.save(firenze);

        Evento geolier = new Evento("DIO LO SA", LocalDate.of(2025, 01, 15), "Geolier in tour con l'album 'DIO LO SA'.", TypeEvents.PUBLIC, 30000, napoli);
        Evento maneskin = new Evento("RUSH! World Tour", LocalDate.of(2024, 11, 25), "Maneskin in tour mondiale con l'album 'RUSH!'.", TypeEvents.PUBLIC, 50000, milano);
        Evento lauraPausini = new Evento("Laura Pausini European Tour", LocalDate.of(2024, 10, 20), "Laura Pausini in concerto con il suo tour europeo.", TypeEvents.PUBLIC, 40000, roma);
        Evento vascoRossi = new Evento("Vasco Rossi Live", LocalDate.of(2025, 06, 10), "Vasco Rossi in concerto per un evento imperdibile.", TypeEvents.PUBLIC, 60000, firenze);

        ed.save(geolier);
        ed.save(maneskin);
        ed.save(lauraPausini);
        ed.save(vascoRossi);

        Persone vincenzo = pd.getById(1);
        Evento geolier = ed.getById(1);
        Partecipazione ticket1 = new Partecipazione(vincenzo, geolier, State.CONFERMATA);

        ticket.save(ticket1);*/

        Persone vincenzo = pd.getById(1);
        vincenzo.getPartecipazioneList().stream().forEach(System.out::println);
    }

}
