package enzocesarano.D1_Esercizio.services;

import enzocesarano.D1_Esercizio.entities.Dipendente;
import enzocesarano.D1_Esercizio.exceptions.UnauthorizedException;
import enzocesarano.D1_Esercizio.payloads.UserLoginDTO;
import enzocesarano.D1_Esercizio.tools.JWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AuthService {
    @Autowired
    private DipendenteService dipendenteService;

    @Autowired
    private JWT jwt;

    public String checkCredentialsAndGenerateToken(UserLoginDTO payload) {
        Dipendente dipendente = this.dipendenteService.findById(UUID.fromString(payload.id()));
        if (dipendente.getPassword().equals(payload.password())) {
            String accessToken = jwt.createToken(dipendente);
            return accessToken;
        } else {
            throw new UnauthorizedException("Credenziali errate!");
        }
    }

}