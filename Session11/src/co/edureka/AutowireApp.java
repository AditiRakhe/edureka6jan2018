package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		System.out.println("=================================");
		
		CB cRef = context.getBean("cb",CB.class);
		cRef.getCa().sayHello("John");

	}

}
