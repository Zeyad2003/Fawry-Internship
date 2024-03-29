package org.hibernatetask.util;

import org.hibernatetask.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
    public static SessionFactory factory;

    private SessionUtil() {}

    public static synchronized SessionFactory getSessionFactory() {

        if (factory == null) {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Doctor.class).
                    addAnnotatedClass(Drug.class).
                    addAnnotatedClass(Patient.class).
                    addAnnotatedClass(Hospital.class).
                    buildSessionFactory();
        }
        return factory;
    }
}
