package com.api.personas.personasapi.controllers;

import com.api.personas.personasapi.models.Persona;
import com.api.personas.personasapi.services.PersonaService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    public PersonaService personaService;
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping
    public Persona savePersona(@RequestBody @Valid Persona persona){
        return personaService.savePersona(persona);
    }

    @GetMapping
    public List<Persona> getPersonas(){
        return personaService.getAllPersonas();
    }

    @GetMapping("/{id}")
    public Persona getPersonaById(@PathVariable Long id){
        return personaService.getPersonaById(id);
    }

    @PutMapping("/{id}")
    public Persona updatePersona(@PathVariable Long id, @RequestBody Persona persona){
        return personaService.updatePersona(id, persona);
    }

    @DeleteMapping("/{id}")
    public void deletePersonaById(@PathVariable Long id){
        personaService.deletePersonaById(id);
    }
}
