package com.constrular.constrular.API.controllers;

import com.constrular.constrular.API.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.constrular.constrular.API.services.ClientService;

import java.util.List;

@RestController
@RequestMapping("api/clients")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientControll {

    @Autowired
    private final ClientService clientService;

    public ClientControll(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id){
        var client= clientService.getClientById(id);
            return ResponseEntity.ok(client);
    }

    @PostMapping
    public ResponseEntity<Client> addClient(@RequestBody Client client){
        Client newClient = clientService.addClient(client);
        return ResponseEntity.ok(newClient);
    }

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients(){
        return ResponseEntity.ok(clientService.getAllClients());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@RequestBody Client client, @PathVariable Long id){
        var updatedClient = clientService.updateClient(client, id);
        return ResponseEntity.ok(updatedClient);
    }
}
