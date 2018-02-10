package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Application {

	public static void main(String[] args) {
		
		// Traditional Way
		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setName("John");
		emp1.setEmail("john@example.com");
		emp1.setSalary(50000);
		emp1.setAddress("Redwood Shores");
		
		System.out.println(emp1);
		
		// Inversion of Control : Control of creating and managing the object is with IOC Container
		// 1. BeanFactory
		//Resource resource = new ClassPathResource("employeebean.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		/*System.out.println("=================================");
		
		Employee e1 = factory.getBean("emp2", Employee.class);
		Employee e2 = (Employee)factory.getBean("emp3");
		
		System.out.println(e1);
		System.out.println(e2);*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		System.out.println("=================================");
		
		Employee e1 = context.getBean("emp2", Employee.class);
		//Employee e2 = (Employee)context.getBean("emp3");
		//Employee e2 = context.getBean("emp2", Employee.class);
		
		System.out.println(e1);
		//System.out.println(e2);
		
		// Down Casting
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close(); // closing the context
		
	}

}
