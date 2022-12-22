package com.mysql.mysqldemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mysql.mysqldemo.service.PersonaService;

@Controller
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/listar")
    public String inicioPersonas(Model model) {

        model.addAttribute("personas", personaService.listarPersonas());

        return "index";
    }

}
