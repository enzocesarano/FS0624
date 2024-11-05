package enzocesarano.D1_Esercizio.payloads;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record DipendenteDTO(
        @NotEmpty(message = "Il nome è obbligatorio!")
        @Size(min = 2, max = 20, message = "Il nome deve contentere dai 2 ai 20 caratteri")
        String nome,
        @NotEmpty(message = "Il cognome è obbligatorio!")
        @Size(min = 2, max = 20, message = "Il nome deve contentere dai 2 ai 20 caratteri")
        String cognome,
        @NotEmpty(message = "L'email è obbligatoria!")
        @Email(message = "L'email non è un indirizzo corretto!")
        String email,
        @NotEmpty(message = "Il campo password non può essere vuoto!")
        @NotNull
        @Pattern(regexp = "^(?=.[a-z])(?=.[A-Z])(?=.*\\d)(?=.[@$!%?&])[A-Za-z\\d@$!%?&]{8,}$", message = "La password non segue i criteri comuni")
        String password,
        @Past(message = "La data inserita non è valida")
        @JsonFormat(pattern = "yyyy-MM-dd")
        LocalDate data_nascita) {
}
