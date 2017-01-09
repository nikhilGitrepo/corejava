package com.nikhil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nikhil.entity.Student;

public class ReadStudentDemo {
	public static void main(String[] args) {

		// Create SessionFactory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//Create Session
		Session session = factory.getCurrentSession();
		
		try {
			
			//create student object
			System.out.println("Creating a Student Object");
			Student student = new Student("Kirti","Hiremath","kirti.hiremath1@marist.edu");
			
			//start a transaction
			session.beginTransaction();
			
			//save new student object
			session.save(student);
			
			//commit transaction
			session.getTransaction().commit();
			
			//find out the students generated id: Primary Key
			System.out.println("Generated ID for the student: " + student.getId());
			
			//now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve the student based on the primary key
			System.out.println("\nGetting the student with ID: " + student.getId());
			Student rtStudent = (Student) session.get(Student.class, student.getId());
			
			System.out.println("Get complete: " + rtStudent);
			
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			factory.close();
		}
	}
}
