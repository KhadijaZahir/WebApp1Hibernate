package dao;

import java.util.List;

import entity.Admin;
import entity.User;

public interface AdminDao {
	
	public User save(User user);
	public User updateUser(User p);
	public void deleteUser(Long id);
	public List<User> findUser(String mc);//chercher article
	public User findallUser(Long id); //consulter article

	
	
}
