package tn.esprit.tpfoyer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numeroCharhambre;
    @Enumerated
    private TypeChambre typeC;
    @OneToMany
    @JsonIgnore
    private List<Reservation> reservations;
    @ManyToOne (cascade = CascadeType.ALL)
    @JsonIgnore
    private  Bloc bloc;

}
