
package tn.esprit.autoloc.autoloc_api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc_api.domain.Contrat;
import tn.esprit.autoloc.autoloc_api.service.IContratService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contrat")
public class ContratController {

    final IContratService contratService;

    @PostMapping("/addContrat")
    public Contrat addContrat(@RequestBody Contrat c) {
        return contratService.addContrat(c);
    }

    @GetMapping("/getContrats")
    public List<Contrat> getAllContrats() {
        return contratService.retrieveAllContrats();
    }

    @GetMapping("/getContratById/{idc}")
    public Contrat getContratById(@PathVariable long idc) {
        return contratService.retrieveContrat(idc);
    }

    @DeleteMapping("/DeleteContrat/{idcontrat}")
    public void deleteContrat(@PathVariable long idcontrat) {
        contratService.removeContrat(idcontrat);
    }

    @PutMapping("/updateContrat")
    public Contrat updateContrat(@RequestBody Contrat c) {
        return contratService.updateContrat(c);
    }
}
