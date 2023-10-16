package tn.esprit.tpfoyer.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tpfoyer.entities.Etudiant;

import java.util.Date;
import java.util.List;

public interface IEtudiantRepository extends CrudRepository<Etudiant,Long> {
List<Etudiant> findAllByCinEqualsAndDateNaissance(long cin, Date date);
}
