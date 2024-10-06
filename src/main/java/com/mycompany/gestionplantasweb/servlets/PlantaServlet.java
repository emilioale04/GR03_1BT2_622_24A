/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionplantasweb.servlets;

import com.mycompany.gestionplantasweb.dao.PlantaDAO;
import com.mycompany.gestionplantasweb.dto.PlantaDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Emilio
 */
@WebServlet("/plantas")
public class PlantaServlet extends HttpServlet {

    private PlantaDAO plantaDAO;

    @Override
    public void init() {
        plantaDAO = new PlantaDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if (accion == null) {
            accion = "listar";
        }

        switch (accion) {
            case "nuevo":
                mostrarFormularioNuevo(request, response);
                break;
            case "insertar":
                insertarPlanta(request, response);
                break;
            case "eliminar":
                eliminarPlanta(request, response);
                break;
            default:
                listarPlantas(request, response);
                break;
        }
    }

    private void listarPlantas(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<PlantaDTO> listaPlantas = plantaDAO.listarPlantas();
        request.setAttribute("listaPlantas", listaPlantas);
        request.getRequestDispatcher("listarPlantas.jsp").forward(request, response);
    }

    private void mostrarFormularioNuevo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("agregarPlanta.jsp").forward(request, response);
    }

    private void insertarPlanta(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String nombre = request.getParameter("nombre");
        String especie = request.getParameter("especie");
        String descripcion = request.getParameter("descripcion");

        PlantaDTO nuevaPlanta = new PlantaDTO();
        nuevaPlanta.setNombre(nombre);
        nuevaPlanta.setEspecie(especie);
        nuevaPlanta.setDescripcion(descripcion);

        plantaDAO.guardarPlanta(nuevaPlanta);
        response.sendRedirect("plantas");
    }

    private void eliminarPlanta(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        plantaDAO.eliminarPlanta(id);
        response.sendRedirect("plantas");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
