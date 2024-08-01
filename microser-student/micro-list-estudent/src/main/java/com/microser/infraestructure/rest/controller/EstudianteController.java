package com.microser.infraestructure.rest.controller;

import com.microser.application.dataCarrier.EstudianteDataCarry;
import com.microser.application.port.EstudianteService;
import com.microser.infraestructure.persistence.db.entities.Estudiante;
import com.microser.infraestructure.rest.response.EstudianteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/list")
    public List<EstudianteResponse> guardarEstudianteRest(){
        return estudianteService.listaEstudianteService().stream().map(this::convertEstudiante).toList();
    }

    private EstudianteResponse convertEstudiante(EstudianteDataCarry estudianteDataCarry){
        EstudianteResponse estudiante = new EstudianteResponse();
        estudiante.setId(estudianteDataCarry.getId());
        estudiante.setNombre(estudianteDataCarry.getNombre());
        estudiante.setDireccion(estudianteDataCarry.getDireccion());
        return estudiante;
    }
}
