package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    public List<Universite> retrieveAllUniversite();
    public Universite retrieveUniversite(Long id);
    public Universite addUniversite(Universite u);
    public void removeUniversite(Long id);
    public Universite modifyUniversite(Universite u);
    public Universite affecteFoyerUniversite(long idFoyer , long idUniversite);
}
