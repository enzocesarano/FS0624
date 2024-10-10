package enzocesarano.entities;

import enzocesarano.entities.ENUM.TypeEvents;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "partite_di_calcio")
public class PartitaDiCalcio extends Evento {
    private String squadra_di_casa;
    private String squadra_ospite;
    private String squadra_vincente;
    private int gol_casa;
    private int gol_ospiti;


    public PartitaDiCalcio(String title, LocalDate date_event, String description, TypeEvents type_event, int max_people, Location location, String squadra_di_casa, String squadra_ospite, String squadra_vincente, int gol_casa, int gol_ospiti) {
        super(title, date_event, description, type_event, max_people, location);
        this.squadra_di_casa = squadra_di_casa;
        this.squadra_ospite = squadra_ospite;
        this.squadra_vincente = squadra_vincente;
        this.gol_casa = gol_casa;
        this.gol_ospiti = gol_ospiti;
    }

    public PartitaDiCalcio() {
    }

    public int getGol_ospiti() {
        return gol_ospiti;
    }

    public void setGol_ospiti(int gol_ospiti) {
        this.gol_ospiti = gol_ospiti;
    }

    public String getSquadra_di_casa() {
        return squadra_di_casa;
    }

    public void setSquadra_di_casa(String squadra_di_casa) {
        this.squadra_di_casa = squadra_di_casa;
    }

    public String getSquadra_ospite() {
        return squadra_ospite;
    }

    public void setSquadra_ospite(String squadra_ospite) {
        this.squadra_ospite = squadra_ospite;
    }

    public String getSquadra_vincente() {
        return squadra_vincente;
    }

    public void setSquadra_vincente(String squadra_vincente) {
        this.squadra_vincente = squadra_vincente;
    }

    public int getGol_casa() {
        return gol_casa;
    }

    public void setGol_casa(int gol_casa) {
        this.gol_casa = gol_casa;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadra_di_casa='" + squadra_di_casa + '\'' +
                ", squadra_ospite='" + squadra_ospite + '\'' +
                ", squadra_vincente='" + squadra_vincente + '\'' +
                ", gol_casa=" + gol_casa +
                ", gol_ospiti=" + gol_ospiti +
                "} " + super.toString();
    }
}
