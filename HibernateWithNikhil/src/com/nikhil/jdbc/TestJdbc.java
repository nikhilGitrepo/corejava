package com.nikhil.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;

public class TestJdbc {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user="root";
		String password="";
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			Connection conn = DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("Connection Succesfull");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
