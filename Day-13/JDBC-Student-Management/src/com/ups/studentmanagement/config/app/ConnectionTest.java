
package com.ups.studentmanagement.app;

import com.ups.studentmanagement.config.DatabaseConnection;
import java.sql.Connection;

public class ConnectionTest {
    public static void main(String[] args) {
        Connection con = DatabaseConnection.getConnection();

        if (con != null) {
            System.out.println("Connection test passed!");
        } else {
            System.out.println("Connection test failed!");
        }
    }
}
