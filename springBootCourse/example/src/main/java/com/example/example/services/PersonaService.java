package com.example.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.example.domain.Persona;
import com.example.example.repository.PersonaRepository;

@Service
public class PersonaService {

    private final PersonaRepository repo;

    public PersonaService(PersonaRepository repo) {
        this.repo = repo;
    }

    public List<Persona> getPersonas() {
        return repo.findAll();
    }

}
