package tn.esprit.autoloc.autoloc_api.service;

import tn.esprit.autoloc.autoloc_api.domain.Contrat;

import java.util.List;

public interface IContratService {
    List<Contrat> retrieveAllContrats();
    Contrat addContrat(Contrat cn);
    Contrat updateContrat(Contrat cn);
    Contrat retrieveContrat(Long idContrat);
    void removeContrat(Long idContrat);
    List<Contrat> addContrats (List<Contrat> contrats);
}
