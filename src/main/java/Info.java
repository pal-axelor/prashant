import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Info {
	@Id
	@GeneratedValue
	int rollNo;
	
	String name;

	
	public int getRoll_no() {
		return rollNo;
	}

	public void setRoll_no(int roll_no) {
		this.rollNo = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
