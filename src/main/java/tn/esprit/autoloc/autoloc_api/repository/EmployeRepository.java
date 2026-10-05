package tn.esprit.autoloc.autoloc_api.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.autoloc.autoloc_api.domain.Employe;

public interface EmployeRepository extends CrudRepository<Employe, Long> {
}
