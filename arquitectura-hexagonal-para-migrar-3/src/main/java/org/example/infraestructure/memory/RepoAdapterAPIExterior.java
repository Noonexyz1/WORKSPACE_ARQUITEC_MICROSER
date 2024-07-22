package org.example.infraestructure.memory;

import org.example.application.dto.AbogadoDTO;
import org.example.application.implement.AbogadoService;

import java.util.ArrayList;
import java.util.List;

//uso de la tecnologia
public class RepoAdapterAPIExterior implements AbogadoService {

    //Eso tranquilamente puede ser varios @Repository como dependencia
    private List<AbogadoDTO> abogados;

    public RepoAdapterAPIExterior() {
        abogados = new ArrayList<>();
        abogados.add(new AbogadoDTO(111, "2", "3"));
        abogados.add(new AbogadoDTO(222, "2", "3"));
        abogados.add(new AbogadoDTO(333, "2", "3"));
        abogados.add(new AbogadoDTO(444, "2", "3"));
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
