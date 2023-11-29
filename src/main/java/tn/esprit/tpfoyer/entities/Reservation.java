package tn.esprit.tpfoyer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id

    private String idReservation;
    private Date anneUniversitaire;
    private boolean estValide;

    @ManyToMany(mappedBy="reservationList", cascade = CascadeType.ALL)

    private List<Etudiant> etudiantList;
}
