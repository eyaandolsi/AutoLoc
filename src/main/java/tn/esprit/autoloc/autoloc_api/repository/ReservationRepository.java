package tn.esprit.autoloc.autoloc_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autoloc_api.domain.Paiement;
import tn.esprit.autoloc.autoloc_api.domain.Reservation;
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
