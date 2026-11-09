package tn.esprit.autoloc.autoloc_api.service;

import tn.esprit.autoloc.autoloc_api.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {

    List<Vehicule> retrieveAllVehicules();

    Vehicule addVehicule(Vehicule v);

    Vehicule updateVehicule(Vehicule v);

    Vehicule retrieveVehicule(Long idVehicule);

    void removeVehicule(Long idVehicule);

    List<Vehicule> addVehicules(List<Vehicule> vehicules);

    // Scénario 2 : rattacher un véhicule à une agence
    Vehicule affecterVehicule(Long idVehicule, Long idAgence);

    // Scénario 3 : installer / retirer un équipement
    Vehicule affecterEquipement(Long idVehicule, Long idEquipement);

    Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement);
}