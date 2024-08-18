package org.example.infraestructure.rest;

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
    private AbogadoInfraMapper abogadoInfraMapper;

    @Autowired
    public AbogadoRest(AbogadoUseCaseService abogadoUseCaseService, AbogadoInfraMapper abogadoInfraMapper){
        this.abogadoUseCaseService = abogadoUseCaseService;
        this.abogadoInfraMapper = abogadoInfraMapper;
    }


    @GetMapping("/abogados")
    public List<AbogadoRequest> getAllAbogadosRest() {
        return abogadoUseCaseService.listaAbogados().stream()
                .map(x -> abogadoInfraMapper.abogadoToAbogadoRequest(x))
                .toList();
    }

    @PostMapping("/guardar")
    public void saveNewAbogadoRest(AbogadoRequest nuevoAbogado) {
        abogadoUseCaseService.nuevoAbogado(abogadoInfraMapper.abogadoRequestToAbogado(nuevoAbogado));
    }
}
