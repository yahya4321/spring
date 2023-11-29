package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.repository.IFoyerRepository;
import tn.esprit.tpfoyer.repository.IUniversiteRepository;

import java.util.List;
@Service
public class UniversiteServiceImp implements tn.esprit.tpfoyer.service.IUniversiteService {
    @Autowired
    IUniversiteRepository iUniversiteRepository;
    @Autowired
    IFoyerRepository iFoyerRepository;
    @Override
    public List<Universite> retrieveAllUniversite() {
        return iUniversiteRepository.findAll();
    }

    @Override
    public Universite retrieveUniversite(Long id) {
        return iUniversiteRepository.findById(id).get();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return iUniversiteRepository.save(u);
    }

    @Override
    public void removeUniversite(Long id) {
        iUniversiteRepository.deleteById(id);
    }

    @Override
    public Universite modifyUniversite(Universite u) {
        return iUniversiteRepository.save(u);
    }

    @Override
    public Universite affecteFoyerUniversite(long idFoyer, long idUniversite) {
        Universite u=iUniversiteRepository.findById(idUniversite).get();
        Foyer f=iFoyerRepository.findById(idFoyer).get();
        u.setFoyer(f);
        return  u;
    }

}
