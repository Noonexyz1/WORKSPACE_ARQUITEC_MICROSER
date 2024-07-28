package org.example.infraestructure.db.util;

import org.hibernate.SessionFactory;

public interface HibernateRules {
    SessionFactory setBuildSessionFactory(String direccionArchivo);
    void shutdown();
    SessionFactory getSessionFactory();
}
