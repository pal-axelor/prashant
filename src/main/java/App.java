import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Student student = new Student();
		
		student.setMarks(80);
		student.setName("prashant");
		/*
		 * Student s1= new Student(); s1.setId(102); s1.setMarks(95);
		 * s1.setName("ravi");
		 */
		
		// s.setId(101);
		// s.setMarks(85);
		// Student s1=(Student) session.get(Student.class,101);
		// s1.setName("ravi");

		// session.update(s1);

		// session.delete(s);

		// Student s1=(Student) session.get(Student.class,101);
		// System.out.println("student id is :"+s1.getId()+"student name is
		// :"+s1.getName()+"student marks is :"+s1.getMarks());
		
		session.save(student);
		//Query<Student> query = session.createQuery("Select * from student where id=1");
		//query.uniqueResult();
		// session.save(s1);

		session.getTransaction().commit();
		session.close();
	}
}
