package enzocesarano.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "events")

public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "date_event")
    private Date date_event;

    @Column(name = "description")
    private String description;

    @Column(name = "type_event")
    @Enumerated(EnumType.STRING)
    private TypeEvents type_event;

    @Column(name = "max_people")
    private int max_people;

    public Evento() {

    }

    public Evento(String title, Date date_event, String description, TypeEvents type_event, int max_people) {
        this.title = title;
        this.date_event = date_event;
        this.description = description;
        this.type_event = type_event;
        this.max_people = max_people;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate_event() {
        return date_event;
    }

    public void setDate_event(Date date_event) {
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
                "id=" + id +
                ", title='" + title + '\'' +
                ", date_event=" + date_event +
                ", description='" + description + '\'' +
                ", type_event=" + type_event +
                ", max_people=" + max_people +
                '}';
    }
}
