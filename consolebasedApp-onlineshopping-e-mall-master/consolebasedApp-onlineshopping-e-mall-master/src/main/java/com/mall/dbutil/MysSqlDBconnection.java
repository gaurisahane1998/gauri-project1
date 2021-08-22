package com.mall.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MysSqlDBconnection {
	private static Connection connection;

	private MysSqlDBconnection() {
	
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/project";
		String username = "root";
		String password = "root";
		connection = DriverManager.getConnection(url, username, password);
		return connection;

	}
}

