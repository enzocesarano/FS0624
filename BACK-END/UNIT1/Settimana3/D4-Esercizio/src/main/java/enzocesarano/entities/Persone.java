package enzocesarano.entities;

import enzocesarano.entities.ENUM.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "persone")
public class Persone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private long person_id;

    private String name;
    private String surname;
    private String email;
    private LocalDate date_of_birth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(mappedBy = "participation_id")
    private List<Partecipazione> partecipazioneList;

    public Persone() {
    }

    public Persone(String name, String surname, String email, LocalDate date_of_birth, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
    }

    public long getPerson_id() {
        return person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Partecipazione> getPartecipazioneList() {
        return partecipazioneList;
    }

    public void setPartecipazioneList(List<Partecipazione> partecipazioneList) {
        this.partecipazioneList = partecipazioneList;
    }

    @Override
    public String toString() {
        return "Persone{" +
                "person_id=" + person_id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", gender=" + gender +
                '}';
    }
}
