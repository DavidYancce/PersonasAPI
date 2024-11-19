package com.api.personas.personasapi.services;

import com.api.personas.personasapi.models.Persona;
import com.api.personas.personasapi.repositories.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    private final PersonaRepository personaRepository;
    public PersonaService(PersonaRepository personaRepository ) {
        this.personaRepository = personaRepository;
    }

    public Persona savePersona(Persona persona){
        return this.personaRepository.save(persona);
    }


    public Persona updatePersona(Long id, Persona persona) {
        Persona personaExistente = this.personaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Persona no encontrada"));

        personaExistente.setNombre(persona.getNombre());
        personaExistente.setApellidoPaterno(persona.getApellidoPaterno());
        personaExistente.setApellidoMaterno(persona.getApellidoMaterno());
        personaExistente.setEdad(persona.getEdad());
        personaExistente.setDireccion(persona.getDireccion());
        personaExistente.setTelefono(persona.getTelefono());

        return personaRepository.save(personaExistente);
    }

    public List<Persona> getAllPersonas(){
        return this.personaRepository.findAll();
    }

    public Persona getPersonaById(Long id){
        return this.personaRepository.findById(id).orElse(null);
    }

    public void deletePersonaById(Long id){
        this.personaRepository.deleteById(id);
    }
}
