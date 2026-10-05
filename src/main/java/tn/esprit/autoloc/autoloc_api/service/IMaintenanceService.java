package tn.esprit.autoloc.autoloc_api.service;

import tn.esprit.autoloc.autoloc_api.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {

    List<Maintenance> retrieveAllMaintenances();

    Maintenance addMaintenance(Maintenance m);

    Maintenance updateMaintenance(Maintenance m);

    Maintenance retrieveMaintenance(Long idMaintenance);

    void removeMaintenance(Long idMaintenance);

    List<Maintenance> addMaintenances(List<Maintenance> maintenances);
}