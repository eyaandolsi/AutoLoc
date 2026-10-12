package tn.esprit.autoloc.autoloc_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autoloc_api.domain.Maintenance;
@Repository

public interface MaintenanceRepository extends CrudRepository<Maintenance, Long> {
}
