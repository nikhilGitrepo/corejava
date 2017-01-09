package com.nikhil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nikhil.entity.Student;

public class QueryStudentDemo {
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
			
			//start a transaction
			session.beginTransaction();
			
			//Query the students
//			List<Student> students = session.createQuery("from Student").getResultList(); 
			
			Query query = session.createQuery("from Student s where s.firstName LIKE '%u%'");
			query.setCacheable(true);
			List students = query.list(); 
			
			//Display the students
			displayStudents(students);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			factory.close();
		}
	}

	/**
	 * @param students
	 */
	private static void displayStudents(List<Student> students) {
		students.stream().peek( s -> {
			if(s.getId() == 1) System.out.println("Priting all the students in database..");
		}).forEach( (s) -> System.out.println(s));
	}
}
