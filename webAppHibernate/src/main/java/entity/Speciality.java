package entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "specialities")
public class Speciality {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idSpeciality;
	private String name;

	@OneToMany(mappedBy = "speciality")
	private List<Students> students;

	@OneToMany(mappedBy = "speciality")
	private List<Teachers> teachers;

	public Speciality() {
		super();
	}

	public Speciality(String name) {
		super();
		this.name = name;
	}

public Speciality(String name, List<Teachers> teachers) {
		super();
		this.name = name;
		this.teachers = teachers;
	}

	public Speciality(String name, List<Students> students, List<Teachers> teachers) {
		super();
		this.name = name;
		this.students = students;
		this.teachers = teachers;
	}

	public long getIdSpeciality() {
		return idSpeciality;
	}

	public void setIdSpeciality(long idSpeciality) {
		this.idSpeciality = idSpeciality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public List<Teachers> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teachers> teachers) {
		this.teachers = teachers;
	}

	
}
