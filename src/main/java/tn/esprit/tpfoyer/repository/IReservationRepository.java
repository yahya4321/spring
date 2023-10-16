package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entities.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationRepository extends JpaRepository<Reservation,String>{
    List<Reservation> findByanneeUniversitaireGreaterThan(Date dateAU);

}
