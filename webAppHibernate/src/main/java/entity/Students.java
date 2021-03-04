package entity;

import javax.persistence.*;

@Entity
//@Entity(name = "joinedTableStudents")
//@Table(name = "students")
//@PrimaryKeyJoinColumn(name = "idUser")
//@DiscriminatorValue("students_table")
//@SuperBuilder
//@NoArgsConstructor
//@AllArgsConstructor
//@AttributeOverrides({
//    @AttributeOverride(name="name", column=@Column(name="name")),
//    @AttributeOverride(name="email", column=@Column(name="email")),
//    @AttributeOverride(name="phone", column=@Column(name="phone")),
//    @AttributeOverride(name="password", column=@Column(name="password"))
//})
public class Students extends User {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long idStudents;

	@ManyToOne
//	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name="idSpeciality", foreignKey = @ForeignKey(name = "idSpeciality"))    
//	@JoinColumn(name = "idSpeciality")

	
	private Speciality speciality;

	public Students() {
		super();
	}
	
	public Students(String name, String email, int phone, String password, Speciality speciality, Role role) {
		super(name, email, phone, password, role);
		this.speciality = speciality;
	}
	public Students(Speciality speciality) {
		super();
		this.speciality = speciality;
	}

	public Speciality getSpeciality() {
		return speciality;
	}

	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}

}
