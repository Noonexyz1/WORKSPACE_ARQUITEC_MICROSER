package org.example.infraestructure;

import org.example.application.dto.AbogadoDTO;
import org.example.application.useCase.AbogadoPersistence;
import org.example.infraestructure.db.RepoHibernateMariaDB;
import org.example.infraestructure.db.util.HibernateUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        HibernateUtil hibernateUtil = new HibernateUtil("hibernate1.cfg.xml");
        AbogadoPersistence abogadoPersistence = new RepoHibernateMariaDB(hibernateUtil.getSessionFactory());
        //AbogadoService abogadoService = new RepoAdapterAPIExterior();
        //AbogadoService abogadoService = new RepoInMemoryAdapter();
        //AbogadoService abogadoService = new RepoInMemoryAdapter2();

        abogadoPersistence.saveNewAbogado(new AbogadoDTO(1 /*Este id es AUTOINCREMENT, no hace falta*/, "Diego D.", "diego@diego.com"));

        System.out.println("Lista de abogados:");
        for (AbogadoDTO abogadoDTO : abogadoPersistence.getAllAbogados()) {
            System.out.println("ID: " + abogadoDTO.getId() + ", Nombre: " + abogadoDTO.getNombre() + ", Email: " + abogadoDTO.getEmail());
        }

        hibernateUtil.shutdown();
    }
}