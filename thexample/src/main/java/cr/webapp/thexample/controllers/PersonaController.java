package cr.webapp.thexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cr.webapp.thexample.repository.PersonaRepository;
import cr.webapp.thexample.service.PersonaService;

@Controller
public class PersonaController {

    private final PersonaService service;

    public PersonaController(PersonaService service) {
        this.service = service;
    }

    @GetMapping("/listar")
    public String inicio(Model model) {

        model.addAttribute("personas", service.getPersonas());

        return "index";
    }

}
