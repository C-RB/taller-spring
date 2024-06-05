package com.ufro.taller.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
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



@Table(name ="campeon")
public class Campeon {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id_campeon;

    private String tipo_ataque;
    @Column(name = "vida")
    private int vida;
    @Column(name = "mana_bool")
    private int mana_bool;
    @Column(name = "energia_bool")
    private int energia_bool;
    @Column(name = "velocidad_ataque_base")
    private float velocidad_ataque_base;
    @Column(name = "velocidad_movimiento_base")
    private int  velocidad_movimiento_base;
    @Column(name = "nombre")
    private String nombre;


    @ManyToOne
    @JoinColumn(name= "counter_id")
    private Counter counter;

    @ManyToOne
    @JoinColumn(name= "rival_id_rival")
    private Rival rival;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nacionalidad_id", referencedColumnName = "id")
    private Nacionalidad nacionalidad;

    @OneToOne(mappedBy = "campeon", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Especie especie;

}
