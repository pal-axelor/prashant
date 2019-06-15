package map;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int studentId;
	public String studentName;
	
	@ManyToMany
	List <Library> list;
	
	public List<Library> getList() {
		return list;
	}
	public void setList(List<Library> list) {
		this.list = list;
	}

	
	//this is for many to one relationship
	/*@ManyToOne
	Library library;
	
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}*/
	
	
	
	//this is for one to many
	/*@OneToMany(targetEntity=Library.class)
	List<Library> list;
	
	public List<Library> getList() {
		return list;
	}
	public void setList(List<Library> list) {
		this.list = list; } */
	
	
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

}
