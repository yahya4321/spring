package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.TypeChambre;
import tn.esprit.tpfoyer.repository.IChambreRepository;
import tn.esprit.tpfoyer.service.IChambreService;

import java.util.ArrayList;
import java.util.List;
@Service

public class ChambreServiceImpl implements IChambreService {
    @Autowired
    IChambreRepository iChambreRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return iChambreRepository.findAll();

    }

    @Override
    public Chambre retrieveChambre(Long chambreId) {

        return iChambreRepository.findById(chambreId).get();
    }

    @Override
    public Chambre addChambre(Chambre c) {

        return iChambreRepository.save(c);
    }

    @Override
    public void removeChambre(Long chambreId) {
        iChambreRepository.deleteById(chambreId);

    }

    @Override
    public Chambre modifyChambre(Chambre c) {
        return iChambreRepository.save(c) ;
    }

    @Override
    public List<Chambre> getChambresParNomUniversite(String nomUniversite) {

        return iChambreRepository.findByBloc_Foyer_Univ_NomUniversite(nomUniversite);
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {
        return iChambreRepository.findByBlocIdBlocAndTypeC(idBloc,typeC);
    }

    @Override
    public List<Chambre> findByBlocIdBlocAndTypeChambreJPQL(long idBloc, TypeChambre typeChambre) {
        return iChambreRepository.findByBlocIdBlocAndTypeChambreJPQL(idBloc,typeChambre);
    }
}
