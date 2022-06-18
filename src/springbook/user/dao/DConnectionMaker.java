package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        final Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost/tobyspring", "root", "05220102"
        );
        return c;
    }
}
