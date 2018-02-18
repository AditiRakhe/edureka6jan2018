package co.edureka;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] arg1, Object arg2) throws Throwable {
		
		System.out.println("===============before executed==============");
		
		System.out.println("Mehod Details: "+method);
		System.out.println("Method Name: "+method.getName());
		
		for(Object o : arg1){
			System.out.println(o);
		}
		
		System.out.println("arg2 is : "+arg2);
		
		// arg2 is reference to the Employee object
		
		Employee e = (Employee)arg2; // DownCast
				
		if(e.getEmail().isEmpty() || e.getPassword().isEmpty()){
			System.out.println("Email or Password Missing...");
		}else{
			System.out.println("Logging In Employee.........");
		}		
		
		
		System.out.println("============================================");
	}
}
