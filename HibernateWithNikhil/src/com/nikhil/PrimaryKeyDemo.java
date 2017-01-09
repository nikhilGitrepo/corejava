package com.nikhil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nikhil.entity.Student;

public class PrimaryKeyDemo {
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
			System.out.println("Creating 3 Student Objects..");
			Student student1 = new Student("GG","Hiremath","gg.hiremath1@marist.edu");
			Student student2 = new Student("Shruti","Hiremath","sh.hiremath1@marist.edu");
			Student student3 = new Student("Anusha","Hiremath","an.hiremath1@marist.edu");
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			session.save(student1);
			session.save(student2);
			session.save(student3);
			
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
