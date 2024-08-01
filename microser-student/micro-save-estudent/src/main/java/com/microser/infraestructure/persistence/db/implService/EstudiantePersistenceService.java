package com.microser.infraestructure.persistence.db.implService;

import com.microser.application.dataCarrier.EstudianteDataCarry;
import com.microser.application.port.EstudianteService;
import com.microser.infraestructure.persistence.db.entities.Estudiante;
import com.microser.infraestructure.persistence.db.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudiantePersistenceService implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public void guardarEstudianteService(EstudianteDataCarry estudiante) {
        Estudiante estudiantePersistence = new Estudiante();
        estudiantePersistence.setNombre(estudiante.getNombre());
        estudiantePersistence.setDireccion(estudiante.getDireccion());
        estudianteRepository.save(estudiantePersistence);
    }
}
