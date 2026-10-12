
package tn.esprit.autoloc.autoloc_api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc_api.domain.Agence;
import tn.esprit.autoloc.autoloc_api.service.IAgenceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agence")
public class AgenceController {

    final IAgenceService agenceService;

    @PostMapping("/addAgence")
    public Agence addAgence(@RequestBody Agence a) {
        return agenceService.addAgence(a);
    }

    @GetMapping("/getAgences")
    public List<Agence> getAllAgences() {
        return agenceService.retrieveAllAgences();
    }

    @GetMapping("/getAgenceById/{idAgence}")
    public Agence getAgenceById(@PathVariable Long idAgence) {
        return agenceService.retrieveAgence(idAgence);
    }

    @DeleteMapping("/DeleteAgence/{idAgence}")
    public void deleteAgence(@PathVariable Long idAgence) {
        agenceService.removeAgence(idAgence);
    }

    @PutMapping("/updateAgence")
    public Agence updateAgence(@RequestBody Agence a) {
        return agenceService.updateAgence(a);
    }
}
