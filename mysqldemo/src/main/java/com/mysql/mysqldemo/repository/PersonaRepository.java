package com.mysql.mysqldemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.mysql.mysqldemo.domain.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long> {


}
