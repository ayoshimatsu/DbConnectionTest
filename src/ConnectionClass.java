import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClass {

    static final String URL = "jdbc:mysql://localhost/testSample";
    static final String USERNAME = "???";
    static final String PASSWORD = "???";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement()) {

            String sql = "INSERT INTO music (name, title, year) VALUES ('Michael Jackson', 'Butterflies', 2001);";
            int result = statement.executeUpdate(sql);
            System.out.println("Result 1: " + result);

            sql = "INSERT INTO music (name, title, year) VALUES ('Aril Brikha', 'Groove', 1998);";
            result = statement.executeUpdate(sql);
            System.out.println("Result 2: " + result);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
