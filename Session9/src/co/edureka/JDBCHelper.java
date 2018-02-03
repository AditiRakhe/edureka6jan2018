package co.edureka;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCHelper {

	// JDBC API's
	Connection con;
	Statement stmt;
	
	PreparedStatement pStmt;
	
	CallableStatement cStmt;
	
	// 1. Load the Driver
	public JDBCHelper(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("-- Driver Loaded --");
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	// 2. Create the Connection
	public void openConnection(){
		try {
			
			String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/edureka";
			
			con = DriverManager.getConnection(url, user, password);
			
			System.out.println("-- Connection is Opened --");
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	
	public int registerUser(String name, String email, String password){
		
		int i = 0;
		
		try {

			String sql = "insert into User values(null,?,?,?)"; // ? -  Wild Card
			pStmt = con.prepareStatement(sql);
			
			pStmt.setString(1, name);
			pStmt.setString(2, email);
			pStmt.setString(3, password);
			
			i = pStmt.executeUpdate(); // Firing the SQL Statement
			
			
			System.out.println("-- Record Inserted: "+i+" --");
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
		
		return i;
	}

	// 5. Close the Connection
	public void closeConnection(){
		try {
			con.close();
			System.out.println("-- Connection Closed --");
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	
}
