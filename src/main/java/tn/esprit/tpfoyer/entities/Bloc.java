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

public class Bloc implements Serializable {
    @Id
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;
    @ManyToOne
    public Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="blocks")
    private Set<Chambre> Chambres;
}
