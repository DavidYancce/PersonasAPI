package com.api.personas.personasapi.repositories;

import com.api.personas.personasapi.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
