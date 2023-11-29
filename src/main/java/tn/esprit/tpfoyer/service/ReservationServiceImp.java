package tn.esprit.tpfoyer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.repository.IChambreRepository;
import tn.esprit.tpfoyer.repository.IReservationRepository;

import java.util.List;
@Service
public class ReservationServiceImp implements tn.esprit.tpfoyer.service.IReservationService {
    @Autowired
    IReservationRepository iReservationRepository;
    @Autowired
    IChambreRepository iChambreRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return iReservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservation(String reservId) {
        return  iReservationRepository.findById(reservId).get();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return iReservationRepository.save(r);
    }

    @Override
    public void removeReservation(String Id) {
        iReservationRepository.deleteById(Id);
    }

    @Override
    public Reservation modifyReservation(Reservation reserv) {
        return iReservationRepository.save(reserv);
    }

    @Override
    public Reservation findReservationParBloc(long idBloc) {
        return iReservationRepository.findForReservation(idBloc);
    }


}
