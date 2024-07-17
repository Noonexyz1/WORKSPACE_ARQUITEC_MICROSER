package org.example.application.config;

import org.example.application.implement.AbogadoUseCaseImpl;
import org.example.application.implement.ValueObjectUseCaseImpl;
import org.example.domain.useCase.AbogadoUseCase;
import org.example.domain.useCase.ValueObjectUseCase;

//no necesito implementar esto, ya que esta injection se la hara con el framework
public class AplicationConfigImpl implements AplicationConfigService{

    @Override
    public AbogadoUseCase abogadoUseCase(){
        return new AbogadoUseCaseImpl();
    }

    @Override
    public ValueObjectUseCase valueObjectUseCase(){
        return new ValueObjectUseCaseImpl();
    }
}
