package org.example.infraestructure;

import org.example.application.dto.AbogadoDTO;
import org.example.application.implement.AbogadoService;
import org.example.infraestructure.db.RepoHibernateMariaDB;
import org.example.infraestructure.db.util.HibernateUtil;
import org.example.infraestructure.memory.RepoAdapterAPIExterior;
import org.example.infraestructure.memory.RepoInMemoryAdapter;
import org.example.infraestructure.memory.RepoInMemoryAdapter2;

public class Main {
    public static void main(String[] args) {
        //Implementando BD

        // Inicializa HibernateUtil
        //HibernateUtil hibernateUtil = new HibernateUtil("hibernate.cfg.xml");

        //Crea una instancia de RepoHibernateMariaDB
        //puerto de mi Application  =  Implementacion de mi Adapter Infrastructure (esto es lo unico que cambia)
        //CAMBIANDO DE IMPLEMENTACION
        //AbogadoService abogadoService = new RepoHibernateMariaDB(hibernateUtil.getSessionFactory());
        //AbogadoService abogadoService = new RepoAdapterAPIExterior();
        AbogadoService abogadoService = new RepoInMemoryAdapter();
        //AbogadoService abogadoService = new RepoInMemoryAdapter2();

        // Ejemplo de uso de saveNewAbogado
        abogadoService.saveNewAbogado(new AbogadoDTO("Juan Pérez", "12", "3"));

        // Ejemplo de uso de getAllAbogados
        System.out.println("Lista de abogados:");
        for (AbogadoDTO abogadoDTO : abogadoService.getAllAbogados()) {
            System.out.println("ID: " + abogadoDTO.getId() + ", Nombre: " + abogadoDTO.getNombre() + ", Email: " + abogadoDTO.getEmail());
        }

        // Cierra la SessionFactory
        //hibernateUtil.shutdown();

    }
}