package org.example.application.implement;

import org.example.domain.useCase.AbogadoUseCase;

import java.util.List;

//esta es mi logica
public class AbogadoImpAdapter implements AbogadoUseCase {

    //Estoy dependiendo de una ABSTRACCION futura, no importa de que tipo sea esta persistencia
    //Esta interfaz la exporto como puerto a la infraestructura
    private RepositoryAbogado repositoryAbogado;

    public AbogadoImpAdapter(RepositoryAbogado repositoryAbogado){
        this.repositoryAbogado = repositoryAbogado;
    }

    @Override
    public List<String> listaAbogados() {
        //demas logica antes de traer los abogados por ejemplo
        return repositoryAbogado.getAllAbogados();
    }

    @Override
    public void nuevoAbogado(String nombre) {
        //demas logica antes de guardar un abogado nuevo
        repositoryAbogado.saveNewAbogado(nombre);
    }
}
