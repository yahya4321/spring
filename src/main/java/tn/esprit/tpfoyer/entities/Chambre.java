package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Block;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chambre implements Serializable {
    @Id
    private long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    @ManyToOne (cascade = CascadeType.ALL)
    Bloc blocks;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="chambre")
    private Set<Reservation> Reservations;
}
