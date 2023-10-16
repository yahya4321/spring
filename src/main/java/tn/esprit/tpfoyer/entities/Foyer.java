package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Foyer implements Serializable {

    @Id
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
    @OneToOne
    private Universite universite;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    private Set<Bloc> Blocs;



}


