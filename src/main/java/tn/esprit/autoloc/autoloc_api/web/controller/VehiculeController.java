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

    // Scénario 2 : rattacher un véhicule neuf à une agence (ex : Sfax)
    @PutMapping("/affecterVehicule/{idVehicule}/{idAgence}")
    public Vehicule affecterVehicule(@PathVariable Long idVehicule, @PathVariable Long idAgence) {
        return vehiculeService.affecterVehicule(idVehicule, idAgence);
    }

    // Scénario 3 : installer un équipement (siège bébé)
    @PutMapping("/affecterEquipement/{idVehicule}/{idEquipement}")
    public Vehicule affecterEquipement(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return vehiculeService.affecterEquipement(idVehicule, idEquipement);
    }

    // Scénario 3 : retirer l'équipement au retour
    @PutMapping("/desaffecterEquipement/{idVehicule}/{idEquipement}")
    public Vehicule desaffecterEquipement(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return vehiculeService.desaffecterEquipement(idVehicule, idEquipement);
    }
}