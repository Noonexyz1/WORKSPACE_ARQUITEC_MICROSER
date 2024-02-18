package org.example.core.usecases;

import org.example.core.entities.Torneo;
import org.example.core.ports.input.IBuscarTorneosUseCase;
import org.example.core.ports.output.ITorneoRepository;

import java.util.List;

public class BuscarTorneosUseCase implements IBuscarTorneosUseCase {

	private final ITorneoRepository torneoRepository;
	
	public BuscarTorneosUseCase(ITorneoRepository torneoRepository) {
		this.torneoRepository = torneoRepository;
	}

	@Override
	public Torneo buscarPorId(int id) {
		return torneoRepository.buscarPorId(id);
	}
	
	@Override
	public List<Torneo> buscarTodos() {
		return torneoRepository.buscarTodos();
	}
	
}
