package com.covid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1.Loading the Driver Class
		Class.forName("org.postgresql.Driver");
		
		// 2. Creating the connection object
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost/task","postgres","postgres");
		
		// 3. Creating the statement object
		PreparedStatement stmt = conn.prepareStatement("SELECT location,"+" Count(total_cases) FROM coviddata "+" WHERE new_cases>1000 GROUP BY location,new_cases ORDER BY new_cases;");
		
		// 4. Executing the query
		ResultSet result=stmt.executeQuery();
		while (result.next()) {
		System.out.println(result.getString(1)
				+ " " + result.getString(2)
			//	+ " " + result.getString(3)
			//	+ " " + result.getString(4)
			//	+ " " + result.getString(5)
			//	+ " " + result.getString(6)
				);
		}
		
		// closing the connection
		conn.close();
	}

}
