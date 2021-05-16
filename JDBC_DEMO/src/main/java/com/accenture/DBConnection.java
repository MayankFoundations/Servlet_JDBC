package com.accenture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnection {
	static Connection con=null;
	
	
	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.
					getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
	
	return con;
	}
	
	
}
