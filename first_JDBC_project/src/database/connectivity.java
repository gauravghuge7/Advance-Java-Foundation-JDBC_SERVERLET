package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectivity {

    protected static final String URL = "jdbc:mysql://localhost:3306/myDB";
    protected static final String USER = "root";
    protected static final String password = "Sangitabai7@";


    public static Connection connectDB() {
        Connection connection = null;

        try {

            Class.forName("Com.mysql.cj.jdbc.driver");

            /**
             * store the instance of the mysql
             */

            connection = DriverManager.getConnection(URL, USER, password);

        }
        catch (Exception e) {
            System.out.println("Exception => "+e);
            e.printStackTrace();
        }
        finally {
            System.out.println("Function is Runnning");
        }

        return connection;
    }
}
