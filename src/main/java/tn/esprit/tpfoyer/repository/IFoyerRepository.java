package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.entities.Universite;

import java.util.List;

@Repository

public interface IFoyerRepository extends JpaRepository<Foyer, Long> {
    public Universite findByUniv_IdUniversite(long id);
}
