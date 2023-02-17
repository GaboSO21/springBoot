package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Domain.Libro;
import com.example.demo.Repository.LibroRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LibroService {

    private LibroRepository repository;

    public LibroService(LibroRepository repository) {
        this.repository = repository;
    }

    public List<Libro> selectLibros() {
        return (List<Libro>) repository.findAll();
    }

    public void saveLibro(Libro libro) {
        repository.save(libro);
    }

    public Libro findLibro(Libro libro) {
        return repository.findById(libro.getId()).orElse(null);
    }

    public void deleteLibro(Libro libro) {
        repository.delete(libro);
    }

}
