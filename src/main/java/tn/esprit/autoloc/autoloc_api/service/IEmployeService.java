package tn.esprit.autoloc.autoloc_api.service;

import tn.esprit.autoloc.autoloc_api.domain.Employe;

import java.util.List;

public interface IEmployeService {
    List<Employe> retrieveAllEmployes();
    Employe addEmploye(Employe e);
    Employe updateEmploye(Employe e);
    Employe retrieveEmploye(Long idEmploye);
    void removeEmploye(Long idEmploye);
    List<Employe> addEmployes (List<Employe> employes);
}
