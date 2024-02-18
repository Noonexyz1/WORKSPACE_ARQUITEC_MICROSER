package org.example.core.ports.input;

import java.util.List;

import org.example.core.entities.Torneo;

public interface IBuscarTorneosUseCase {

	public Torneo buscarPorId(int id);
	
	public List<Torneo> buscarTodos();

}
