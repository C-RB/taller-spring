package com.ufro.taller.models;

import java.util.Set;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor

@Entity

public class Rival {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rival")
    private Integer id_rival;
    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "campeon")
    private Set<Campeon> campeones;

    @OneToOne(mappedBy = "rival", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Especie especie;
}
