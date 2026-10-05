package tn.esprit.autoloc.autoloc_api.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.autoloc.autoloc_api.domain.Paiement;
import tn.esprit.autoloc.autoloc_api.domain.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
