package org.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

@SuppressWarnings("deprecation")
public class Shape {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle=(Triangle) context.getBean("triangle");
		
		System.out.println(triangle);
	}

}
