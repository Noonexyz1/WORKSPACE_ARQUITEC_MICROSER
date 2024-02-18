package org.example.core.ports.output;

import org.example.core.entities.Torneo;

import java.util.List;

public interface ITorneoRepository {

	public Torneo buscarPorId(int id);

	public List<Torneo> buscarTodos();

	public void guardar(Torneo torneo);
	
}
