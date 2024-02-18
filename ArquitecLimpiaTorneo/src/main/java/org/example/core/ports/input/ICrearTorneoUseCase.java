package org.example.core.ports.input;

import org.example.core.entities.Torneo;

public interface ICrearTorneoUseCase {

	public Torneo crearTorneo(String nombre);
}
