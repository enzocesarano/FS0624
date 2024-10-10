package enzocesarano.entities;

import enzocesarano.entities.ENUM.Genere;
import enzocesarano.entities.ENUM.TypeEvents;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

public class Concerto extends Evento {

    @Enumerated(EnumType.STRING)
    private Genere genere;
    private boolean stram_live;

    public Concerto(String title, LocalDate date_event, String description, TypeEvents type_event, int max_people, Location location, Genere genere, boolean stram_live) {
        super(title, date_event, description, type_event, max_people, location);
        this.genere = genere;
        this.stram_live = stram_live;
    }

    public Concerto() {
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public boolean isStram_live() {
        return stram_live;
    }

    public void setStram_live(boolean stram_live) {
        this.stram_live = stram_live;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", stram_live=" + stram_live +
                "} ";
    }
}
