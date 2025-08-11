import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb"; // DB name: mydb
        String user = "root"; // DB username
        String password = "password"; // DB password

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 1. Load the JDBC driver (optional for newer Java)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to the database
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to database!");

            // 3. Insert data
            String insertSQL = "INSERT INTO students (id, name) VALUES (?, ?)";
            pstmt = conn.prepareStatement(insertSQL);
            pstmt.setInt(1, 1);
            pstmt.setString(2, "Alice");
            pstmt.executeUpdate();
            System.out.println("✅ Data inserted");

            // 4. Read data
            String selectSQL = "SELECT * FROM students";
            pstmt = conn.prepareStatement(selectSQL);
            rs = pstmt.executeQuery();

            System.out.println("📄 Student Records:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + " - " + name);
            }

        } catch (SQLException e) {
            System.err.println("❌ SQL Error: " + e.getMessage());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.err.println("❌ JDBC Driver not found: " + e.getMessage());
        } finally {
            // 5. Close resources in reverse order
            try {
                if (rs != null)
                    rs.close();
            } catch (SQLException ignored) {
            }
            try {
                if (pstmt != null)
                    pstmt.close();
            } catch (SQLException ignored) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ignored) {
            }
        }
    }
}
