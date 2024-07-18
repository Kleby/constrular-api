package com.constrular.constrular.API.services.ClientServiceImp;

import com.constrular.constrular.API.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.constrular.constrular.API.repository.ClientRepository;
import com.constrular.constrular.API.services.ClientService;

import java.util.List;

@Service
public class ClientServiceImp implements ClientService {

    @Autowired
    private final ClientRepository clientRepository;

    public ClientServiceImp(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client getClientById(Long id) {
        Client client = clientRepository.findById(id).orElseThrow(null);
        return client;
    }

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client updateClient(Client client, Long id) {
        Client clientBd = getClientById(id);
        if(clientBd != null){
            clientBd = client;
            clientRepository.save(clientBd);
        }
        return null;
    }
}
