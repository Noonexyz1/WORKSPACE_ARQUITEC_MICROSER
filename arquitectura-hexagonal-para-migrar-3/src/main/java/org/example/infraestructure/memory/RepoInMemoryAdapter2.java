package org.example.infraestructure.memory;

import org.example.application.dto.AbogadoDTO;
import org.example.application.implement.AbogadoService;

import java.util.ArrayList;
import java.util.List;

//uso de la tecnologia
public class RepoInMemoryAdapter2 implements AbogadoService {

    //Eso tranquilamente puede ser varios @Repository como dependencia
    private List<AbogadoDTO> abogados;

    public RepoInMemoryAdapter2() {
        abogados = new ArrayList<>();
        abogados.add(new AbogadoDTO("44444", "2", "3"));
        abogados.add(new AbogadoDTO("55555", "2", "3"));
        abogados.add(new AbogadoDTO("66666", "2", "3"));
        abogados.add(new AbogadoDTO("77777", "2", "3"));
    }

    @Override
    public List<AbogadoDTO> getAllAbogados() {
        return this.abogados;
    }

    @Override
    public void saveNewAbogado(AbogadoDTO nuevoAbogado) {
        abogados.add(nuevoAbogado);
    }
}
