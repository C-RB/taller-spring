package com.ufro.taller.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table (name = "especie")
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especie")
    private Integer id_especie;
    @Column(name = "nombre")
    private String nombre;

    @OneToOne
    @MapsId
    @JoinColumn(name = "counter_id")
    private Counter counter;


    @OneToOne
    @MapsId
    @JoinColumn(name = "especie_id")
    private Especie espcie;
}
