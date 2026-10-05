package tn.esprit.autoloc.autoloc_api.service;

import tn.esprit.autoloc.autoloc_api.domain.Contrat;
import tn.esprit.autoloc.autoloc_api.repository.ContratRepository;

import java.util.List;

public class ContratService implements IContratService{
    ContratRepository cnRepo;
    @Override
    public List<Contrat> retrieveAllContrats() {
        return (List<Contrat>) cnRepo.findAll();
    }

    @Override
    public Contrat addContrat(Contrat cn) {
        return cnRepo.save(cn);
    }

    @Override
    public Contrat updateContrat(Contrat cn) {
        return cnRepo.save(cn) ;
    }

    @Override
    public Contrat retrieveContrat(Long idContrat) {
        return cnRepo.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Long idContrat) {
        cnRepo.deleteById(idContrat);
    }

    @Override
    public List<Contrat> addContrats(List<Contrat> contrats) {
        return (List<Contrat>) cnRepo.saveAll(contrats);
    }

}
