package enzocesarano.D2_Esercizio.services;

import enzocesarano.D2_Esercizio.entities.Autore;
import enzocesarano.D2_Esercizio.payloads.AutorePayload;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {
    private List<Autore> autoreList = new ArrayList<>();


    public List<Autore> findAll() {
        return this.autoreList;
    }

    public Autore saveAutore(AutorePayload body) {
        Random rndm = new Random();
        Autore newAutore = new Autore(body.getNome(), body.getCognome(), body.getEmail(), body.getData_nascita());
        newAutore.setId_autore(rndm.nextInt(1, 1000));
        newAutore.setAvatar("https://avatars.dicebear.com/api/identicon/" + newAutore.getId_autore());
        this.autoreList.add(newAutore);
        return newAutore;
    }

    public Autore findById(int autoreId) {
        Autore found = null;
        for (Autore autore : this.autoreList) {
            if (autore.getId_autore() == autoreId) found = autore;
        }
        if (found == null) throw new RuntimeException("Autore non trovato.");
        return found;
    }

    public Autore findByIdAndUpdate(int autoreId, AutorePayload body) {
        Autore found = null;
        for (Autore autore : this.autoreList) {
            if (autore.getId_autore() == autoreId) {
                found = autore;
                found.setNome(body.getNome());
                found.setCognome(body.getCognome());
                found.setEmail(body.getEmail());
                found.setData_nascita(body.getData_nascita());
            }
        }
        if (found == null) throw new RuntimeException("Blog Post non trovato.");
        return found;
    }

    public void findByIdAndDelete(int autoreId) {
        Autore found = null;
        for (Autore autore : this.autoreList) {
            if (autore.getId_autore() == autoreId) found = autore;
        }
        if (found == null) throw new RuntimeException("Blog Post non trovato.");
        this.autoreList.remove(found);
    }
}
