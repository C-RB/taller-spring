package com.ufro.taller.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity

public class Interaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_interaccion;
    private String nombre_interacion;
    private int limite_interacion;
    
}
