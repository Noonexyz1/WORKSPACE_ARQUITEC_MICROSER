package org.example.infraestructure.memory;

import org.example.application.dto.AbogadoDTO;
import org.example.application.implement.AbogadoService;

import java.util.ArrayList;
import java.util.List;

//uso de la tecnologia
public class RepoInMemoryAdapter implements AbogadoService {

    //Eso tranquilamente puede ser varios @Repository como dependencia
    private List<AbogadoDTO> abogados;

    public RepoInMemoryAdapter() {
        abogados = new ArrayList<>();
        abogados.add(new AbogadoDTO(1, "2", "3"));
        abogados.add(new AbogadoDTO(2, "2", "3"));
        abogados.add(new AbogadoDTO(3, "2", "3"));
        abogados.add(new AbogadoDTO(4, "2", "3"));
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
