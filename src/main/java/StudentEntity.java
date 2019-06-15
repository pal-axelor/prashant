import javax.persistence.*;

@Entity
@Table(name = "student")
public class StudentEntity {

	@Id
	@SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=1, allocationSize=12)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
	public int studentId;
	public String studentName;
	public int studentAge;
	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ "]";
	}

}