package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBCHelper {

	// JDBC API's
	Connection con;
	Statement stmt;
	
	PreparedStatement pStmt;
	
	CallableStatement cStmt;
	
	// 1. Load the Driver
	JDBCHelper(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("-- Driver Loaded --");
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	// 2. Create the Connection
	void openConnection(){
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
	
	
	void insertEmployee(Employee emp){
		try {
			
			//Statement API
			
			//3. Write a SQL Statement
			//String sql = "insert into Employee values(null,'Jennie',32,'Redwood Shoers',57500)";
			//String sql = "insert into Employee values(null,'"+emp.name+"',"+emp.age+",'"+emp.address+"',"+emp.salary+")";
			
			//4. Execute a SQL Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql); // Firing the SQL Statement
			
			// PreparedStatement API
			
			//String sql = "insert into Employee(name, address) values(?,?)";
			
			String sql = "insert into Employee values(null,?,?,?,?)"; // ? -  Wild Card
			pStmt = con.prepareStatement(sql);
			
			pStmt.setString(1, emp.name);
			pStmt.setInt(2, emp.age);
			pStmt.setString(3, emp.address);
			pStmt.setInt(4, emp.salary);
			
			int i = pStmt.executeUpdate(); // Firing the SQL Statement
			
			
			System.out.println("-- Record Inserted: "+i+" --");
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void updateEmployee(Employee emp){
		try {
			
			String sql = "update Employee set name = ?, salary = ? where id = ?"; // ? -  Wild Card
			pStmt = con.prepareStatement(sql);
			
			pStmt.setString(1, emp.name);
			pStmt.setInt(2, emp.salary);
			pStmt.setInt(3, emp.id);

			
			int i = pStmt.executeUpdate(); // Firing the SQL Statement
			
			System.out.println("-- Record Updated: "+i+" --");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void deleteEmployee(int id){
		try {
			
			String sql = "delete from Employee where id = ?"; // ? -  Wild Card
			pStmt = con.prepareStatement(sql);
			
			pStmt.setInt(1, id);
			
			int i = pStmt.executeUpdate(); // Firing the SQL Statement
			
			
			System.out.println("-- Record Deleted: "+i+" --");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	ArrayList<Employee> showEmployees(){
		
		ArrayList<Employee> empList = new ArrayList<>(); // Cache, which has the data as in objects. object represent a row
		
		try {
			
			
			String sql = "select * from Employee";
			pStmt = con.prepareStatement(sql);
						
			ResultSet rs = pStmt.executeQuery();
			
			int i=0,ag=0,sl=0;
			String n ="",ad="";
			
			while(rs.next()){
				
				i = rs.getInt(1);
				n = rs.getString(2);
				ag = rs.getInt(3);
				ad = rs.getString(4);
				sl = rs.getInt(5);
				
				//System.out.println(i+" - "+n+" - "+ag+" - "+ad+" - "+sl);
				//System.out.println("------------------------------------");
				Employee e = new Employee(i,n,ag,ad,sl);
				empList.add(e);
			}
			
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
		
		return empList;
	}
	
	void executeProcedure(Employee emp){
		try {

			String sql = "{ call addEmployee(?,?,?,?) }"; 
			cStmt = con.prepareCall(sql);
			
			cStmt.setString(1, emp.name);
			cStmt.setInt(2, emp.age);
			cStmt.setString(3, emp.address);
			cStmt.setInt(4, emp.salary);
			
			cStmt.execute();
			
			System.out.println("-- Procedure Executed --");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void processBatch(){
		try {
			
			stmt = con.createStatement();
			
			String sql1 = "update Employee set ename = 'Sia Watson' where id = 10";
			String sql2 = "delete from Employee where id = 3";
			String sql3 = "delete from Employee where id = 6";
			String sql4 = "update Employee set name = 'Tia Watson' where id = 8";
			
			
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			stmt.addBatch(sql4);
			stmt.addBatch(sql1);
			
			con.setAutoCommit(false); // Transaction Management is now handled by us
	
			stmt.executeBatch();
			System.out.println("Batch is Executed..");
			
			con.commit();
			System.out.println("Transaction Done...");
			
		} catch (Exception e) {
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			System.out.println("Some Error: "+e);
		}
	}
	
	
	// 5. Close the Connection
	void closeConnection(){
		try {
			con.close();
			System.out.println("-- Connection Closed --");
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	
}
