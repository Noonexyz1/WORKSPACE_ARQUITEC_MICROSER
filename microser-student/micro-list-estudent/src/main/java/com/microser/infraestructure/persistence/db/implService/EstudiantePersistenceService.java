package com.microser.infraestructure.persistence.db.implService;

import com.microser.application.dataCarrier.EstudianteDataCarry;
import com.microser.application.port.EstudianteService;
import com.microser.infraestructure.persistence.db.entities.Estudiante;
import com.microser.infraestructure.persistence.db.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudiantePersistenceService implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<EstudianteDataCarry> listaEstudianteService() {
        return estudianteRepository.findAll().stream().map(this::convertEstudiante).toList();
    }

    private EstudianteDataCarry convertEstudiante(Estudiante estudianteDataCarry){
        EstudianteDataCarry estudiante = new EstudianteDataCarry();
        estudiante.setId(estudianteDataCarry.getId());
        estudiante.setNombre(estudianteDataCarry.getNombre());
        estudiante.setDireccion(estudianteDataCarry.getDireccion());
        return estudiante;
    }
}
