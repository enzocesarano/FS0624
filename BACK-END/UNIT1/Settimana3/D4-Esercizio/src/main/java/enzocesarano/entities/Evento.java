package enzocesarano.entities;

import enzocesarano.entities.ENUM.TypeEvents;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long event_id;

    private String title;
    private LocalDate date_event;
    private String description;

    @Enumerated(EnumType.STRING)
    private TypeEvents type_event;

    private int max_people;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @OneToMany(mappedBy = "participation_id")
    private List<Partecipazione> partecipazioneList;


    public Evento() {
    }

    public Evento(String title, LocalDate date_event, String description, TypeEvents type_event, int max_people, Location location) {
        this.title = title;
        this.date_event = date_event;
        this.description = description;
        this.type_event = type_event;
        this.max_people = max_people;
        this.location = location;
    }

    public List<Partecipazione> getPartecipazioneList() {
        return partecipazioneList;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate_event() {
        return date_event;
    }

    public void setDate_event(LocalDate date_event) {
        this.date_event = date_event;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeEvents getType_event() {
        return type_event;
    }

    public void setType_event(TypeEvents type_event) {
        this.type_event = type_event;
    }

    public int getMax_people() {
        return max_people;
    }

    public void setMax_people(int max_people) {
        this.max_people = max_people;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "event_id=" + event_id +
                ", title='" + title + '\'' +
                ", date_event=" + date_event +
                ", description='" + description + '\'' +
                ", type_event=" + type_event +
                ", max_people=" + max_people +
                ", location=" + location +
                '}';
    }
}
