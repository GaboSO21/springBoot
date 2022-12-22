package cr.webapp.thexample.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cr.webapp.thexample.domain.Persona;
import cr.webapp.thexample.repository.PersonaRepository;

@Service
@Transactional
public class PersonaService {

    private final PersonaRepository repo;

    public PersonaService(PersonaRepository repo) {
        this.repo = repo;
    }

    public List<Persona> getPersonas() {
        return (List<Persona>) repo.findAll();
    }

    public void agregarPersona(Persona persona) {
        repo.save(persona);
    }

    public void eliminarPersona(Persona persona) {
        repo.delete(persona);
    }

    public Persona buscarPersona(Persona persona) {
        return repo.findById(persona.getId()).orElse(null);
    }

}
