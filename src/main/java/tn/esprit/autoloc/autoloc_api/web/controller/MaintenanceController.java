
package tn.esprit.autoloc.autoloc_api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc_api.domain.Maintenance;
import tn.esprit.autoloc.autoloc_api.service.IMaintenanceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceController {

    final IMaintenanceService maintenanceService;

    @PostMapping("/addMaintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance m) {
        return maintenanceService.addMaintenance(m);
    }

    @GetMapping("/getMaintenances")
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.retrieveAllMaintenances();
    }

    @GetMapping("/getMaintenanceById/{idMaintenance}")
    public Maintenance getMaintenanceById(@PathVariable Long idMaintenance) {
        return maintenanceService.retrieveMaintenance(idMaintenance);
    }

    @DeleteMapping("/DeleteMaintenance/{idMaintenance}")
    public void deleteMaintenance(@PathVariable Long idMaintenance) {
        maintenanceService.removeMaintenance(idMaintenance);
    }

    @PutMapping("/updateMaintenance")
    public Maintenance updateMaintenance(@RequestBody Maintenance m) {
        return maintenanceService.updateMaintenance(m);
    }
}
