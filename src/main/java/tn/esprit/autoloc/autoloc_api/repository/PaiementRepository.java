package tn.esprit.autoloc.autoloc_api.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.autoloc.autoloc_api.domain.Paiement;

public interface PaiementRepository extends CrudRepository <Paiement, Long>{
}
