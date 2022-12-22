package com.mysql.mysqldemo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysql.mysqldemo.domain.Persona;
import com.mysql.mysqldemo.repository.PersonaRepository;

@Service
@Transactional
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> listarPersonas() {
        return (List<Persona>) personaRepository.findAll();
    }

    public void guardarPersona(Persona persona) {
        personaRepository.save(persona);
    }

    public void eliminarPersona(Persona persona) {
        personaRepository.delete(persona);
    }

    public Persona buscarPersona(Persona persona) {
        return personaRepository.findById(persona.getId_persona()).orElse(null);
    }

}
