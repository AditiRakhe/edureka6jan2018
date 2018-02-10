package co.edureka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class AnnotationClient {

	public static void main(String[] args) {
		
		User u1 = new User(null, "Jack", "jack@example.com", "Redwood Shores");
		User u2 = new User(null, "Jennie", "jennie@example.com", "Country Homes");
		
		AnnotationConfiguration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new AnnotationConfiguration();
			config.configure(); // Read hibernate.cfg.xml file
			//config.configure("anyname.xml"); // if hibernate.cfg.xml file is renamed to anyname.xml
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			session.save(u1);
			session.save(u2);
			
			transaction.commit();
			System.out.println("Transaction Done !!");
			
		}catch (Exception e) {
			System.out.println("Some Error: "+e);
			e.printStackTrace();
			
			transaction.rollback();
		}finally {
			session.close();
		}

	}

}
