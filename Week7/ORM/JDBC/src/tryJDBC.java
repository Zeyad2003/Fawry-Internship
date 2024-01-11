package src;

import java.sql.*;

public class tryJDBC {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/fawry-tasks";
    private static final String JDBC_USER = "fawry-intern";
    private static final String JDBC_PASSWORD = "fawry";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            if (connection != null) {
                System.out.println("Connected to the database!");
                Statement statement = connection.createStatement();
                String sqlQuery = "SELECT * FROM jdbcTable";
                ResultSet rs = statement.executeQuery(sqlQuery);

                System.out.println("===============JDBC Output================");

                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Description: " + rs.getString("description"));
                    System.out.println("Created at: " + rs.getTimestamp("created_at"));
                    System.out.println("==========================================");
                }
            }

        } catch (SQLException e) {
            System.err.println("Error: Unable to connect to the database");
            e.printStackTrace();
        }
    }
}
