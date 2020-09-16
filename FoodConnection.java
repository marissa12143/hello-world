package edu.umsl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class FoodConnection {
	Connection conn = null;

	public static void main(String[] args) {
		
		String createTableSQL = "create table FOODITEM( id INTEGER, NAME VARCHAR(256), CALORIES INTEGER)";
		String insertTableSQL = "INSERT INTO FOODITEM(ID,NAME,CALORIES)VALUES('52','APPLE','20')";
		String selectSQLStatement = "SELECT * FROM FOODITEM";
		FoodConnection conn = new FoodConnection();
		
		try {
			conn.getConnection(); 
			conn.createTable(createTableSQL);
			conn.insertSQL(insertTableSQL);
			conn.selectSQL(selectSQLStatement);
			conn.shutdownDB();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Gets the connection to the database:
	public void getConnection() throws Exception {
		//load the database driver
		Class.forName("org.hsqldb.jdbcDriver"); // name of the driver
		conn = DriverManager.getConnection("jdbc:hsqldb:mem", "sa", ""); // "sa" is the default user ID for the hsqldb & there is no password
	}

	public void createTable(String sqlStatement) {
		
		Statement statement = null;
		
		try {
			statement = conn.createStatement(); //telling the connection object to create a statement
			
			statement.executeUpdate("drop table FOODITEM");
			
			int i = statement.executeUpdate(sqlStatement);
			
			if (i == -1) {
				System.out.println("Error: " + sqlStatement);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertSQL(String insertSQLStatement) {
		Statement statement = null;
		
		try {
			statement = conn.createStatement();
			int i = statement.executeUpdate(insertSQLStatement); //inserts values into the database
			
			if (i == -1) {
				System.out.println("Error: " + insertSQLStatement);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void selectSQL(String selectSQLStatement) {
		
		Statement statement = null;
		
		try {
			statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(selectSQLStatement); //selects everything from person table & returns everything from inside the query
			
			while (rs.next()) {
				System.out.println(rs.getInt("ID") + " " +  rs.getString("NAME") + " " +  rs.getString("CALORIES"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void shutdownDB() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
}
