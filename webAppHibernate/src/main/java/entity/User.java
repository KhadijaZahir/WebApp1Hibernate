package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
//@Entity(name = "joinedTableUser")
@Table(name = "users")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)

//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "User_table")
//@SuperBuilder
//@NoArgsConstructor
//@AllArgsConstructor
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idUser")
	private long idUser;

	private String name;

	private String email;

	private int phone;

	private String password;

	// role _ user
	@ManyToOne
	@JoinColumn(name = "idRole")
	private Role role;

	// user _ activity
	@OneToMany(mappedBy = "users")
	private List<Activity> activity;

	public User() {
		super();
	}

	


	public User(String name, String email, int phone, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}




	public User(String name, String email, int phone, String password, Role role) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.role = role;
	}

	public User(String name, String email, int phone, String password, Role role, List<Activity> activity) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.role = role;
		this.activity = activity;
	}

	public User(long idUser, String name, String email, int phone, String password, Role role,
			List<Activity> activity) {
		super();
		this.idUser = idUser;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.role = role;
		this.activity = activity;
	}

	public User(long idUser, String name, String email, int phone, String password) {
		super();
		this.idUser = idUser;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}




	public long getIdUser() {
		return idUser;
	}




	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public int getPhone() {
		return phone;
	}




	public void setPhone(int phone) {
		this.phone = phone;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public Role getRole() {
		return role;
	}




	public void setRole(Role role) {
		this.role = role;
	}




	public List<Activity> getActivity() {
		return activity;
	}




	public void setActivity(List<Activity> activity) {
		this.activity = activity;
	}

	

}
