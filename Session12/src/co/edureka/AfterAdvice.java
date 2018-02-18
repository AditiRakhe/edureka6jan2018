package co.edureka;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method method, Object[] arg2, Object arg3) throws Throwable {
		
		System.out.println("===============after executed==============");
		
		System.out.println("Mehod Details: "+method);
		System.out.println("Method Name: "+method.getName());
		
		for(Object o : arg2){
			System.out.println(o);
		}
		
		System.out.println("arg0 is : "+arg0);
		System.out.println("arg3 is : "+arg3);
		
		System.out.println("Uswr logged in at : "+new Date());
		
		System.out.println("============================================");
	}

}
