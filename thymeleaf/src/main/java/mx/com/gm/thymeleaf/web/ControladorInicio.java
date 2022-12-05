package mx.com.gm.thymeleaf.web;

import java.util.ArrayList;
import java.util.List;

// import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.var;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.thymeleaf.domain.Persona;

@Controller
@Slf4j
public class ControladorInicio {

    // @Value("${index.saludo}")
    // private String saludo;    

    @GetMapping("/")
    public String inicio(Model model) {    
        var mensaje = "Hola hola con thymeleaf";

        var persona = new Persona();
        persona.setNombre("Gabriel");
        persona.setApellido("Sanchez");
        persona.setEmail("gso2090@gmail.com");
        persona.setTelefono("123123123");
        var persona2 = new Persona();
        persona2.setNombre("Pedro");
        persona2.setApellido("Pipi");
        persona2.setEmail("trolloosoorigen@gmail.com");
        persona2.setTelefono("8363617");
        
        List<Persona> personas = new ArrayList<>();
        personas.add(persona);
        personas.add(persona2);

        log.info("ejecutando controaldor Spring MVC");
        // model.addAttribute("persona2", persona2);
        // model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        model.addAttribute("mensaje", mensaje);
        // model.addAttribute("saludo", saludo);
        return "index";
    }

}
