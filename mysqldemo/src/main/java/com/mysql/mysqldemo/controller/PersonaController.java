package com.mysql.mysqldemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mysql.mysqldemo.domain.Persona;
import com.mysql.mysqldemo.service.PersonaService;

@Controller
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/listar")
    public String listar(Model model) {

        model.addAttribute("personas", personaService.listarPersonas());

        return "listar";
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona) {
        return "agregar";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona) {
        personaService.guardarPersona(persona);
        return "redirect:/listar";
    }

    @GetMapping("/eliminar")
    public String eliminar(Persona persona) {
        personaService.eliminarPersona(persona);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id_persona}")
    public String editar(Persona persona, Model model) {
        persona = personaService.buscarPersona(persona);
        model.addAttribute("persona", persona);
        return "/agregar";
    }

}
