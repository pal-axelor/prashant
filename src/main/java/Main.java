import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String args[]) {
		
		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		
		Info f = new Info();
		Information i = new Information();
		f.setName("prashant");
		i.setC_no(81558315);
		i.setInfo(f);
		
		session.save(f);
		session.save(i);
		
		
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}