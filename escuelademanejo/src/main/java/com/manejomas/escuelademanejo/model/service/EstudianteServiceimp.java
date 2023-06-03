package com.manejomas.escuelademanejo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manejomas.escuelademanejo.model.dao.IEstudianteDAO;
import com.manejomas.escuelademanejo.model.entidad.Estudiante;

@Service
public class EstudianteServiceimp implements IEstudianteService {
    @Autowired
    private IEstudianteDAO estudianteDAO;

    @Override
    public void guardarEstudiante(Estudiante estudiante) {
        estudianteDAO.save(estudiante);
    }

}
