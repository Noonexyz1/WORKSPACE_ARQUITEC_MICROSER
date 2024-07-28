package org.example.domain.useCase;

import org.example.domain.model.Abogado;

import java.util.List;

//Estos casos de uso ya nos da una idea fuerte implicita, que de algun lado (repositorio),
//debe traer esta informacion, no le importa como logicamente, solo que lo haga
//Entonces: esto va de salida verdad
public interface AbogadoUseCase {
    List<Abogado> listaAbogados();
    void nuevoAbogado(Abogado nuevoAbogado);
}
