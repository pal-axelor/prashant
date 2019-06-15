import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Information {
	@Id
	@GeneratedValue(generator = "newGenerator")
	@GenericGenerator(name = "newGenerator", strategy = "foreign", parameters = @Parameter(value = "Info", name = "property"))
	int roll_no;
	long c_no;
	@OneToOne
	Info info;

	// (cascade=CascadeType.ALL)
	// @JoinColumn(name="roll_no")
	//
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public long getC_no() {
		return c_no;
	}

	public void setC_no(long c_no) {
		this.c_no = c_no;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

}
