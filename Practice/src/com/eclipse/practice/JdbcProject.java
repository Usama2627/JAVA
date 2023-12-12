package com.eclipse.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcProject extends Thread {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost";
			String username = "root";
			String password = "Xworkz@123";
			// Process the ResultSet if needed

			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stm = conn.createStatement();

			String query = "create database dt";
			boolean b1 = stm.execute(query);
			System.out.println("Database creat succesfully");
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
