package tn.esprit.autoloc.autoloc_api.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.autoloc.autoloc_api.domain.Vehicule;

public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {
}
