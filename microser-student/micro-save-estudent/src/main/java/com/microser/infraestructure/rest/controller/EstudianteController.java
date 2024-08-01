package com.microser.infraestructure.rest.controller;

import com.microser.application.dataCarrier.EstudianteDataCarry;
import com.microser.application.port.EstudianteService;
import com.microser.infraestructure.rest.response.EstudianteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @PostMapping("/estudent")
    public void guardarEstudianteRest(@RequestBody EstudianteRequest estudianteRequest){
        EstudianteDataCarry estudianteDataCarry = new EstudianteDataCarry();
        estudianteDataCarry.setNombre(estudianteRequest.getNombre());
        estudianteDataCarry.setDireccion(estudianteRequest.getDireccion());
        estudianteService.guardarEstudianteService(estudianteDataCarry);
    }
}
