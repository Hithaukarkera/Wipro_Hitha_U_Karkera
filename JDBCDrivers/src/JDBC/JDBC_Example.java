package JDBC;

import java.sql.*;

public class JDBC_Example {

	public static void main(String[] args) {
		try {
			//loading try block
			//class.forName is static method of the Class class in java, used to load a class dynamically at runtime.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","Hitha@07");
			System.out.println("Connection created");
			
			Statement stmt = con.createStatement();
			
			ResultSet rs= stmt.executeQuery("select * from employee");
			
			/*while(rs.next()) {
			System.out.println(rs.getInt("Employee_ID") + " " + rs.getString("First_Name"));
			
		}*/
			
			//fetching manually
			/*while (rs.next()) {
                System.out.println(
                        rs.getInt("Employee_ID") + "\t" +
                        rs.getString("First_Name") + "\t" +
                        rs.getString("Last_Name") + "\t" +
                        rs.getString("Gender") + "\t" +
                        rs.getString("age") + "\t" +
                        rs.getString("address") + "\t" +
                        rs.getString("Mobile_Number") + "\t" +
                        rs.getString("Dept") + "\t" +
                        rs.getDouble("Salary")
                );
            }*/
			
			//fetching automatically using ResultSetMetaData
			 //ResultSetMetaData is an interface used to get metadata (column information) of a ResultSet such as column count, names, and data types.
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();

            // 🔹 Fetch entire table
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
			
			
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
