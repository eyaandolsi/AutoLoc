package tn.esprit.autoloc.autoloc_api.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.autoloc.autoloc_api.domain.Client;
import tn.esprit.autoloc.autoloc_api.domain.Contrat;

public interface ContratRepository extends CrudRepository<Contrat, Long> {
}
