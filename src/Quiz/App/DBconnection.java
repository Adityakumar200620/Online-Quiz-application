package Quiz.App;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/students",
                    "root",
                    "Aditya@1234"
            );
        } catch (Exception e) {
            System.out.println("DB not available (local). Skipping insert.");
            return null;
        }
    }
}

