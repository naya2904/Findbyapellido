package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {
    public List<Client> findBySurname(String surname);
}
