package tn.esprit.tpfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.service.UniversiteServiceImp;

import java.util.List;
@RequestMapping("/universite")
@RestController
public class UniversiteController {
    @Autowired
    UniversiteServiceImp universiteServiceImp;
    @PostMapping("/addUniversite")
    public Universite addReservation(@RequestBody Universite b){
        return universiteServiceImp.addUniversite(b);
    }
    @GetMapping("/getUniversite")
    public List<Universite> getUniversite(){
        return universiteServiceImp.retrieveAllUniversite();
    }
    @DeleteMapping("/supprimerUniversite/{b}")
    public void supprmerUniversite(@PathVariable("b")long b)
    {
        universiteServiceImp.removeUniversite(b);
    }
    @PutMapping("/affecteUniversite/{id}/{idf}")
    public Universite AffecteUniversite(@PathVariable("id")long id , @PathVariable("idf")long idf ){
        Universite u= universiteServiceImp.affecteFoyerUniversite(idf,id);
        return u;
    }

}
