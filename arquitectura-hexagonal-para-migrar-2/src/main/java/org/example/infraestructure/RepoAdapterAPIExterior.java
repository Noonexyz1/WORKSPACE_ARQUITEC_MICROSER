package org.example.infraestructure;

import org.example.application.implement.RepositoryAbogado;

import java.util.ArrayList;
import java.util.List;

//uso de la tecnologia
public class RepoAdapterAPIExterior implements RepositoryAbogado {

    //Eso tranquilamente puede ser varios @Repository como dependencia
    private List<String> abogados;

    public RepoAdapterAPIExterior() {
        abogados = new ArrayList<>();
        abogados.add("Api1");
        abogados.add("Api2");
        abogados.add("Api3");
        abogados.add("Api4");
        abogados.add("Api5");
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
