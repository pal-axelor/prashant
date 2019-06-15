package map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "library")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int bookId;
	
	public String bookName;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="list")
	List<Student> list1;
	
	public List<Student> getList1() {
		return list1;
	}
	public void setList1(List<Student> list1) {
		this.list1 = list1;
	}
	
	
	
	
	//this is for one to one mapping
	/*@OneToOne(cascade = CascadeType.ALL)
	Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}*/
	
	

	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	
	
}