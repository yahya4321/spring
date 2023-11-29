package tn.esprit.tpfoyer.service;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    public List<Foyer> retrieveAllFoyer();
    public Foyer retrieveFoyer(Long FoyerId);
    public Foyer addFoyer(Foyer f);
    public void removeFoyer(Long FoyerId);
    public Foyer modifyBloc(Foyer foyer);
    public Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, long idUniversite) ;
}
