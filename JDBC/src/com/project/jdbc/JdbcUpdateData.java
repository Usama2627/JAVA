package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdateData {
	public static void main(String[] args) throws ClassNotFoundException {

		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "Xworkz@123";
		String query = "UPDATE employees SET job_title = 'Full Stack Developer', salary = 90000 WHERE id = 4;";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
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
				System.out.println("Update Successful. " + rowsAffected + " row(s) affected");
			} else {
				System.err.println("Update Failed!!!");
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
