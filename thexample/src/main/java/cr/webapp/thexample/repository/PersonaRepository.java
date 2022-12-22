package cr.webapp.thexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cr.webapp.thexample.domain.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {}
