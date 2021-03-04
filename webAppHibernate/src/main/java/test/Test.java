package test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.*;
import util.HibernateUtil;

public class Test {
	static Session session = HibernateUtil.getSessionFactory().getCurrentSession();

	public static void main(String[] args) {
//		User user = new User("Nani", "n@gmail", 0677777, "123");
		Role role = new Role("student");
        Type_Activity type_Activity = new Type_Activity("Type-club");
		User users = new User("khadija", "khadija@gmail", 14, "1414", role);
		Activity activity = new Activity("hacathoon", "hghgvdgh", new Date(), users, type_Activity);
        Speciality speciality = new Speciality("java ee");
        
//		Teachers teachers = new Teachers(speciality);
//		Students students = new Students(speciality);
        Students students = new Students("enooo", "enoo@gmail", 1540, "28817", speciality, role);
        Teachers teachers = new Teachers("bouchra", "enoo@gmail", 1540, "28817", speciality, role);
        Admin admin = new Admin("mourad", "enoo@gmail", 1540, "28817",role);
		Session session = null;
		Transaction transaction = null;
		try {

			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
//			session.persist(user);
			// lancer des mises à jour dans la session et faire automatiquement le commit
			// session.flush();
//			session.persist(user);
			session.persist(activity);
			session.persist(role);
			session.persist(users);
			session.persist(speciality);
			session.persist(teachers);
			session.persist(admin);
			session.persist(students);
			session.persist(type_Activity);
			transaction.commit();
			System.out.println("bien crée !");
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
}
