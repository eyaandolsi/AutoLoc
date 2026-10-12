
package tn.esprit.autoloc.autoloc_api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc_api.domain.Vehicule;
import tn.esprit.autoloc.autoloc_api.service.IVehiculeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeController {

    final IVehiculeService vehiculeService;

    @PostMapping("/addVehicule")
    public Vehicule addVehicule(@RequestBody Vehicule v) {
        return vehiculeService.addVehicule(v);
    }

    @GetMapping("/getVehicules")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.retrieveAllVehicules();
    }

    @GetMapping("/getVehiculeById/{idVehicule}")
    public Vehicule getVehiculeById(@PathVariable Long idVehicule) {
        return vehiculeService.retrieveVehicule(idVehicule);
    }

    @DeleteMapping("/DeleteVehicule/{idVehicule}")
    public void deleteVehicule(@PathVariable Long idVehicule) {
        vehiculeService.removeVehicule(idVehicule);
    }

    @PutMapping("/updateVehicule")
    public Vehicule updateVehicule(@RequestBody Vehicule v) {
        return vehiculeService.updateVehicule(v);
    }
}
