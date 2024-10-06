package com.mycompany.gestionplantasweb.dto;

/**
 *
 * @author Emilio
 */
public class PlantaDTO {
    private int id;
    private String nombre;
    private String especie;
    private String descripcion;

    // Constructores
    public PlantaDTO() {}

    public PlantaDTO(int id, String nombre, String especie, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
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
