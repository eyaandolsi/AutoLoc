package tn.esprit.autoloc.autoloc_api.service;

import tn.esprit.autoloc.autoloc_api.domain.Paiement;
import tn.esprit.autoloc.autoloc_api.repository.PaiementRepository;

import java.util.List;

public class PaiementService implements IPaiementService {

    PaiementRepository PRepo;

    @Override
    public List<Paiement> retrieveAllPaiements() {
        return (List<Paiement>) PRepo.findAll();
    }

    @Override
    public Paiement addPaiement(Paiement p) {
        return PRepo.save(p);
    }

    @Override
    public Paiement updatePaiement(Paiement p) {
        return PRepo.save(p);
    }

    @Override
    public Paiement retrievePaiement(Long idPaiement) {
        return PRepo.findById(idPaiement).orElse(null);
    }

    @Override
    public void removePaiement(Long idPaiement) {
        PRepo.deleteById(idPaiement);
    }

    @Override
    public List<Paiement> addPaiements(List<Paiement> paiements) {
        return (List<Paiement>) PRepo.saveAll(paiements);
    }
}