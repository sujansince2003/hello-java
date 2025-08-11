import java.sql.*;

public class KathmanduStudents {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/schooldb"; // Change DB name
        String user = "root"; // Your DB username
        String password = "password"; // Your DB password

        String query = "SELECT name FROM student WHERE district = ?";

        try {
            // 1. Load JDBC Driver (optional in modern Java, but safe to include)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // 3. Create PreparedStatement
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "Kathmandu"); // Fill the placeholder '?'

            // 4. Execute the query
            ResultSet rs = pstmt.executeQuery();

            // 5. Process the results
            System.out.println("Students living in Kathmandu:");
            while (rs.next()) {
                String name = rs.getString("name");
                System.out.println(name);
            }

            // 6. Close resources
            rs.close();
            pstmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error!");
            e.printStackTrace();
        }
    }
}
