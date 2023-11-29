package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.TypeChambre;

import java.util.List;

public interface IChambreService {
    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre c);
    public List<Chambre>  getChambresParNomUniversite( String nomUniversite);
    public List<Chambre> getChambresParBlocEtType (long idBloc, TypeChambre typeC) ;
    List<Chambre> findByBlocIdBlocAndTypeChambreJPQL(long idBloc, TypeChambre typeChambre);


}
