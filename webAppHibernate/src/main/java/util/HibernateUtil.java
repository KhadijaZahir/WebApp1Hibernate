package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	//build session factory
        	//session permet de lire, d'écrire les données
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory() {

        return sessionFactory;
    }
}

/*
 * import entity.Speciality;
 * 
 * import org.hibernate.SessionFactory; import org.hibernate.cfg.Configuration;
 * 
 * public class HibernateUtil {
 * 
 * private static final SessionFactory sessionFactory ;
 * 
 * static { try { // Create the SessionFactory from hibernate.cfg.xml
 * sessionFactory = new Configuration() .configure("hibernate.cfg.xml")
 * .addAnnotatedClass(Role.class) .addAnnotatedClass(User.class)
 * .addAnnotatedClass(Speciality.class) .addAnnotatedClass(Admin.class)
 * .addAnnotatedClass(Teachers.class) .addAnnotatedClass(Students.class)
 * .buildSessionFactory(); } catch (Throwable ex) { // Make sure you log the
 * exception, as it might be swallowed
 * System.err.println("Initial SessionFactory creation failed." + ex); throw new
 * ExceptionInInitializerError(ex); } } public static SessionFactory
 * getSessionFactory() { return sessionFactory; } }
 */