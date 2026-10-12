
package tn.esprit.autoloc.autoloc_api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc_api.domain.Equipement;
import tn.esprit.autoloc.autoloc_api.service.IEquipementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/equipement")
public class EquipementController {

    final IEquipementService equipementService;

    @PostMapping("/addEquipement")
    public Equipement addEquipement(@RequestBody Equipement e) {
        return equipementService.addEquipement(e);
    }

    @GetMapping("/getEquipements")
    public List<Equipement> getAllEquipements() {
        return equipementService.retrieveAllEquipements();
    }

    @GetMapping("/getEquipementById/{idEquipement}")
    public Equipement getEquipementById(@PathVariable Long idEquipement) {
        return equipementService.retrieveEquipement(idEquipement);
    }

    @DeleteMapping("/DeleteEquipement/{idEquipement}")
    public void deleteEquipement(@PathVariable Long idEquipement) {
        equipementService.removeEquipement(idEquipement);
    }

    @PutMapping("/updateEquipement")
    public Equipement updateEquipement(@RequestBody Equipement e) {
        return equipementService.updateEquipement(e);
    }
}
