package com.microser.application.impl;

import com.microser.application.dataCarrier.EstudianteDataCarry;
import com.microser.application.port.EstudianteService;
import com.microser.domain.model.Estudiante;
import com.microser.domain.port.Estudiable;

import java.util.List;

public class EstudianteImpl implements Estudiable {

    private EstudianteService estudianteService;

    public EstudianteImpl(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @Override
    public List<Estudiante> listaEstudiantes() {
        return estudianteService.listaEstudianteService()
                .stream()
                .map(this::convertEstudiante).toList();
    }

    private Estudiante convertEstudiante(EstudianteDataCarry estudianteDataCarry){
        Estudiante estudiante = new Estudiante();
        estudiante.setId(estudianteDataCarry.getId());
        estudiante.setNombre(estudianteDataCarry.getNombre());
        estudiante.setDireccion(estudianteDataCarry.getDireccion());
        return estudiante;
    }
}
