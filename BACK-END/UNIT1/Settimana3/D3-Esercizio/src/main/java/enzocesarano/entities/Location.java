package enzocesarano.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "locations")

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private long location_id;

    private String name;
    private String city;

    @OneToMany(mappedBy = "event_id")
    private List<Evento> eventsList;

    public Location() {
    }

    public Location(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public long getLocation_id() {
        return location_id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Evento> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<Evento> eventsList) {
        this.eventsList = eventsList;
    }

    @Override
    public String toString() {
        return "Location{" +
                "location_id=" + location_id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
