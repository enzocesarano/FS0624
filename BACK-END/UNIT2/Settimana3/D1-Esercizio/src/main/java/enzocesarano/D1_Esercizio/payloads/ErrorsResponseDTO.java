package enzocesarano.D1_Esercizio.payloads;

import java.time.LocalDateTime;

public record ErrorsResponseDTO(String message, LocalDateTime timeStamp) {
}
