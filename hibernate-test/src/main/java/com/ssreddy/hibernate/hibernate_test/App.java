package com.ssreddy.hibernate.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Configuration cfg = new Configuration();
		cfg = cfg.configure("/com/ssreddy/hibernate/hibernate_test/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Employee employee = new Employee();
		employee.setId(201);
		employee.setName("Shyamsundar Reddy");
		employee.setAddress("TPT");
		employee.setPhno("9885654533");

		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		System.out.println("Employee Obj is saved");
		// session closed
		session.close();
		factory.close();

	}
}
