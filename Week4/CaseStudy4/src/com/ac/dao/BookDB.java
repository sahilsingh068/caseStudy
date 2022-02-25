package com.ac.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BookDB {
	public static Connection getConection() throws Exception {
		String driverName="org.postgresql.Driver";
		Class.forName(driverName);
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost/sahil","postgres","postgres" + "");
		return conn;
	}

	

}
