package tn.esprit.tpfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.service.BlocServiceImp;
import tn.esprit.tpfoyer.service.FoyerServiceImp;

import java.util.List;
@RestController
public class FoyerController {
    @Autowired
    FoyerServiceImp foyerServiceImp;
    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer b){
        return foyerServiceImp.addFoyer(b);
    }
    @GetMapping("/getFoyer")
    public List<Foyer> getFoyer(){
        return foyerServiceImp.retrieveAllFoyer();
    }
    @DeleteMapping("/supprimerFoyer/{b}")
    public void supprmerFoyer(@PathVariable("b")long b) {
        foyerServiceImp.removeFoyer(b);
    }
    @PostMapping("/affectFoyerAuniversite/{idUniversite}")
    public Foyer affectFoyerAuniversite(@RequestBody Foyer f ,@PathVariable("b")long idUniversite ){
        return foyerServiceImp.ajouterFoyerEtAffecterAUniversite(f,idUniversite);
    }
}
