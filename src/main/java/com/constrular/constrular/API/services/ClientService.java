package com.constrular.constrular.API.services;

import com.constrular.constrular.API.models.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {

    Client getClientById(Long id);

    Client addClient(Client client);

    List<Client> getAllClients();

    void deleteClient(Long id);

    Client updateClient(Client client, Long id);
}
