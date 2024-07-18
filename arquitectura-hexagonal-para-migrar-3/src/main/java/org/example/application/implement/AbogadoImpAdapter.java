package org.example.application.implement;

import org.example.application.dto.AbogadoDTO;
import org.example.domain.model.Abogado;
import org.example.domain.useCase.AbogadoUseCase;

import java.util.ArrayList;
import java.util.List;

//esta es mi logica, implementando el puerto AbogadoUseCase de Domain
public class AbogadoImpAdapter implements AbogadoUseCase {

    //Estoy dependiendo de una ABSTRACCION futura, no importa de que tipo sea esta persistencia
    //Esta interfaz la exporto como puerto a la infraestructura
    private AbogadoService abogadoService;

    public AbogadoImpAdapter(AbogadoService repositoryAbogado){
        this.abogadoService = repositoryAbogado;
    }

    @Override
    public List<Abogado> listaAbogados() {
        List<Abogado> listAbogado = new ArrayList<>();
        List<AbogadoDTO> listAbogadoDto = abogadoService.getAllAbogados();

        for(AbogadoDTO abogadoDTO: listAbogadoDto){
            Abogado abogado = new Abogado(abogadoDTO.getId(), abogadoDTO.getNombre(), abogadoDTO.getEmail());
            listAbogado.add(abogado);
        }

        return listAbogado;
    }

    @Override
    public void nuevoAbogado(Abogado newAbogado) {
        AbogadoDTO abogadoDTO = new AbogadoDTO(newAbogado.getId(), newAbogado.getNombre(), newAbogado.getEmail());
        abogadoService.saveNewAbogado(abogadoDTO);
    }
}
