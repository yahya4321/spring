package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Reservation;

import java.util.Date;
import java.util.List;
@Repository
public interface IReservationRepository extends JpaRepository<Reservation,String>{
    List<Reservation> findByanneeUniversitaireGreaterThan(Date dateAU);

}
