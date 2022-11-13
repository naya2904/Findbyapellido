package com.example.service;

import com.example.entity.Client;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IClientService {
    public List<Client> getAllClients();
    public List<Client> getClientsBySurname(String surname);
}