package org.example.application.service;

import java.util.List;

//podriamos decir que esto tambien forma parte del dominio pero lo ponemos en application porque contiene logica
//en un futuro, solamente migramos de infrastructura llevandonos la aplicacion y el dominio, la application
//depende de dominio, dominio no depende de nada, puede existir solo
public interface AbogadoService {
    List<String> listarCasosService();
    String encontrarCasoService(Long index);
    void guardarNuevoCasoService(String caso);
}
