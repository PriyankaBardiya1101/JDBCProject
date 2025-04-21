package jdbc.comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn=null;
		
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost/morningbatch","root","Bardiya11@");
			
			if(conn==null) {
				System.out.println("Its not Establish");
			}else {
				System.out.println("Its establish");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
