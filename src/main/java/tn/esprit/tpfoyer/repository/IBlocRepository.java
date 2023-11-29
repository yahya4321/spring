package tn.esprit.tpfoyer.repository;

import org.hibernate.mapping.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Bloc;

import java.util.List;

@Repository

public interface IBlocRepository extends JpaRepository<Bloc,Long> {

    List<Bloc> findByFoyer_UnivIdUniversite(long idUniversite);

}
