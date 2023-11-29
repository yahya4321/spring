package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.repository.IBlocRepository;
import tn.esprit.tpfoyer.repository.IChambreRepository;

import java.util.List;

@Service
public class BlocServiceImp implements tn.esprit.tpfoyer.service.IBlocService {
    @Autowired
    IBlocRepository iBlocRepository;
    @Autowired
    IChambreRepository iChambreRepository;
    @Override
    public List<Bloc> retrieveAllBlocs() {

        return iBlocRepository.findAll();
    }

    @Override
    public Bloc retrieveBloc(Long BlocId) {
        return iBlocRepository.findById(BlocId).get();
    }

    @Override
    public Bloc addBlock(Bloc b) {
        return iBlocRepository.save(b);
    }

    @Override
    public void removeBlock(Long BlocId) {
        iBlocRepository.deleteById(BlocId);

    }

    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return iBlocRepository.save(bloc);
    }

    @Override
    public Bloc affectBlocChambre(List<Long> idChambre, long idBloc) {
        Bloc b=iBlocRepository.findById(idBloc).get();
        for(Long id:idChambre )
        {
            Chambre c=iChambreRepository.findById(id).get();
            c.setBloc(b);
            iChambreRepository.save(c);
        }


        return  b;
    }

    @Override
    public List<Bloc> findIdUniv(long idUniversite) {
        return iBlocRepository.findByFoyer_UnivIdUniversite(idUniversite);
    }
}
