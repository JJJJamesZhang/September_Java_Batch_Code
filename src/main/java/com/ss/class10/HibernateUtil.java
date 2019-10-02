package com.ss.class10;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory FACTORY = buildSessionFactory();

    public static SessionFactory buildSessionFactory(){
        SessionFactory sessionFactory = null;
        sessionFactory = new Configuration().configure().buildSessionFactory();

        return sessionFactory;
    }
}
