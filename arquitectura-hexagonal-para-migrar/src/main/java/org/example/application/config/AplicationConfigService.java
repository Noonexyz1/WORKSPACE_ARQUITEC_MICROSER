package org.example.application.config;

import org.example.domain.useCase.AbogadoUseCase;
import org.example.domain.useCase.ValueObjectUseCase;

//esto con la intencion de que
public interface AplicationConfigService {
    AbogadoUseCase abogadoUseCase();
    ValueObjectUseCase valueObjectUseCase();
}
