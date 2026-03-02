package JDBC;

//UseCase: Update Data of the table using java program

import java.sql.*;

public class CreateTable {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "Hitha@07"
            );

            String sql =
                    "INSERT INTO employee (Employee_ID, First_Name, Last_Name, Gender, Age, Address, Dept, Salary) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, 101);
                ps.setString(2, "Kavya");
                ps.setString(3, "Naik");
                ps.setString(4, "Female");
                ps.setInt(5, 22);
                ps.setString(6, "Udupi");
                ps.setString(7, "IT");
                ps.setDouble(8, 55000);

                int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Data inserted successfully");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

