package co.edureka;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPClient {

	public static void main(String[] args) {
		System.out.println("**************AOP APP Started***************");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("advices.xml");
		Employee emp = context.getBean("empProxy",Employee.class);
		
		emp.loginEmployee(3);
		
		System.out.println("**************AOP APP Finished***************");
	}

}
