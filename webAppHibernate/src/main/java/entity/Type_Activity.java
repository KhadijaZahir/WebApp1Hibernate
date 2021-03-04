package entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "type_activity")
public class Type_Activity {
	// activity _ type activity
	@OneToMany(mappedBy = "type_activity")
	private List<Activity> activity;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idType;
	private String name;

	public Type_Activity() {
		super();
	}

	



	public Type_Activity(String name) {
		super();
		this.name = name;
	}





	public List<Activity> getActivity() {
		return activity;
	}

	public void setActivity(List<Activity> activity) {
		this.activity = activity;
	}

	public long getIdType() {
		return idType;
	}

	public void setIdType(long idType) {
		this.idType = idType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
