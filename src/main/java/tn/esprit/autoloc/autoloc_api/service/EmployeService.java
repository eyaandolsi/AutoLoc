package tn.esprit.autoloc.autoloc_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autoloc.autoloc_api.domain.Agence;
import tn.esprit.autoloc.autoloc_api.domain.Employe;
import tn.esprit.autoloc.autoloc_api.repository.AgenceRepository;
import tn.esprit.autoloc.autoloc_api.repository.EmployeRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeService implements IEmployeService {

    final EmployeRepository EmRepo;
    final AgenceRepository agenceRepository;

    @Override
    public List<Employe> retrieveAllEmployes() {
        return (List<Employe>) EmRepo.findAll();
    }

    @Override
    public Employe addEmploye(Employe e) {
        return EmRepo.save(e);
    }

    @Override
    public Employe updateEmploye(Employe e) {
        return EmRepo.save(e);
    }

    @Override
    public Employe retrieveEmploye(Long idEmploye) {
        return EmRepo.findById(idEmploye).orElse(null);
    }

    @Override
    public void removeEmploye(Long idEmploye) {
        EmRepo.deleteById(idEmploye);
    }

    @Override
    public List<Employe> addEmployes(List<Employe> employes) {
        return (List<Employe>) EmRepo.saveAll(employes);
    }

    // Scénario 1 : affecter un employé à une agence
    @Override
    @Transactional
    public Employe affecterEmploye(Long idEmploye, Long idAgence) {
        Employe employe = EmRepo.findById(idEmploye).get();
        Agence agence = agenceRepository.findById(idAgence).get();
        // Côté propriétaire de la relation
        employe.setAgence(agence);
        return EmRepo.save(employe);
    }

    // Scénario 1 : désaffecter un employé
    @Override
    @Transactional
    public Employe desaffecterEmploye(Long idEmploye) {
        Employe employe = EmRepo.findById(idEmploye).get();
        employe.setAgence(null);
        return EmRepo.save(employe);
    }
}