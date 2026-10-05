package tn.esprit.autoloc.autoloc_api.service;

import tn.esprit.autoloc.autoloc_api.domain.Agence;
import tn.esprit.autoloc.autoloc_api.repository.AgenceRepository;

import java.util.List;

public class AgenceService implements IAgenceService{
    AgenceRepository AgRepo;

    @Override
    public List<Agence> retrieveAllAgences() {
        return (List<Agence>) AgRepo.findAll();
    }

    @Override
    public Agence addAgence(Agence A) {
        return AgRepo.save(A);
    }

    @Override
    public Agence updateAgence(Agence A) {
        return AgRepo.save(A) ;
    }

    @Override
    public Agence retrieveAgence(Long idAgence) {
        return AgRepo.findById(idAgence).orElse(null);
    }

    @Override
    public void removeAgence(Long idAgence) {
        AgRepo.deleteById(idAgence);
    }

    @Override
    public List<Agence> addAgences(List<Agence> Agences) {
        return (List<Agence>) AgRepo.saveAll(Agences);
    }
}
