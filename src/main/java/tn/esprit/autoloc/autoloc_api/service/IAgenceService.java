package tn.esprit.autoloc.autoloc_api.service;

import tn.esprit.autoloc.autoloc_api.domain.Agence;


import java.util.List;

    public interface IAgenceService {
        List<Agence> retrieveAllAgences();
        Agence addAgence(Agence A);
        Agence updateAgence(Agence A);
        Agence retrieveAgence(Long idAgence);
        void removeAgence(Long idAgence);
        List<Agence> addAgences (List<Agence> Agences);
    }
}
