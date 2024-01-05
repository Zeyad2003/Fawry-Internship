package org.fawry.Week7.JDBC;

import java.sql.*;

public class testJDBC {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/testSchema";
    private static final String JDBC_USER = "zeyad";
    private static final String JDBC_PASSWORD = "";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            if (connection != null) {
                System.out.println("Connected to the database!");
                Statement statement = connection.createStatement();
                String sqlQuery = "SELECT * FROM testTable"; // Replace with your table name
                ResultSet rs = statement.executeQuery(sqlQuery);

                while (rs.next()) {
                    System.out.print(rs.getInt("count") + " ");
                    System.out.println(rs.getString("wow"));
                }
            }

        } catch (SQLException e) {
            System.err.println("Error: Unable to connect to the database");
            e.printStackTrace();
        }
    }
}
