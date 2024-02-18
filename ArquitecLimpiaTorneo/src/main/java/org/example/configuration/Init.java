package org.example.configuration;

import org.example.adapter.persistence.TorneoRepositoryInMemory;
import org.example.adapter.view.console.Consola;
import org.example.adapter.view.console.MenuConsola;
import org.example.core.ports.input.IBuscarTorneosUseCase;
import org.example.core.ports.input.ICrearTorneoUseCase;
import org.example.core.ports.output.ITorneoRepository;
import org.example.core.usecases.BuscarTorneosUseCase;
import org.example.core.usecases.CrearTorneoUseCase;

/**
 * Punto de entrada Es el archivo "sucio" Instancia e inyecta los objetos
 * Inicializa la consola
 */
public class Init {

	public static void main(String[] args) {
		// Repositorios
		ITorneoRepository torneoRepository = new TorneoRepositoryInMemory();

		// Casos de uso
		ICrearTorneoUseCase crearTorneoUseCase = new CrearTorneoUseCase(torneoRepository);
		IBuscarTorneosUseCase buscarTorneosUseCase = new BuscarTorneosUseCase(torneoRepository);

		// Diseño MVC
		Consola consola = new Consola();
		MenuConsola menu = new MenuConsola(consola, buscarTorneosUseCase, crearTorneoUseCase);
		menu.iniciar();
		consola.cerrar();
	}
}
