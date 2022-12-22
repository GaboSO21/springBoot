package cr.webapp.thexample.repository;

import org.springframework.data.repository.CrudRepository;

import cr.webapp.thexample.domain.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long> {}
