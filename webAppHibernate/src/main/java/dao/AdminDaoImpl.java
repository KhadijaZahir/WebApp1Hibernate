package dao;

import java.sql.*;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Admin;
import entity.User;
import util.HibernateUtil;

public class AdminDaoImpl implements AdminDao{
	Session session = HibernateUtil.getSessionFactory().getCurrentSession();

	@Override
	public User save(User p) {
		Session session = null;
		Transaction transaction = null;
		try {

			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.persist(p);
			// lancer des mises à jour dans la session et faire automatiquement le commit
			session.flush();
			// transaction.commit();
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
		return p;	
	}

	@Override
	public User updateUser(User p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findUser(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findallUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
     
	

}
