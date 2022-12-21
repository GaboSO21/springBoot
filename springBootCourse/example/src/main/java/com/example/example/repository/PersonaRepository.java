package com.example.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.example.domain.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{}
