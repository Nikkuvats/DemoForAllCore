package com.AdvanceJava.Intro;

import java.sql.SQLException;

// Advance java is used to make web and enterprise application. Advance java include servlet, jsp, ejb and jdbc


// load and register driver
// establish connection between java application and database
// create statement object
// send and execute query
// process ResultSet
// close connection

class jdbcArchitecture {
	
	public static void main(String[] args) throws Exception {
		
		String url = "";
		String user = "";
		String password = "";
		
		Class.forName("com.mysql.jdbc.driver");
		java.sql.Connection con = java.sql.DriverManager.getConnection(url, user, password);
		java.sql.Statement statement = con.createStatement();
		java.sql.ResultSet rsSet = statement.executeQuery("select * from customer");
		while (rsSet.next()) {
			System.out.println(rsSet.getInt(1)+ "" +rsSet.getString(1));
		}
		con.close();
	}
}