package tn.esprit.autoloc.autoloc_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autoloc_api.domain.Vehicule;
@Repository
public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {
}
