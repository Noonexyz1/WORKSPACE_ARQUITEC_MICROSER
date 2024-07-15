package org.example;

import org.example.application.config.AplicationConfigImpl;
import org.example.application.config.AplicationConfigService;
import org.example.application.implement.ValueObjectUseCaseImpl;
import org.example.application.service.AbogadoService;
import org.example.application.service.AbogadoServiceImpl;

import org.example.domain.model.Abogado;
import org.example.domain.useCase.ValueObjectUseCase;
import org.example.domain.valueObject.AbogadoEmail;
import org.example.domain.valueObject.AbogadoId;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");

        ValueObjectUseCase toValidate = new ValueObjectUseCaseImpl();
        AbogadoId idToPas = new AbogadoId("400000", toValidate);
        AbogadoEmail emailToPas = new AbogadoEmail("asd@asdf.com", toValidate);

        Abogado abo = new Abogado(idToPas, "Diego", emailToPas);*/


        //simulando la infraEstructura, primero es necesario utilizar mi injector de dependencia
        //asi la infraestructura no usa la interfaz del dominio ni tampoco la implementa
        //somalemente la usar para utilizar una implementacion existente, en este caso
        //el paquete config actua como un injectador de comportamiento
        AplicationConfigService appConfig = new AplicationConfigImpl();

        AbogadoService abogadoService = new AbogadoServiceImpl(appConfig.abogadoUseCase());

        System.out.println(abogadoService.encontrarCasoService(2L));
        System.out.println(abogadoService.listarCasosService());
        abogadoService.guardarNuevoCasoService("Caso Sanches");
        System.out.println(abogadoService.listarCasosService());
    }
}