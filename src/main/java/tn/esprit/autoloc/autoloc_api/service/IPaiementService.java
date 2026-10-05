package tn.esprit.autoloc.autoloc_api.service;

import tn.esprit.autoloc.autoloc_api.domain.Paiement;

import java.util.List;

public interface IPaiementService {

    List<Paiement> retrieveAllPaiements();

    Paiement addPaiement(Paiement p);

    Paiement updatePaiement(Paiement p);

    Paiement retrievePaiement(Long idPaiement);

    void removePaiement(Long idPaiement);

    List<Paiement> addPaiements(List<Paiement> paiements);
}