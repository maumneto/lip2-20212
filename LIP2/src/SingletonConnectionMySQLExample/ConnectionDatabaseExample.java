/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonConnectionMySQLExample;

import java.sql.SQLException;

/**
 *
 * @author mauricio.moreira
 */
public class ConnectionDatabaseExample {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectionSingleton firstConn;
        ConnectionSingleton secondConn;
        try {
            firstConn = ConnectionSingleton.getInstance();
            System.out.println(firstConn);
            secondConn = ConnectionSingleton.getInstance();
            System.out.println(secondConn);
            if (firstConn == secondConn) {
                System.out.println("Same instances");
            } else {
                System.out.println("Different instances");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
