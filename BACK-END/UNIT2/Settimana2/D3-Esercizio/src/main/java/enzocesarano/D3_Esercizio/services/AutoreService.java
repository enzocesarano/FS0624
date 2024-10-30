package enzocesarano.D3_Esercizio.services;


import enzocesarano.D3_Esercizio.entities.Autore;
import enzocesarano.D3_Esercizio.exceptions.BadRequestException;
import enzocesarano.D3_Esercizio.exceptions.NotFoundException;
import enzocesarano.D3_Esercizio.payloads.AutorePayload;
import enzocesarano.D3_Esercizio.repositories.AutoreRepository;
import enzocesarano.D3_Esercizio.repositories.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoreService {

    @Autowired
    private AutoreRepository autoreRepository;

    @Autowired
    private BlogPostRepository blogPostRepository;


    public List<Autore> findAll() {
        return this.autoreRepository.findAll();
    }

    public Autore saveAutore(AutorePayload body) {
        if (this.autoreRepository.existsByEmail(body.getEmail())) throw new BadRequestException("La mail è già in uso");
        Autore newAutore = new Autore(body.getNome(), body.getCognome(), body.getEmail(), body.getData_nascita());
        newAutore.setAvatar("https://ui-avatars.com/api/?name=" + newAutore.getNome() + "+" + newAutore.getCognome());
        return this.autoreRepository.save(newAutore);
    }

    public Autore findById(long autoreId) {
        return this.autoreRepository.findById(autoreId).orElseThrow(() -> new NotFoundException(autoreId));
    }

    public Autore findByIdAndUpdate(long autoreId, AutorePayload body) {
        Autore autore = this.findById(autoreId);
        if (!autore.getEmail().equals(body.getEmail())) {
            if (this.autoreRepository.existsByEmail(body.getEmail()))
                throw new BadRequestException("La mail è già in uso");
        }

        autore.setNome(body.getNome());
        autore.setCognome(body.getCognome());
        autore.setEmail(body.getEmail());
        autore.setData_nascita(body.getData_nascita());
        autore.setAvatar("https://ui-avatars.com/api/?name=" + autore.getNome() + "+" + autore.getCognome());

        return this.autoreRepository.save(autore);
    }

    public void findByIdAndDelete(long autoreId) {
        Autore autore = this.findById(autoreId);
        this.blogPostRepository.deleteByAutoreId(autoreId);
        this.autoreRepository.delete(autore);
    }
}
