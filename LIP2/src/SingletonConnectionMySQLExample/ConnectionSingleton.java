/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonConnectionMySQLExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author mauricio.moreira
 */
public class ConnectionSingleton {
    private static ConnectionSingleton instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/exampledb?useSSL=true";
    private String username = "root";
    private String password = "mau123";
    
    private ConnectionSingleton() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Connection Failed. Error: " + e.getMessage());
        }
    }
    public Connection getConnection() {
        return connection;
    }
    public static ConnectionSingleton getInstance() throws SQLException {
        if (instance == null) {
            instance = new ConnectionSingleton();
            System.out.println("Success Connection!");
        } else if (instance.getConnection().isClosed()) {
            instance = new ConnectionSingleton();
        }
        return instance;
    }
}
