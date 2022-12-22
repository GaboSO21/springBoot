package cr.webapp.thexample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cr.webapp.thexample.domain.Persona;
import cr.webapp.thexample.repository.PersonaRepository;

@Service
public class PersonaService {

    private final PersonaRepository repo;

    public PersonaService(PersonaRepository repo) {
        this.repo = repo;
    }

    public List<Persona> getPersonas(){
        return repo.findAll();
    }

}
