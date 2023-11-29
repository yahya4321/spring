package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservation();
    public Reservation retrieveReservation(String reservId);
    public Reservation addReservation(Reservation r);
    public void removeReservation(String Id);
    public Reservation modifyReservation(Reservation reserv);
    public Reservation findReservationParBloc(long idBloc);


}
