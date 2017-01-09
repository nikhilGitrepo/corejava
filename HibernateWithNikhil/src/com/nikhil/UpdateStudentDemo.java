package com.nikhil;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nikhil.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		// Create SessionFactory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//Create Session
		Session session = factory.getCurrentSession();
		
		try {
			
			//now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();

			int studentId = 1;
			
			//retrieve the student based on the primary key
			System.out.println("\nGetting the student with ID: " + studentId);
			Student rtvdStudent = (Student) session.get(Student.class, studentId);
			
			System.out.println("Get complete: " + rtvdStudent);
			
			//Updating retrieved student
			System.out.println("Updating retrieved student..");
			rtvdStudent.setFirstName("Gangadhar");
			
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			
			// NEW Code
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// update email for all the students in database
			System.out.println("Updating email for all the students in database ... ");
			Query query = (Query) session.createQuery("update Student set email='allupdae@marist.edu'");
			query.executeUpdate();
			
			session.getTransaction().commit();
			
			System.out.println("Done 2!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			factory.close();
		}
	}
}
