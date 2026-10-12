
package tn.esprit.autoloc.autoloc_api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc_api.domain.Paiement;
import tn.esprit.autoloc.autoloc_api.service.IPaiementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/paiement")
public class PaiementController {

    final IPaiementService paiementService;

    @PostMapping("/addPaiement")
    public Paiement addPaiement(@RequestBody Paiement p) {
        return paiementService.addPaiement(p);
    }

    @GetMapping("/getPaiements")
    public List<Paiement> getAllPaiements() {
        return paiementService.retrieveAllPaiements();
    }

    @GetMapping("/getPaiementById/{idPaiement}")
    public Paiement getPaiementById(@PathVariable Long idPaiement) {
        return paiementService.retrievePaiement(idPaiement);
    }

    @DeleteMapping("/DeletePaiement/{idPaiement}")
    public void deletePaiement(@PathVariable Long idPaiement) {
        paiementService.removePaiement(idPaiement);
    }

    @PutMapping("/updatePaiement")
    public Paiement updatePaiement(@RequestBody Paiement p) {
        return paiementService.updatePaiement(p);
    }
}
