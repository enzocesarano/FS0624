package enzocesarano.D1_Esercizio.controllers;

import enzocesarano.D1_Esercizio.entities.Dipendente;
import enzocesarano.D1_Esercizio.payloads.DipendenteDTO;
import enzocesarano.D1_Esercizio.payloads.UserLoginDTO;
import enzocesarano.D1_Esercizio.payloads.UserLoginResponseDTO;
import enzocesarano.D1_Esercizio.services.AuthService;
import enzocesarano.D1_Esercizio.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;
    @Autowired
    private DipendenteService dipendenteService;

    @PostMapping("/login")
    public UserLoginResponseDTO login(@RequestBody UserLoginDTO body) {
        return new UserLoginResponseDTO(this.authService.checkCredentialsAndGenerateToken(body));
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Dipendente postDipendente(@RequestBody DipendenteDTO dipendente) {
        return this.dipendenteService.saveDipendente(dipendente);
    }
}
