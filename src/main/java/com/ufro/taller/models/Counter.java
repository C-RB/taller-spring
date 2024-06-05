package com.ufro.taller.models;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name ="counter")
public class Counter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "porcentaje_victoria")
    private float porcentaje_victoria;
    @Column(name = "porcentaje_derrota")
    private float porcentaje_derrota;

    @OneToMany(mappedBy = "campeon")
    private Set<Campeon> campeones;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="nacionalidad_id", referencedColumnName = "id")
    private Nacionalidad nacionalidad;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="especie_id", referencedColumnName = "id")
    private Especie especie;

}
