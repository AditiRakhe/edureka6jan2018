package co.edureka;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("--postProcessAfterInitialization-- "+beanName);
		//System.out.println("bean is: "+bean);
		
		Employee e = (Employee)bean; // DownCast
		e.setName("Jennie Watson");
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("--postProcessBeforeInitialization--"+beanName);
		//System.out.println("bean is: "+bean);
		return bean;
	}

}
