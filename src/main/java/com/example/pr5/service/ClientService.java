package com.example.pr5.service;

import com.example.pr5.models.Client;
import com.example.pr5.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public Client create(Client clients) {
        return clientRepository.save(clients);
    }

    public List<Client> getAll() {
        ArrayList<Client> Clients = new ArrayList<>();
        clientRepository.findAll().forEach(Clients::add);
        return Clients;
    }

    public Client getById(int id) {
        return clientRepository.findById(id).get();
    }

    public void update(Client clients, int Clientid) {
        clientRepository.save(clients);
    }

    public void delete(int id) {
        clientRepository.deleteById(id);
    }
}
