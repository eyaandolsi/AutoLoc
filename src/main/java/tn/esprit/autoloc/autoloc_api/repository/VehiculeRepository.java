package tn.esprit.autoloc.autoloc_api.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autoloc_api.domain.Vehicule;

@Repository
public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {

    List<Vehicule> findByMarque(String marque);
    List<Vehicule> findByCategorie(String categorie);
    List<Vehicule> findByStatut(String statut);
    List<Vehicule> findByTarifJournalierGreaterThan(Double tarif);
    List<Vehicule> findByMarqueAndStatut(String marque, String statut);


}