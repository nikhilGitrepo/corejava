package com.nikhil;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nikhil.entity.Student;

public class DeleteStudentDemo {
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

			int studentId = 3;
			
			//retrieve the student based on the primary key
			System.out.println("\nGetting the student with ID: " + studentId);
			Student rtvdStudent = (Student) session.get(Student.class, studentId);
			
			System.out.println("Get complete: " + rtvdStudent);
			
			//Updating retrieved student
			System.out.println("Deleting retrieved student.." + rtvdStudent.getId());
			
			//session delete approach
//			session.delete(rtvdStudent);
			
			//Create delete query approach
			session.createQuery("delete from Student where id=2").executeUpdate();
			
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
