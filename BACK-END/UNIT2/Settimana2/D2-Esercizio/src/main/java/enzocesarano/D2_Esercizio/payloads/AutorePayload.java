package enzocesarano.D2_Esercizio.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class AutorePayload {
    private String name;
    private String cognome;
    private String email;
    private LocalDate data_nascita;

}
