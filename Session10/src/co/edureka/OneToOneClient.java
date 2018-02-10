package co.edureka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneClient {

	public static void main(String[] args) {
		
		Person pRef = new Person();
		pRef.setName("John Watson");
		pRef.setEmail("john@example.com");
		pRef.setPhone("+91 987655 78998");
		
		
		Address aRef = new Address();
		aRef.setAdrsLine("Country Homes");
		aRef.setCity("Bengaluru");
		aRef.setState("Karnataka");
		aRef.setZipCode(520001);
		
		pRef.setAddress(aRef); // 1 to 1
		aRef.setPerson(pRef);  // 1 to 1

		// We shall save only person and not address. address shall be saved automatically since person has reference to address
		

		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Read hibernate.cfg.xml file
			//config.configure("anyname.xml"); // if hibernate.cfg.xml file is renamed to anyname.xml
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			session.save(pRef);
			
			transaction.commit();
			
			System.out.println("Transaction Committed...");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
			e.printStackTrace();
			
			transaction.rollback();
		}finally {
			session.close();
		}
	}

}
