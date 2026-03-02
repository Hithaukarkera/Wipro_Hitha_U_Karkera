package JDBC;

import java.sql.*;

public class Update {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "Hitha@07"
            );

            String sql =
                "UPDATE employee SET First_Name = ?, Last_Name = ? WHERE Employee_ID = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "Snehal");
            ps.setString(2, "Devadiga");
            ps.setInt(3, 101);   // which record to update

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Data updated successfully");
            } else {
                System.out.println("No record found");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
