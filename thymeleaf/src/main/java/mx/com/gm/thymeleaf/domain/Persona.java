package mx.com.gm.thymeleaf.domain;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "persona")
public class Persona implements Serializable{
    
    @Autowired(required = false)
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

}
