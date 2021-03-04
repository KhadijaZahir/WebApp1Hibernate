package entity;

import java.util.Date;

import javax.persistence.*;

@Entity
//@Table(name = "activity")
public class Activity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idActivity;

	private String name;

	private String description;

	private Date dateCreationActivite;

	// activity_user
	@ManyToOne
	@JoinColumn(name = "idUser")
	private User users;

	// activity_type activity
	@ManyToOne
	@JoinColumn(name="idType", foreignKey = @ForeignKey(name = "idType"))  	
	private Type_Activity type_activity;
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_type", referencedColumnName = "id", nullable = false, unique = true)
//	@Transient
//	private Type_Activity type_activity;

	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Activity(String name, String desc, Date date, User users) {
		super();
		this.name = name;
		this.description = desc;
		this.dateCreationActivite = date;
		this.users = users;
	}

	public Activity(String name, String description, Date dateCreationActivite, User users,
			Type_Activity type_activity) {
		super();
		this.name = name;
		this.description = description;
		this.dateCreationActivite = dateCreationActivite;
		this.users = users;
		this.type_activity = type_activity;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

//	public Type_Activity getType_activity() {
//		return type_activity;
//	}
//
//	public void setType_activity(Type_Activity type_activity) {
//		this.type_activity = type_activity;
//	}

	public long getId() {
		return idActivity;
	}

	public void setId(long id) {
		this.idActivity = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return description;
	}

	public void setDesc(String desc) {
		this.description = desc;
	}

	public Date getDate() {
		return dateCreationActivite;
	}

	public void setDate(Date date) {
		this.dateCreationActivite = date;
	}

}
