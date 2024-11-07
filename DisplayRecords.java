import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DisplayRecords {

    public static void main(String[] args) {
        // Database credentials and URL
        String url = "jdbc:mysql://localhost:3306/yourDatabaseName"; // Replace with your database URL
        String user = "yourUsername"; // Replace with your database username
        String password = "yourPassword"; // Replace with your database password

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Establish the database connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully.");

            // Step 2: Create a statement to execute SQL query
            statement = connection.createStatement();

            // Step 3: Execute the SQL query to get all records from the table
            String sql = "SELECT * FROM yourTableName"; // Replace with your table name
            resultSet = statement.executeQuery(sql);

            // Step 4: Process the ResultSet and display the records
            System.out.println("Records from the table:");
            
            // Assuming the table has columns "id", "name", "age" - Adjust as necessary
            while (resultSet.next()) {
                int id = resultSet.getInt("id");           // Replace with your column name
                String name = resultSet.getString("name"); // Replace with your column name
                int age = resultSet.getInt("age");         // Replace with your column name
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Step 5: Close the resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
                System.out.println("Resources released successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
