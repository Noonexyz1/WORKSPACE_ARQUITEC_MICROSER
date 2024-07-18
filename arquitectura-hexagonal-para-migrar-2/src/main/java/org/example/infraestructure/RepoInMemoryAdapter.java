package org.example.infraestructure;

import org.example.application.implement.RepositoryAbogado;

import java.util.ArrayList;
import java.util.List;

//uso de la tecnologia
public class RepoInMemoryAdapter implements RepositoryAbogado {

    //Eso tranquilamente puede ser varios @Repository como dependencia
    private List<String> abogados;

    public RepoInMemoryAdapter() {
        abogados = new ArrayList<>();
        abogados.add("Diego");
        abogados.add("Carlos");
        abogados.add("Juana");
        abogados.add("Laura");
    }

    @Override
    public List<String> getAllAbogados() {
        return this.abogados;
    }

    @Override
    public void saveNewAbogado(String nombre) {
        abogados.add(nombre);
    }
}
