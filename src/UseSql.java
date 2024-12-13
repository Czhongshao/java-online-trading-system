import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List; // 导入List和ArrayList


public class UseSql {
    private static final String QUERY_ALL_USERS;

    static {
        try {
            QUERY_ALL_USERS = new String(Files.readAllBytes(Paths.get("src/main/resources/sql/demo.sql")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<User> getUsers(Connection connection) throws SQLException { // 抛出SQLException
        try (PreparedStatement statement = connection.prepareStatement(QUERY_ALL_USERS)) {
            ResultSet rs = statement.executeQuery();
            List<User> users = new ArrayList<>();
            while (rs.next()) {
                users.add(new User(rs.getInt("id"), rs.getString("name"))); // 确保User类有相应的构造函数
            }
            return users;
        } // try-with-resources会自动关闭PreparedStatement和ResultSet
    }
}