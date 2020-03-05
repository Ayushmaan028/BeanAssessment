package com.acc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee emp = (Employee) context.getBean("employee");
		User u = (User) context.getBean("user");
		
		emp.show();
		u.showUser();
	}

}
