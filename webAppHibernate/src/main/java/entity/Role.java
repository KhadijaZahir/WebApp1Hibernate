package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idRole;
	private String name;


	// ROLE _ user
	@OneToMany(mappedBy = "role")
	private List<User> users;

	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Role(String name) {
		super();
		this.name = name;
	}



	public Role(String name, List<User> users) {
		super();
		this.name = name;
		this.users = users;
	}



	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public long getIdRole() {
		return idRole;
	}

	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
