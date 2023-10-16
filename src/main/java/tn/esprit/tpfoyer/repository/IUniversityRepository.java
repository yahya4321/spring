package tn.esprit.tpfoyer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Universite;
@Repository
public interface IUniversityRepository extends CrudRepository<Universite,Long> {
    public Universite findByNomUniversiteAndAdresse(String nom,String adresse);
}
