package corejava1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Mysqldemomain {
		// TODO Auto-generated method stub
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Connection con = Mysqldemo.dbcon();
		if(con!=null) {
			System.out.println("s");
		}
		else {
			System.out.println("Ns");
		}
				int i=0;
					try {
						String q="CREATE TABLE Student1(id INT,name VARCHAR(50),email VARCHAR(50))";
						PreparedStatement ps = con.prepareStatement(q);
					i=ps.executeUpdate();
					}
					catch(Exception e) { e.printStackTrace();
					}
				
				System.out.println("data created");
				
				
				
				
				
				con.close();
	}

}
