package tn.esprit.autoloc.autoloc_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autoloc_api.domain.Reservation;
import tn.esprit.autoloc.autoloc_api.repository.ReservationRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ReservationService implements IReservationService {

   final ReservationRepository RRepo;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return (List<Reservation>) RRepo.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return RRepo.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return RRepo.save(r);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return RRepo.findById(idReservation).orElse(null);
    }

    @Override
    public void removeReservation(Long idReservation) {
        RRepo.deleteById(idReservation);
    }

    @Override
    public List<Reservation> addReservations(List<Reservation> reservations) {
        return (List<Reservation>) RRepo.saveAll(reservations);
    }
}