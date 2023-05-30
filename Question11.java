package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*11. Write a Java program that connects to a MySQL database using JDBC. The program
should read data from a table and display the results in the console*/
public class Question11 {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:mysql://localhost:3306/newdb"; //  MySQL database URL
        String username = "root"; // Replace with your MySQL username
        String password = "System123"; // Replace with your MySQL password

        try {
            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
                System.out.println("Connection object is established");
            // Create a SQL statement
            Statement statement = connection.createStatement();

            // Execute a query to retrieve data from a table
            String query = "SELECT * FROM student"; //  table name
            ResultSet resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) 
            {
            	 System.out.println("Query passed");
                int id = resultSet.getInt("Stu_Id"); // Assuming 'id' is an integer column
                String name = resultSet.getString("Stu_Name"); // Assuming 'name' is a string column
                String Address = resultSet.getString("Stu_Add");

                // Display the retrieved data
                System.out.println("ID: " + id + ", Name: " + name+"Address"+Address);
            }

            // Close the resources
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }

	}

}
