import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDatabase {

    // Database credentials and URL
    static final String URL = "jdbc:mysql://localhost:3306/yourDatabaseName"; // Replace with your database URL
    static final String USER = "yourUsername"; // Replace with your database username
    static final String PASSWORD = "yourPassword"; // Replace with your database password

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Database connected successfully.");

            // Accept the number of students
            System.out.print("Enter the number of students: ");
            int n = scanner.nextInt();

            // Insert student data into the database
            String insertQuery = "INSERT INTO students (rollno, name, cgpa) VALUES (?, ?, ?)";
            try (PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {
                for (int i = 1; i <= n; i++) {
                    System.out.println("Enter details for student " + i + ":");
                    
                    System.out.print("Roll No: ");
                    int rollno = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("CGPA: ");
                    double cgpa = scanner.nextDouble();

                    // Set values for the query parameters
                    insertStmt.setInt(1, rollno);
                    insertStmt.setString(2, name);
                    insertStmt.setDouble(3, cgpa);

                    // Execute the insert command
                    insertStmt.executeUpdate();
                    System.out.println("Student " + i + " added successfully.");
                }
            }

            // Retrieve and display students with CGPA > 7.0
            System.out.println("\nStudents with CGPA greater than 7:");
            String selectQuery = "SELECT * FROM students WHERE cgpa > 7.0";
            try (PreparedStatement selectStmt = connection.prepareStatement(selectQuery);
                 ResultSet resultSet = selectStmt.executeQuery()) {

                while (resultSet.next()) {
                    int rollno = resultSet.getInt("rollno");
                    String name = resultSet.getString("name");
                    double cgpa = resultSet.getDouble("cgpa");

                    System.out.println("Roll No: " + rollno + ", Name: " + name + ", CGPA: " + cgpa);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
