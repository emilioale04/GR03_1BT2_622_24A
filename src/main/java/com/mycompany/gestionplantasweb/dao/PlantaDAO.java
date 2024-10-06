
package com.mycompany.gestionplantasweb.dao;

import com.mycompany.gestionplantasweb.dto.PlantaDTO;
import com.mycompany.gestionplantasweb.model.Planta;
import com.mycompany.gestionplantasweb.util.PlantaMapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author Emilio
 */
public class PlantaDAO {

    private SessionFactory factory;

    public PlantaDAO() {
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    public void guardarPlanta(PlantaDTO plantaDTO) {
        Session session = factory.openSession();
        session.beginTransaction();
        Planta planta = PlantaMapper.toEntity(plantaDTO);
        session.save(planta);
        session.getTransaction().commit();
        session.close();
    }

    public List<PlantaDTO> listarPlantas() {
        Session session = factory.openSession();
        List<Planta> plantas = session.createQuery("from Planta", Planta.class).list();
        session.close();
        return plantas.stream()
                      .map(PlantaMapper::toDTO)
                      .collect(Collectors.toList());
    }

    public PlantaDTO obtenerPlanta(int id) {
        Session session = factory.openSession();
        Planta planta = session.get(Planta.class, id);
        session.close();
        return PlantaMapper.toDTO(planta);
    }

    public void eliminarPlanta(int id) {
        Session session = factory.openSession();
        session.beginTransaction();
        Planta planta = session.get(Planta.class, id);
        if (planta != null) {
            session.delete(planta);
        }
        session.getTransaction().commit();
        session.close();
    }
}
