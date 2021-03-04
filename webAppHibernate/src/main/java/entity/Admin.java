package entity;

import javax.persistence.*;

@Entity
public class Admin extends User {

	public Admin() {
		super();
	}
	public Admin(String name, String email, int phone, String password,Role role) {
		super(name, email, phone, password, role);
	}
	public Admin(String name, String email, int phone, String password) {
		super(name, email, phone, password);
	}

}
