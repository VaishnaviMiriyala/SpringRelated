package com.abc.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.beans.Student;

public class MainClass {
	public static void main(String[] args) {
		
		
		// Start Spring Container
				ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-factory.xml");
				
				// Get the Object from Spring 
				
				Student student = (Student)spring.getBean("student1");
				
				// use object as per business req.
				
				System.out.println(student);
				System.out.println(student.getCourse().getCoursename());
				
				
				student = (Student)spring.getBean("student1");
				student.setAge(25);
				System.out.println(student);
				student = (Student)spring.getBean("student1");
				System.out.println(student);
				
				spring.close();
	}

}
