package tn.esprit.autoloc.autoloc_api.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.autoloc.autoloc_api.domain.Maintenance;

public interface MaintenanceRepository extends CrudRepository<Maintenance, Long> {
}
