package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Domain.Libro;

public interface LibroRepository extends CrudRepository<Libro, Long> {}
