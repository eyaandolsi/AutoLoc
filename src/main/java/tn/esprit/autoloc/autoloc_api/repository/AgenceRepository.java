package tn.esprit.autoloc.autoloc_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autoloc_api.domain.Agence;

import java.util.List;

@Repository
public interface AgenceRepository extends CrudRepository<Agence, Long> {
    List<Agence> findByVille(String ville);
}
