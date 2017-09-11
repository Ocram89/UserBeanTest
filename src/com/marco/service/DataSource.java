package com.marco.service;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
//connessione al server
	
	private static String dbURI = "jdbc:postgresql://localhost:5432/TestDb";
	private static String user = "postgres";
	private static String password = "1234";
	private static Connection connection = null;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		if(connection ==null){
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(dbURI,user,password);
		}
		return connection;
	}
}

