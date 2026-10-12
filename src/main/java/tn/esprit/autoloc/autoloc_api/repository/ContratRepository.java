package tn.esprit.autoloc.autoloc_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autoloc_api.domain.Client;
import tn.esprit.autoloc.autoloc_api.domain.Contrat;
@Repository
public interface ContratRepository extends CrudRepository<Contrat, Long> {
}
