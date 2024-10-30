package enzocesarano.D3_Esercizio.controllers;

import enzocesarano.D3_Esercizio.entities.Autore;
import enzocesarano.D3_Esercizio.payloads.AutorePayload;
import enzocesarano.D3_Esercizio.services.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autori")
public class AutoreController {

    @Autowired
    private AutoreService autoreService;

    @GetMapping
    public List<Autore> getAutores() {
        return this.autoreService.findAll();
    }

    @GetMapping("/{autore_id}")
    public Autore getAutore(@PathVariable int autore_id) {
        return this.autoreService.findById(autore_id);
    }

    @PostMapping
    public Autore postAutore(@RequestBody AutorePayload autore) {
        return this.autoreService.saveAutore(autore);
    }

    @PutMapping("/{autore_id}")
    public Autore putAutore(@PathVariable int autore_id, @RequestBody AutorePayload autore) {
        return this.autoreService.findByIdAndUpdate(autore_id, autore);
    }

    @DeleteMapping("/{autore_id}")
    public void deleteAutore(@PathVariable int autore_id) {
        this.autoreService.findByIdAndDelete(autore_id);
    }
}
