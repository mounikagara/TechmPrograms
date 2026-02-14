package corejava1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysqldemo {
	 static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	    static String DB_URL = "jdbc:mysql://localhost:3306/mounidemo";
	    static String DB_USERNAME = "root";
	    static String DB_PASSWORD = "@mounika#14";
	    public static Connection dbcon() throws ClassNotFoundException, SQLException {

	        Class.forName(DB_DRIVER);

	        Connection con = DriverManager.getConnection(
	                DB_URL,
	                DB_USERNAME,
	                DB_PASSWORD
	        );

	        return con;
	    }
	}