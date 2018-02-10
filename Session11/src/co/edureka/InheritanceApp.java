package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beaninheritance.xml");
		System.out.println("=================================");
		
		Daughter dRef = context.getBean("cRef",Daughter.class);
		System.out.println(dRef);
	}

}
