package co.edureka;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Client {

	public static void main(String[] args) {
		
		/*Employee emp1 = new Employee();
		emp1.setEid(null);
		emp1.setName("George");
		emp1.setEmail("george@example.com");
		emp1.setSalary(60000);
		emp1.setAge(31);
		
		Employee emp2 = new Employee(null, "Fionna", "fionna@example.com", 70000, 31);

		System.out.println(emp1); // System.out.println(emp1.toString());
		System.out.println(emp2);*/
		
		// Hibernate API's to Save the Objects in Tables
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Session session1 = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Read hibernate.cfg.xml file
			//config.configure("anyname.xml"); // if hibernate.cfg.xml file is renamed to anyname.xml
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			//session1 = factory.openSession();
			
			transaction = session.beginTransaction();
			
			//1. Insert the data
			//session.save(emp1);
			//session.save(emp2);
			
			//2. Get the Object | Read the record
			//Employee emp = (Employee)session.get(Employee.class,3);
			//System.out.println("Record: "+emp);
			
			//3. Update the Object | Update the record
			/*emp.setSalary(57500);
			emp.setEmail("g.george@example.com");
			
			session.update(emp);*/
			
			//4. Delete the Object | Delete the record
			/*Employee emp = new Employee();
			emp.setEid(3);
			
			session.delete(emp);*/
			
			//5. Read All the Records : HQL
			//String hql = "From Employee"; // Select * from Employee
			//String hql = "From Employee where salary >= 60000"; 
			//List<Employee> empList = session.createQuery(hql).list();
			
			
			//6. Read All the Records | Criteria API
			/*Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 55000));
			
			List<Employee> empList = criteria.list();
			
			for(Employee emp : empList){
				System.out.println(emp);
				System.out.println("======================================================================");
			}*/
			
			
			//7. Batch Processing
			/*for(int i=1;i<=100;i++){
				Employee emp = new Employee(null,"Employee"+i,"employee"+i+"@example.com",30000+i,20+i);
				session.save(emp);
			}*/
			
			Employee e1 = (Employee)session.get(Employee.class, 1);
			Employee e2 = (Employee)session.get(Employee.class, 4);
			
			Employee e3 = (Employee)session.get(Employee.class, 1);
			
			System.out.println(e1);
			System.out.println(e2);
			System.out.println(e3);
			
			transaction.commit();
			
			System.out.println("Transaction Committed...");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
			e.printStackTrace();
			
			transaction.rollback();
		}finally {
			session.close();
			factory.close();
		}
		
	}

}
