package org.example.infraestructure.rest.config;

import org.example.application.implement.AbogadoService;
import org.example.infraestructure.db.RepoHibernateMariaDB;
import org.example.infraestructure.db.util.HibernateUtil;
import org.example.infraestructure.memory.RepoInMemoryAdapter;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AbogadoConfig {

    @Bean
    public AbogadoService beanAbogadoServiceBDBean(@Qualifier("sessionFactoryBean") SessionFactory sessionFactory) {
        return new RepoHibernateMariaDB(sessionFactory);
    }

    @Bean
    public SessionFactory sessionFactoryBean(){
        return new HibernateUtil("hibernate1.cfg.xml").getSessionFactory();
    }

}
