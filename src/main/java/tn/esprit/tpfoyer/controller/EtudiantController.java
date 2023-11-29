package tn.esprit.tpfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.service.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/Etudiant")
public class EtudiantController {
    @Autowired
    IEtudiantService iEtudiantService;

    @PostMapping("/addEtudiant")
    public Etudiant addChambre(@RequestBody Etudiant e){
        return iEtudiantService.addEtudiant(e);
    }
    @GetMapping("/retrieveAllEtudiant")
    public List<Etudiant> getEtudiant()
    {
        return iEtudiantService.retrieveAllEtudiant();
    }
    @DeleteMapping("/DeleteEtudiant/{numE}")
    public void SupprimerEtudiant(@PathVariable("numE") int numE){
        iEtudiantService.removeEtudiant(numE);
    }


}
