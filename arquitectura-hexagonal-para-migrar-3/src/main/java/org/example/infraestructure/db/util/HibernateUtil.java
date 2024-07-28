package org.example.infraestructure.db.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class HibernateUtil implements HibernateRules {

    private SessionFactory sessionFactory;

    public HibernateUtil(String direccionArchivo) {
        sessionFactory = setBuildSessionFactory(direccionArchivo);
    }

    @Override
    public SessionFactory setBuildSessionFactory(String direccionArchivo) {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration()
                    .configure(new File(direccionArchivo))
                    .buildSessionFactory();

        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed. " + ex);
            throw new ExceptionInInitializerError(ex);

        }
    }

    @Override
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Override
    public void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
}