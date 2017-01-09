package com.nikhil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nikhil.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		// Create SessionFactory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
//				.configure()
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//Create Session
		Session session = factory.getCurrentSession();
		
		try {
			
			//create student object
			System.out.println("Creating a Student Object");
			Student student = new Student("Nikhil","Hiremath","nikhil.hiremath1@marist.edu");
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			session.save(student);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			factory.close();
		}
	}

}
