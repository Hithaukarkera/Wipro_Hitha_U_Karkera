package JDBC;

import java.sql.*;

public class callable {

	public static void main(String[] args) {
		try {
			//loading try block
			//class.forName is static method of the Class class in java, used to load a class dynamically at runtime.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","Hitha@07");
			System.out.println("Connection created");
			
			CallableStatement cs= con.prepareCall("{Call GetAllEmployees()}");
			
			Statement stmt = con.createStatement();
			
			ResultSet rs= stmt.executeQuery("select * from employee");
			
			while(rs.next()) {
			System.out.println(rs.getInt("Employee_ID") + " " + rs.getString("First_Name"));
			
		}
			con.close();
			cs.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

