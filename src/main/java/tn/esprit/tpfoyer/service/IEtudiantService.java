package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public List<Etudiant> retrieveAllEtudiant();
    public Etudiant retrieveEtudiant(int etudiantId);
    public Etudiant addEtudiant(Etudiant e);
    public void removeEtudiant(int etudiantId);
    public Etudiant modifyEtudiant(Etudiant e);
}
