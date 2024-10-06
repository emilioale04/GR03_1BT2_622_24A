package com.mycompany.gestionplantasweb.model;

import javax.persistence.*;

/**
 *
 * @author Emilio
 */
@Entity
@Table(name = "plantas")
public class Planta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String especie;
    private String descripcion;

    // Constructores
    public Planta() {}

    public Planta(String nombre, String especie, String descripcion) {
        this.nombre = nombre;
        this.especie = especie;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    // Otros getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
