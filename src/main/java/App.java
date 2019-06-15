import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/*
		 * StudentEntity student = new StudentEntity(); Scanner scanner = new
		 * Scanner(System.in); System.out.println("Enter your name :");
		 * student.studentName = scanner.nextLine();
		 * 
		 * System.out.println("Enter your age :"); student.studentAge =
		 * scanner.nextInt();
		 */

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
        Query q1 = em.createQuery("Select s from StudentEntity s order by s.studentName ");  
        
        @SuppressWarnings("unchecked")  
        List<StudentEntity> l1 = q1.getResultList();  
        Iterator i=l1.iterator();
        System.out.println(l1.size());
		   while(i.hasNext()) {
			   StudentEntity st=(StudentEntity) i.next();
			   System.out.println("student id is :" + st.studentId + " student name is :" + st.studentName
						+ " student age is :" + st.studentAge);   
		   }

		
		
		
		
		
		
		//delete a specific record from database
		/*Query query = em.createQuery("delete from StudentEntity where studentId=-5 ");
		int c=	query.executeUpdate();
		System.out.println("records updated:"+c);*/
		
		
		
		
		//update using JPQL
		/*Query query = em.createQuery("update StudentEntity SET studentName='prashant' where studentId=-5");
	int c=	query.executeUpdate();
	System.out.println("records updated:"+c);	*/
		
		
		// em.persist(student);  to save the data i.e. insert into the table
		
		
		//query for fetching entire data from db
		/*Query query = em.createQuery("select s from StudentEntity s ");
		List<StudentEntity> list = query.getResultList();
		   Iterator i=list.iterator();
		   while(i.hasNext()) {
			   StudentEntity st=(StudentEntity) i.next();
			   System.out.println("student id is :" + st.studentId + " student name is :" + st.studentName
						+ " student age is :" + st.studentAge);   
		   }*/
		
	
		
		//another way to print the data
	/* for (StudentEntity st : list) {
			System.out.println("student id is :" + st.studentId + " student name is :" + st.studentName
					+ " student age is :" + st.studentAge);
		}*/
		
		
		// student=em.find(StudentEntity.class,-7); fetch single data from database
		
		
		// em.remove(student); delete single data from database
	
		
		em.getTransaction().commit();
		emf.close();
		em.close();

	}
}
