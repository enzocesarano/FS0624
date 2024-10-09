package enzocesarano.entities;


import enzocesarano.entities.ENUM.State;
import jakarta.persistence.*;

@Entity
@Table(name = "participations")

public class Partecipazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "participation_id")
    private long participation_id;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false, unique = true)
    private Persone persona;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false, unique = true)
    private Evento event;

    @Enumerated(EnumType.STRING)
    private State state;


    public Partecipazione() {
    }


    public Partecipazione(Persone persona, Evento event, State state) {
        this.persona = persona;
        this.event = event;
        this.state = state;
    }

    public long getParticipation_id() {
        return participation_id;
    }


    public Persone getPersona() {
        return persona;
    }

    public void setPersona(Persone persona) {
        this.persona = persona;
    }

    public Evento getEvent() {
        return event;
    }

    public void setEvent(Evento event) {
        this.event = event;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "participation_id=" + participation_id +
                ", persona=" + persona +
                ", event=" + event +
                ", state=" + state +
                '}';
    }
}
