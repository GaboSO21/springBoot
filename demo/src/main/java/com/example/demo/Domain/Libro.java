package com.example.demo.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    @NotEmpty
    private String nombre, autor;
    @NotEmpty
    private String editorial;
    private int anno;

    public Libro() {
    }

    public Libro(String nombre, String autor, String editorial, int anno) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.anno = anno;
    }

    public Libro(Long id, String nombre, String autor, String editorial, int anno) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.anno = anno;
    }

}
