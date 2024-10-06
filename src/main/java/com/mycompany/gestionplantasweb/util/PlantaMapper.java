/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionplantasweb.util;

import com.mycompany.gestionplantasweb.dto.PlantaDTO;
import com.mycompany.gestionplantasweb.model.Planta;

/**
 *
 * @author Emilio
 */

public class PlantaMapper {

    public static PlantaDTO toDTO(Planta planta) {
        if (planta == null) {
            return null;
        }
        return new PlantaDTO(
            planta.getId(),
            planta.getNombre(),
            planta.getEspecie(),
            planta.getDescripcion()
        );
    }

    public static Planta toEntity(PlantaDTO plantaDTO) {
        if (plantaDTO == null) {
            return null;
        }
        Planta planta = new Planta();
        planta.setId(plantaDTO.getId());
        planta.setNombre(plantaDTO.getNombre());
        planta.setEspecie(plantaDTO.getEspecie());
        planta.setDescripcion(plantaDTO.getDescripcion());
        return planta;
    }
}

