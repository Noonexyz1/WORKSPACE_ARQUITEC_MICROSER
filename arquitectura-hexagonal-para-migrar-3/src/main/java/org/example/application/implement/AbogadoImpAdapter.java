package org.example.application.implement;

import org.example.application.useCase.AbogadoPersistence;
import org.example.application.useCase.AbogadoUseCaseService;
import org.example.domain.model.Abogado;

import java.util.List;

//esta es mi logica, implementando el puerto AbogadoUseCase de Domain
public class AbogadoImpAdapter implements AbogadoUseCaseService {

    //Estoy dependiendo de una ABSTRACCION futura, no importa de que tipo sea esta persistencia
    //Esta interfaz la exporto como puerto a la infraestructura
    private AbogadoPersistence abogadoPersistence;

    public AbogadoImpAdapter(AbogadoPersistence repositoryAbogado){
        this.abogadoPersistence = repositoryAbogado;
    }

    @Override
    public List<Abogado> listaAbogados() {
        return abogadoPersistence.getAllAbogados();
    }

    @Override
    public void nuevoAbogado(Abogado newAbogado) {
        abogadoPersistence.saveNewAbogado(newAbogado);
    }
}
