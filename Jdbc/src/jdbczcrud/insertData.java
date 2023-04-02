package jdbczcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertData {
    public static void main(String[] args) {


        String url = ":mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "gagan12";

        try {
            Connection cn = DriverManager.getConnection(url, username, password);
            Statement st = cn.createStatement();


        } catch (SQLException s) {
            s.printStackTrace();
        }
        ;
    }
}
