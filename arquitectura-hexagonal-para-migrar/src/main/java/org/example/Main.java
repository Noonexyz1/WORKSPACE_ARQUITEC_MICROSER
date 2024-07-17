package org.example;

import org.example.application.config.AplicationConfigImpl;
import org.example.application.config.AplicationConfigService;
import org.example.application.implement.AbogadoUseCaseImpl;
import org.example.application.implement.ValueObjectUseCaseImpl;
import org.example.application.service.AbogadoService;
import org.example.application.service.AbogadoServiceImpl;

import org.example.domain.model.Abogado;
import org.example.domain.useCase.AbogadoUseCase;
import org.example.domain.useCase.ValueObjectUseCase;
import org.example.domain.valueObject.AbogadoEmail;
import org.example.domain.valueObject.AbogadoId;

public class Main {

    //Simulando codigo de la capa Infraestructura
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*ValueObjectUseCase toValidate = new ValueObjectUseCaseImpl();
        AbogadoId idToPas = new AbogadoId("400000", toValidate);
        AbogadoEmail emailToPas = new AbogadoEmail("asd@asdf.com", toValidate);
        Abogado abo = new Abogado(idToPas, "Diego", emailToPas);*/


        //simulando la infraEstructura, primero es necesario utilizar mi injector de dependencia
        //asi la infraestructura no usa la interfaz del dominio ni tampoco la implementa
        //somalemente la usar para utilizar una implementacion existente, en este caso
        //el paquete config actua como un injectador de comportamiento

        //Metodo de crear un injector de dependecias en la capa de application (paquete config ejemplo)
        //AplicationConfigService appConfig = new AplicationConfigImpl();
        //AbogadoService abogadoService = new AbogadoServiceImpl(appConfig.abogadoUseCase());

        //Simulacion de @Beans, esto es de la infraestructura
        //como se ve, esta aun conoce los DETALLES del dominio pero en esta capa de Infrastructura
        //Una solucion es mover la interfaz de AbogadoUseCase del dominio a la capa de APPLICATION
        AbogadoUseCase useCase = new AbogadoUseCaseImpl();

        //O tambien puede ser asi, y esto ya no conoce el Dominio :)
        //AbogadoUseCaseImpl useCase = new AbogadoUseCaseImpl();

        //Uso de la capa Application
        AbogadoService servicio = new AbogadoServiceImpl(useCase);

        System.out.println(servicio.encontrarCasoService(2L));
        System.out.println(servicio.listarCasosService());
        servicio.guardarNuevoCasoService("Caso Sanches");
        System.out.println(servicio.listarCasosService());
    }
}