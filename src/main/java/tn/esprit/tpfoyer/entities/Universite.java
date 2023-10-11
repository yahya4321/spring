package tn.esprit.tpfoyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite implements Serializable {
    @Id
    private long idUniversite;
    private String nomUniversite;
    private String adresse;
    @OneToOne(mappedBy="universite")
    private Foyer foyer;
}
