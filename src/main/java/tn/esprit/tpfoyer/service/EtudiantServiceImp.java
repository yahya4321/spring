package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.repository.IEtudiantRepository;

import java.util.List;
@Service
public class EtudiantServiceImp implements tn.esprit.tpfoyer.service.IEtudiantService {
    @Autowired
    IEtudiantRepository iEtudiantRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return iEtudiantRepository.findAll();
    }

    @Override
    public Etudiant retrieveEtudiant(int etudiantId) {
        return iEtudiantRepository.findById(etudiantId).get();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return iEtudiantRepository.save(e);
    }

    @Override
    public void removeEtudiant(int etudiantId) {
        iEtudiantRepository.deleteById(etudiantId);
    }

    @Override
    public Etudiant modifyEtudiant(Etudiant e) {
        return null;
    }
}
