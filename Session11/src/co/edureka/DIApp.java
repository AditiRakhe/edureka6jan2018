package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dependency.xml");
		System.out.println("=================================");
		
		//Address a1 = context.getBean("aRef",Address.class);
		//System.out.println(a1);
		
		Student s1 = context.getBean("sRef",Student.class);
		System.out.println(s1);
		
		System.out.println("=================================");
		System.out.println(s1.getSubjects());

	}

}
