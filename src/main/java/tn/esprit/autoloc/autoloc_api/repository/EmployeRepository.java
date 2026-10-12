package tn.esprit.autoloc.autoloc_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autoloc_api.domain.Employe;
@Repository
public interface EmployeRepository extends CrudRepository<Employe, Long> {
}
