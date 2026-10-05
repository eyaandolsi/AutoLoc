package tn.esprit.autoloc.autoloc_api.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.autoloc.autoloc_api.domain.Equipement;

public interface EquipementRepository extends CrudRepository<Equipement, Long> {
}
