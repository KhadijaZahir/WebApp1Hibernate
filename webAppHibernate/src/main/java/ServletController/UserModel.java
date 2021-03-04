package ServletController;

import java.util.ArrayList;
import java.util.List;

import entity.Admin;
import entity.User;

public class UserModel {
	private String motCle;
	private List<User> users = new ArrayList<User>();
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}


}
