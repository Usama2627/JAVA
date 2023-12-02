package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertData {
	public static void main(String[] args) throws ClassNotFoundException {

		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "Xworkz@123";
		String query = "INSERT INTO employees(id, name, job_title, salary) VALUES(4, 'Faizan', 'SQL Developer', 30000);";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established Successfully");
			Statement stmt = con.createStatement();
			int rowsAffected = stmt.executeUpdate(query);

			if (rowsAffected > 0) {
				System.out.println("Insert Successful. " + rowsAffected + " row(s) affected");
			} else {
				System.err.println("Insertion Failed!!!");
			}

			stmt.close();
			con.close();

			System.out.println();
			System.out.println("Connection closed Successfully!!!");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
