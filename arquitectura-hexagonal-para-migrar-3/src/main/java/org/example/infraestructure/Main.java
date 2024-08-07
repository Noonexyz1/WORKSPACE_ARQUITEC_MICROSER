package org.example.infraestructure;

import org.example.application.dto.AbogadoDTO;
import org.example.application.implement.AbogadoService;
import org.example.infraestructure.db.RepoHibernateMariaDB;
import org.example.infraestructure.db.util.HibernateUtil;
import org.example.infraestructure.memory.RepoAdapterAPIExterior;
import org.example.infraestructure.memory.RepoInMemoryAdapter;
import org.example.infraestructure.memory.RepoInMemoryAdapter2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        HibernateUtil hibernateUtil = new HibernateUtil("hibernate1.cfg.xml");
        AbogadoService abogadoService = new RepoHibernateMariaDB(hibernateUtil.getSessionFactory());
        //AbogadoService abogadoService = new RepoAdapterAPIExterior();
        //AbogadoService abogadoService = new RepoInMemoryAdapter();
        //AbogadoService abogadoService = new RepoInMemoryAdapter2();

        abogadoService.saveNewAbogado(new AbogadoDTO(1 /*Este id es AUTOINCREMENT, no hace falta*/, "Diego D.", "diego@diego.com"));

        System.out.println("Lista de abogados:");
        for (AbogadoDTO abogadoDTO : abogadoService.getAllAbogados()) {
            System.out.println("ID: " + abogadoDTO.getId() + ", Nombre: " + abogadoDTO.getNombre() + ", Email: " + abogadoDTO.getEmail());
        }

        hibernateUtil.shutdown();
    }
}