package entity;

import javax.persistence.*;

@Entity
//@Entity(name = "joinedTableTeachers")
//@Table(name = "teachers")
//@PrimaryKeyJoinColumn(name = "idUser")
//@DiscriminatorValue("teacher_table")
//@SuperBuilder
//@NoArgsConstructor
//@AllArgsConstructor
//@AttributeOverrides({
//    @AttributeOverride(name="name", column=@Column(name="name")),
//    @AttributeOverride(name="email", column=@Column(name="email")),
//    @AttributeOverride(name="phone", column=@Column(name="phone")),
//    @AttributeOverride(name="password", column=@Column(name="password"))
//})
public class Teachers extends User {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long idTeachers;

	@ManyToOne
//	@ManyToOne(targetEntity = User.class)
//	@JoinColumn(name = "idSpeciality")
	@JoinColumn(name = "idSpeciality", foreignKey = @ForeignKey(name = "idSpeciality"))
	private Speciality speciality;

	public Teachers() {
		super();
	}

	public Teachers(String name, String email, int phone, String password, Speciality speciality, Role role) {
		super(name, email, phone, password, role);
		this.speciality = speciality;
	}

	public Teachers(Speciality speciality) {
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
