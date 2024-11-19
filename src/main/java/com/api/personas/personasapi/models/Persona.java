package com.api.personas.personasapi.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity()
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @Column
    @NotBlank(message = "El apellido paterno es obligatorio")
    private String apellidoPaterno;

    @Column
    @NotBlank(message = "El apellido materno es obligatorio")
    private String apellidoMaterno;

    @Column
    @Min(value = 0, message = "La edad debe ser mayor o igual a cero")
    private Integer edad;

    @Column
    @NotBlank(message = "La direccion es obligatoria")
    private String direccion;

    @Column
    @NotBlank(message = "El telefono es obligatorio")
    private String telefono;
}