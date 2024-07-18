package org.example.infraestructure;

import org.example.application.implement.RepositoryAbogado;

import java.util.ArrayList;
import java.util.List;

//uso de la tecnologia
public class RepoInMemoryAdapter2 implements RepositoryAbogado {

    //Eso tranquilamente puede ser varios @Repository como dependencia
    private List<String> abogados;

    public RepoInMemoryAdapter2() {
        abogados = new ArrayList<>();
        abogados.add("Homero");
        abogados.add("Bart");
        abogados.add("Lisa");
        abogados.add("Maguie");
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
