package co.edureka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InheritanceClient {

	public static void main(String[] args) {
	
		CA ca = new CA();
		ca.setA(10);
		
		CB cb = new CB();
		cb.setA(100);
		cb.setB(200);
		
		CC cc = new CC();
		cc.setA(1000);
		cc.setB(2000);
		cc.setC(3000);
		
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
			
			session.save(ca);
			session.save(cb);
			session.save(cc);
			
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
