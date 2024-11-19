package com.api.personas.personasapi.services;

import com.api.personas.personasapi.models.Persona;
import java.util.List;

public interface IPersonaService {
    public Persona savePersona(Persona persona);

    public Persona updatePersona(Long id, Persona persona);

    public List<Persona> getAllPersonas();

    public Persona getPersonaById(Long id);

    public void deletePersonaById(Long id);
}
