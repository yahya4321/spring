package tn.esprit.tpfoyer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Etudiant;

import java.util.Date;
import java.util.List;
@Repository
public interface IEtudiantRepository extends CrudRepository<Etudiant,Long> {
List<Etudiant> findAllByCinEqualsAndDateNaissance(long cin, Date date);
}
