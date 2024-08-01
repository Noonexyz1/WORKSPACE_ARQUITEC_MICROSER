package com.microser.application.impl;

import com.microser.application.dataCarrier.EstudianteDataCarry;
import com.microser.application.port.EstudianteService;
import com.microser.domain.model.Estudiante;
import com.microser.domain.port.Estudiable;

public class EstudianteImpl implements Estudiable {

    private EstudianteService estudianteService;

    public EstudianteImpl(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @Override
    public void guardarEstudiante(Estudiante estudiante) {
        EstudianteDataCarry estudianteDataCarry = new EstudianteDataCarry();
        estudianteDataCarry.setId(estudiante.getId());
        estudianteDataCarry.setNombre(estudiante.getNombre());
        estudianteDataCarry.setDireccion(estudiante.getDireccion());
        estudianteService.guardarEstudianteService(estudianteDataCarry);
    }
}
