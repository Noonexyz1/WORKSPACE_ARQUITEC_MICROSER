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
        abogados.add(new AbogadoDTO("AAA", "2", "3"));
        abogados.add(new AbogadoDTO("BBB", "2", "3"));
        abogados.add(new AbogadoDTO("CCC", "2", "3"));
        abogados.add(new AbogadoDTO("DDD", "2", "3"));
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
