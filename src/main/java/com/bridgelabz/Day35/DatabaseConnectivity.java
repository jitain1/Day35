package com.bridgelabz.Day35;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivity {
	
	        public static void main(String[] args)  {
	            try {
	            	Class.forName("com.mysql.cj.jdbc.Driver");
	                System.out.println("Driver class loaded and registered");
	                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "Jitain@88");
	                System.out.println("Connection established with dbserver");
	            } catch (ClassNotFoundException | SQLException e) {
	                e.printStackTrace();
	            }
	        }
}
