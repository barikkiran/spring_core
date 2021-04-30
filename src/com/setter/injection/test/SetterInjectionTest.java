package com.setter.injection.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.setter.injection.bean.Employee;

public class SetterInjectionTest {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/setter/injection/config/application-context.xml"));
		
		Employee employee = (Employee) beanFactory.getBean("employee", Employee.class);
		
		System.out.println(employee);
	}
}
