package tn.esprit.autoloc.autoloc_api.service;

import tn.esprit.autoloc.autoloc_api.domain.Vehicule;
import tn.esprit.autoloc.autoloc_api.repository.VehiculeRepository;

import java.util.List;

public class VehiculeService implements IVehiculeService {

    VehiculeRepository VRepo;

    @Override
    public List<Vehicule> retrieveAllVehicules() {
        return (List<Vehicule>) VRepo.findAll();
    }

    @Override
    public Vehicule addVehicule(Vehicule v) {
        return VRepo.save(v);
    }

    @Override
    public Vehicule updateVehicule(Vehicule v) {
        return VRepo.save(v);
    }

    @Override
    public Vehicule retrieveVehicule(Long idVehicule) {
        return VRepo.findById(idVehicule).orElse(null);
    }

    @Override
    public void removeVehicule(Long idVehicule) {
        VRepo.deleteById(idVehicule);
    }

    @Override
    public List<Vehicule> addVehicules(List<Vehicule> vehicules) {
        return (List<Vehicule>) VRepo.saveAll(vehicules);
    }
}