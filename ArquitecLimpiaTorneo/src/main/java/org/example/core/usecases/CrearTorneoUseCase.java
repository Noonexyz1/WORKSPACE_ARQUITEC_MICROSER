package org.example.core.usecases;

import org.example.core.entities.Torneo;
import org.example.core.ports.input.ICrearTorneoUseCase;
import org.example.core.ports.output.ITorneoRepository;

import java.util.UUID;

public class CrearTorneoUseCase implements ICrearTorneoUseCase {

	private final ITorneoRepository torneoRepository;
	
	public CrearTorneoUseCase(ITorneoRepository torneoRepository) {
		this.torneoRepository = torneoRepository;
	}

	@Override
	public Torneo crearTorneo(String nombre) {
		long uuid = UUID.randomUUID().getMostSignificantBits();
		int shortenedInteger = (int) (uuid & 0xFFFFFFFF);
		Torneo t = new Torneo(shortenedInteger, nombre);
		torneoRepository.guardar(t);
		return t;
	}
	
	
}
