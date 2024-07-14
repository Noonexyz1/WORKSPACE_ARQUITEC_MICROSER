package org.example;

import org.example.application.validator.AbogadoValueObjectValidator;
import org.example.domain.model.Abogado;
import org.example.domain.useCase.ValueObjectUseCase;
import org.example.domain.valueObject.AbogadoEmail;
import org.example.domain.valueObject.AbogadoId;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ValueObjectUseCase toValidate = new AbogadoValueObjectValidator();
        AbogadoId idToPas = new AbogadoId("400000", toValidate);
        AbogadoEmail emailToPas = new AbogadoEmail("asd@asdf.com", toValidate);

        Abogado abo = new Abogado(idToPas, "Diego", emailToPas);
    }
}