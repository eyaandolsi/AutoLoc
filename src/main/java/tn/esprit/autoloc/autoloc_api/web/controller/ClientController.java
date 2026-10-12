package tn.esprit.autoloc.autoloc_api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc_api.domain.Client;
import tn.esprit.autoloc.autoloc_api.service.IClientService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {
    final IClientService clientService;
    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client c){
        return clientService.addClient(c);
    }
@GetMapping("/getClients")
    public List<Client> getAllClients(){
        return clientService.retrieveAllClients();
}
@GetMapping("/getClientById/{idc}")
    public Client getClientById(@PathVariable long idc){
        return clientService.retrieveClient(idc);
}
@DeleteMapping("/DeleteClient/{idclient}")
    public void deleteClient(@PathVariable long idclient){
        clientService.removeClient(idclient);
}
@PutMapping("/updateClient")
public  Client updateClient (@RequestBody Client c){
        return clientService.updateClient(c);

}


}
