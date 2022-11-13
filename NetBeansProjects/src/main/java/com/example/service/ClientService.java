package com.example.service;

import com.example.entity.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.ClientRepository;

@Service
public class ClientService implements IClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return (List<Client>)clientRepository.findAll();
    }

    @Override
    public List<Client> getClientsBySurname(String surname) {
        return (List<Client>)clientRepository.findBySurname(surname);
    }

   
}