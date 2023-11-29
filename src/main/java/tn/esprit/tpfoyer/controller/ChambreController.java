package tn.esprit.tpfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.TypeChambre;
import tn.esprit.tpfoyer.service.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")

public class ChambreController {
    @Autowired
    IChambreService chambreService;

    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre c){
        return chambreService.addChambre(c);
    }
    @GetMapping("/retrieveAllChambres")
    public List<Chambre>getChambres()
    {
        return chambreService.retrieveAllChambres();
    }
    @DeleteMapping("/DeleteChambre/{numC}")
    public void SupprimerChambre(@PathVariable("numC") Long numC){
        chambreService.removeChambre(numC);
    }
    @PutMapping("/ModifyChambre/{id}")
    public Chambre ModifyChambre(@PathVariable("id") Long id,@RequestBody Chambre c1){
        Chambre c= chambreService.retrieveChambre(id);
        c.setTypeC(c1.getTypeC());
        c.setNumeroCharhambre(c1.getNumeroCharhambre());
        return chambreService.modifyChambre(c);
    }
    @GetMapping("/getChambresParBlocEtType/{idBloc}")
    public List<Chambre>getChambresParBlocEtType(@PathVariable("idBloc") Long idBloc,@RequestBody Chambre c)
    {
        return chambreService.getChambresParBlocEtType(idBloc,c.getTypeC());
    }
    @GetMapping("/getChambresParNomUniversite/{nomUniv}")
    public List<Chambre> getChambresParNomUniversite(@PathVariable("nomUniv") String nom) {
        return chambreService.getChambresParNomUniversite(nom);
    }

    @GetMapping("/getChambresParBlocEtTypeJPQL/{idBloc}")
    public List<Chambre>getChambresParBlocEtTypeJPQL(@PathVariable("idBloc") Long idBloc,@RequestBody Chambre c)
    {
        return chambreService.findByBlocIdBlocAndTypeChambreJPQL(idBloc,c.getTypeC());
    }



















}
