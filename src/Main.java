import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 数据库连接信息
        String jdbcURL = "jdbc:mysql://localhost:3306/yourDatabase";
        String username = "yourUsername";
        String password = "yourPassword";

        // 加载数据库驱动（对于较新的JDBC驱动，这一步可能不是必需的）
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        // 建立数据库连接
        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            UseSql useSql = new UseSql();
            List<User> users = useSql.getUsers(connection);
            for (User user : users) {
                System.out.println(user); // 假设User类重写了toString方法
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}