package co.edureka;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyClient {

	public static void main(String[] args) {
		
		Certificate c1 = new Certificate();
		c1.setName("OCJP");
		
		Certificate c2 = new Certificate();
		c2.setName("AWS");
		
		Certificate c3 = new Certificate();
		c3.setName("CCNA");
		
		Manager m1 = new Manager();
		m1.setName("John");
		m1.setEmail("john@example.com");
		m1.setSalary(50000);
		
		Manager m2 = new Manager();
		m2.setName("Jennie");
		m2.setEmail("jennie@example.com");
		m2.setSalary(60000);
		
		ArrayList<Certificate> cList1 = new ArrayList<Certificate>();
		ArrayList<Certificate> cList2 = new ArrayList<Certificate>();
		
		cList1.add(c1); //0
		cList1.add(c2); //1
		cList1.add(c3); //2
		
		cList2.add(c1); //0
		cList2.add(c3); //1
		
		m1.setCertificateList(cList1); // 1 - *
		m2.setCertificateList(cList2); // 1 - *
		
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
			
			//session.save(m1);
			session.save(m2);
			
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
