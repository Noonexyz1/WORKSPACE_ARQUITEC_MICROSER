package org.example.infraestructure.rest;

import org.example.application.dto.AbogadoDTO;
import org.example.application.useCase.AbogadoMapper;
import org.example.application.useCase.AbogadoUseCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AbogadoRest {

    private AbogadoUseCaseService abogadoUseCaseService;
    private AbogadoMapper abogadoMapper;

    @Autowired
    public AbogadoRest(AbogadoUseCaseService abogadoUseCaseService, AbogadoMapper abogadoMapper){
        this.abogadoUseCaseService = abogadoUseCaseService;
        this.abogadoMapper = abogadoMapper;
    }


    @GetMapping("/abogados")
    public List<AbogadoDTO> getAllAbogadosRest() {
        return abogadoUseCaseService.listaAbogados().stream()
                .map(abogadoMapper::abogadoToAbogadoDTO)
                .toList();
    }

    @PostMapping("/guardar")
    public void saveNewAbogadoRest(AbogadoDTO nuevoAbogado) {
        abogadoUseCaseService.nuevoAbogado(abogadoMapper.abogadoDTOToAbogado(nuevoAbogado));
    }
}
