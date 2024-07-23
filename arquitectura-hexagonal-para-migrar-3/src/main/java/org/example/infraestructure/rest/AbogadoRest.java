package org.example.infraestructure.rest;

import org.example.application.dto.AbogadoDTO;
import org.example.application.implement.AbogadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AbogadoRest {

    @Autowired
    private AbogadoService abogadoService;

    public AbogadoRest(AbogadoService abogadoService){
        this.abogadoService = abogadoService;
    }


    @GetMapping("/abogados")
    public List<AbogadoDTO> getAllAbogadosRest() {
        return abogadoService.getAllAbogados();
    }

    @PostMapping("/guardar")
    public void saveNewAbogadoRest(AbogadoDTO nuevoAbogado) {
        abogadoService.saveNewAbogado(nuevoAbogado);
    }
}
