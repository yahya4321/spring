package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.entities.Universite;

import java.util.List;

@Repository

public interface IUniversiteRepository extends JpaRepository<Universite,Long> {
}
