package mx.com.gm.dao;

import org.springframework.data.repository.CrudRepository;

import mx.com.gm.thymeleaf.domain.Persona;

public interface PersonaDao extends CrudRepository<Persona,Long>{
    


}
