package enzocesarano.entities;

import enzocesarano.entities.ENUM.TypeEvents;

import java.time.LocalDate;
import java.util.Set;

public class GaraDiAtletica extends Evento {
    private Set<Persone> atleti;
    private Persone vincitore;


    public GaraDiAtletica(String title, LocalDate date_event, String description, TypeEvents type_event, int max_people, Location location, Set<Persone> atleti, Persone vincitore) {
        super(title, date_event, description, type_event, max_people, location);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }
    

    public GaraDiAtletica() {
    }

    public Set<Persone> getAtleti() {
        return atleti;
    }

    public void setAtleti(Set<Persone> atleti) {
        this.atleti = atleti;
    }

    public Persone getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persone vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "atleti=" + atleti +
                ", vincitore=" + vincitore +
                "} ";
    }
}
