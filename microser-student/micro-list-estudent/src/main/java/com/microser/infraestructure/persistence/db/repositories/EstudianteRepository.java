package com.microser.infraestructure.persistence.db.repositories;

import com.microser.infraestructure.persistence.db.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
