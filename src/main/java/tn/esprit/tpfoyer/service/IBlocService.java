package tn.esprit.tpfoyer.service;

import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Chambre;

import java.util.List;

public interface IBlocService {
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(Long BlocId);
    public Bloc addBlock(Bloc b);
    public void removeBlock(Long BlocId);
    public Bloc modifyBloc(Bloc bloc);
    public Bloc affectBlocChambre(List<Long> idChambre , long idBloc);
    List<Bloc> findIdUniv(long idUniversite);

}
