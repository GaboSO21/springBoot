package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Domain.Libro;
import com.example.demo.Service.LibroService;

@Controller
public class LibroController {

    private LibroService service;

    public LibroController(LibroService service) {
        this.service = service;
    }

    @GetMapping("/index")
    public String inicio() {
        return "index";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("libros", service.selectLibros());
        return "listar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(Libro libro) {
        service.deleteLibro(libro);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(Libro libro, Model model) {
        model.addAttribute("libro", service.findLibro(libro));
        return "/agregar";
    }

    @PostMapping("/guardar")
    public String guardar(@Validated Libro libro, Errors errors) {
        if (errors.hasErrors()) {
            return "agregar";
        }
        service.saveLibro(libro);
        return "redirect:/listar";
    }

    @GetMapping("/agregar")
    public String agregar(Libro libro) {
        return "agregar";
    }

}
