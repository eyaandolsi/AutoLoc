
package tn.esprit.autoloc.autoloc_api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc_api.domain.Employe;
import tn.esprit.autoloc.autoloc_api.service.IEmployeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employe")
public class EmployeController {

    final IEmployeService employeService;

    @PostMapping("/addEmploye")
    public Employe addEmploye(@RequestBody Employe e) {
        return employeService.addEmploye(e);
    }

    @GetMapping("/getEmployes")
    public List<Employe> getAllEmployes() {
        return employeService.retrieveAllEmployes();
    }

    @GetMapping("/getEmployeById/{idEmploye}")
    public Employe getEmployeById(@PathVariable Long idEmploye) {
        return employeService.retrieveEmploye(idEmploye);
    }

    @DeleteMapping("/DeleteEmploye/{idEmploye}")
    public void deleteEmploye(@PathVariable Long idEmploye) {
        employeService.removeEmploye(idEmploye);
    }

    @PutMapping("/updateEmploye")
    public Employe updateEmploye(@RequestBody Employe e) {
        return employeService.updateEmploye(e);
    }
}
