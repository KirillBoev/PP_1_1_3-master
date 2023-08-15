package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static String PASSWORD = "root";
    private static String USERNAME = "root";
    private static String URL = "jdbc:MySQL://localhost:3306/bdtest";


    public static Connection getConnectionToDataBase() {
        Connection connection;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Соединение с базой не установленно" + e);
            throw new RuntimeException(e);
        }
        return connection;
    }
}