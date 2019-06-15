package map;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Prashant {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Student student = new Student();

		student.setStudentName("prashant");
		Student student1 = new Student();
		student1.setStudentName("parth");
		List<Student> list = new ArrayList<Student>();

		list.add(student);
		list.add(student1);

		Library lib = new Library();
		lib.setBookName("ruby");
		Library lib1 = new Library();
		lib1.setBookName("python");

		List<Library> list1 = new ArrayList<Library>();

		list1.add(lib);
		list1.add(lib1);

		student.setList(list1);
		student1.setList(list1);

		lib.setList1(list);
		lib1.setList1(list);

		em.persist(student);
		em.persist(student1);

		em.persist(lib);
		em.persist(lib1);

		// this for many to one (use db manytoone)
		/*
		 * Library lib =new Library(); lib.setBookName("data structure");
		 * em.persist(lib);
		 * 
		 * Student student=new Student(); Student student1=new Student();
		 * 
		 * 
		 * student.setStudentName("mayur"); student.setLibrary(lib);
		 * student1.setStudentName("alagiya"); student1.setLibrary(lib);
		 * 
		 * em.persist(student); em.persist(student1);
		 */

		// this for many to one mapping (use database onetomany in persistent.xml)
		/*
		 * Student student=new Student(); Library lib =new Library();
		 * lib.setBookName("c lan"); Library lib1 =new Library();
		 * lib1.setBookName("python"); em.persist(lib); em.persist(lib1);
		 * ArrayList<Library> arraylist=new ArrayList<Library>(); arraylist.add(lib);
		 * arraylist.add(lib1);
		 * 
		 * 
		 * student.setStudentName("ravi"); student.setList(arraylist);
		 * 
		 * em.persist(student);
		 */

		// one to one mapping (use database map)
		/*
		 * lib.setStudent(student); this is for one to one mapping
		 * //em.persist(student); Student student=new Student(); Library lib =new
		 * Library(); student.setStudentName("prashant"); em.persist(lib);
		 */

		em.getTransaction().commit();
		emf.close();
		em.close();
	}
}
