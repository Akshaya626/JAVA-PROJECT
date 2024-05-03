package HIBB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver explicitly
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customeraddress",
                    "akshaya", "1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");

            // Process the result set
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customerID");
                String customerName = resultSet.getString("Name");
                int customerAge = resultSet.getInt("Age");
                String customerPhoneNumber = resultSet.getString("PhoneNumber");
                System.out.println("CustomerID: " + customerId + ", Name: " + customerName + ", Age: " + customerAge
                        + ", PhoneNumber: " + customerPhoneNumber);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            // Handle ClassNotFoundException
            System.out.println("MySQL JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            // Handle SQLException
            e.printStackTrace();
        }
    }
}