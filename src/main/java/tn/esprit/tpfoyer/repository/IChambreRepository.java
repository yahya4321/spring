package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.entities.TypeChambre;

import java.util.List;

@Repository
public interface IChambreRepository extends JpaRepository<Chambre,Long> {


    public List<Chambre> findByReservationsNull();


    @Query("select Chambre  from Chambre c where c.typeC=:typeChambre and c.bloc.idBloc=:idBloc")
    List<Chambre> findByBlocIdBlocAndTypeChambreJPQL(@Param("idBloc")  long idBloc, @Param("typeChambre") TypeChambre typeChambre);

    public List<Chambre> findByBlocIdBlocAndTypeC(long idBloc , TypeChambre typec);
    public List<Chambre> findByBloc_Foyer_Univ_NomUniversite(String nom);

    //

}
