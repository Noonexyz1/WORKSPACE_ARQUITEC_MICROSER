package org.example.infraestructure.rest.config;

import org.example.application.implement.AbogadoImpAdapter;
import org.example.application.mapper.AbogadoImpMapper;
import org.example.application.useCase.AbogadoMapper;
import org.example.application.useCase.AbogadoPersistence;
import org.example.application.useCase.AbogadoUseCaseService;
import org.example.infraestructure.db.RepoHibernateMariaDB;
import org.example.infraestructure.db.util.HibernateUtil;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AbogadoConfig {

    @Bean
    public SessionFactory sessionFactoryBean(){
        return new HibernateUtil("hibernate1.cfg.xml").getSessionFactory();
    }

    @Bean
    public AbogadoPersistence beanAbogadoServiceBDBean(@Qualifier("sessionFactoryBean") SessionFactory sessionFactory) {
        return new RepoHibernateMariaDB(sessionFactory);
    }

    @Bean
    public AbogadoUseCaseService abogadoImpAdapterBean(@Qualifier("beanAbogadoServiceBDBean") AbogadoPersistence abogadoPersistence){
        return new AbogadoImpAdapter(abogadoPersistence);
    }

    @Bean
    public AbogadoMapper abogadoMapperBean(){
        return new AbogadoImpMapper();
    }
}
