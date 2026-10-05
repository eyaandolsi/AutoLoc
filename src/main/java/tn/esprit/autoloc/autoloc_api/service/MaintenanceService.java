package tn.esprit.autoloc.autoloc_api.service;

import tn.esprit.autoloc.autoloc_api.domain.Maintenance;
import tn.esprit.autoloc.autoloc_api.repository.MaintenanceRepository;

import java.util.List;

public class MaintenanceService implements IMaintenanceService {

    MaintenanceRepository MRepo;

    @Override
    public List<Maintenance> retrieveAllMaintenances() {
        return (List<Maintenance>) MRepo.findAll();
    }

    @Override
    public Maintenance addMaintenance(Maintenance m) {
        return MRepo.save(m);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance m) {
        return MRepo.save(m);
    }

    @Override
    public Maintenance retrieveMaintenance(Long idMaintenance) {
        return MRepo.findById(idMaintenance).orElse(null);
    }

    @Override
    public void removeMaintenance(Long idMaintenance) {
        MRepo.deleteById(idMaintenance);
    }

    @Override
    public List<Maintenance> addMaintenances(List<Maintenance> maintenances) {
        return (List<Maintenance>) MRepo.saveAll(maintenances);
    }
}