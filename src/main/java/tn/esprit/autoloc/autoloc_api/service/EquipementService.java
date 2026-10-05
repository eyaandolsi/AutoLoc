package tn.esprit.autoloc.autoloc_api.service;

import tn.esprit.autoloc.autoloc_api.domain.Equipement;
import tn.esprit.autoloc.autoloc_api.repository.EquipementRepository;

import java.util.List;

public class EquipementService implements IEquipementService {

    EquipementRepository EqRepo;

    @Override
    public List<Equipement> retrieveAllEquipements() {
        return (List<Equipement>) EqRepo.findAll();
    }

    @Override
    public Equipement addEquipement(Equipement eq) {
        return EqRepo.save(eq);
    }

    @Override
    public Equipement updateEquipement(Equipement eq) {
        return EqRepo.save(eq);
    }

    @Override
    public Equipement retrieveEquipement(Long idEquipement) {
        return EqRepo.findById(idEquipement).orElse(null);
    }

    @Override
    public void removeEquipement(Long idEquipement) {
        EqRepo.deleteById(idEquipement);
    }

    @Override
    public List<Equipement> addEquipements(List<Equipement> equipements) {
        return (List<Equipement>) EqRepo.saveAll(equipements);
    }
}