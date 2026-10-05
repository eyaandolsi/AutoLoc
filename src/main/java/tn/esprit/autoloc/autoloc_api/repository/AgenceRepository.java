package tn.esprit.autoloc.autoloc_api.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.autoloc.autoloc_api.domain.Agence;

public interface AgenceRepository extends CrudRepository<Agence, Long> {
}
