import java.sql.*;

public class MoodDAO {
    private Connection conn;

    public MoodDAO() {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the mooddb database with root user and no password
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mooddb", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean saveMood(String name, String mood) {
        try {
            // Insert mood record with current date
            String sql = "INSERT INTO moods(name, mood, date) VALUES (?, ?, CURDATE())";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, mood);

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

