package tn.esprit.autoloc.autoloc_api.service;

import tn.esprit.autoloc.autoloc_api.domain.Client;
import tn.esprit.autoloc.autoloc_api.domain.Employe;
import tn.esprit.autoloc.autoloc_api.repository.ClientRepository;
import tn.esprit.autoloc.autoloc_api.repository.EmployeRepository;

import java.util.List;

public class EmployeService implements IEmployeService{
    EmployeRepository EmRepo;
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
        return EmRepo.save(e) ;
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
}
