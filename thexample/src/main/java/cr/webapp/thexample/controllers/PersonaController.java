package cr.webapp.thexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cr.webapp.thexample.domain.Persona;
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

        return "listar";
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona) {
        return "agregar";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona) {

        service.agregarPersona(persona);

        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(Persona persona, Model model) {
        persona = service.buscarPersona(persona);
        model.addAttribute("persona", persona);
        return "agregar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(Persona persona) {
        service.eliminarPersona(persona);
        return "redirect:/listar";
    }

}
