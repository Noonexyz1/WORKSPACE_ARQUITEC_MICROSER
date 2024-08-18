package org.example.infraestructure.rest;

import org.example.application.dto.AbogadoDTO;
import org.example.application.useCase.AbogadoMapper;
import org.example.application.useCase.AbogadoUseCaseService;
import org.example.infraestructure.rest.mapper.AbogadoInfraMapper;
import org.example.infraestructure.rest.model.AbogadoRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AbogadoRest {

    private AbogadoUseCaseService abogadoUseCaseService;
    //Estoy usando el servicio mapeador que me brinda application porque AbogadoUseCaseService necesita un model de dominio,
    //y yo no puedo usar desde infra directamente el dominio
    private AbogadoMapper abogadoMapper;
    private AbogadoInfraMapper abogadoInfraMapper;

    @Autowired
    public AbogadoRest(AbogadoUseCaseService abogadoUseCaseService, AbogadoMapper abogadoMapper, AbogadoInfraMapper abogadoInfraMapper){
        this.abogadoUseCaseService = abogadoUseCaseService;
        this.abogadoMapper = abogadoMapper;
        this.abogadoInfraMapper = abogadoInfraMapper;
    }


    @GetMapping("/abogados")
    public List<AbogadoRequest> getAllAbogadosRest() {
        List<AbogadoDTO> abogadoDTOS = abogadoUseCaseService.listaAbogados().stream()
                .map(abogadoMapper::abogadoToAbogadoDTO)
                .toList();

        List<AbogadoRequest> abogadoRequests = abogadoDTOS.stream()
                .map(abogadoInfraMapper::abogadoDTOToAbogadoRequest)
                .toList();
        return abogadoRequests;
    }

    @PostMapping("/guardar")
    public void saveNewAbogadoRest(AbogadoRequest nuevoAbogado) {
        AbogadoDTO nuevoAbogadoDTO = abogadoInfraMapper.abogadoRequestToAbogadoDTO(nuevoAbogado);
        abogadoUseCaseService.nuevoAbogado(abogadoMapper.abogadoDTOToAbogado(nuevoAbogadoDTO));
    }
}
