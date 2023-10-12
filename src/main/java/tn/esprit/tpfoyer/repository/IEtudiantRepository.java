package tn.esprit.tpfoyer.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tpfoyer.entities.Etudiant;

public interface IEtudiantRepository extends CrudRepository<Etudiant,Long> {

}
