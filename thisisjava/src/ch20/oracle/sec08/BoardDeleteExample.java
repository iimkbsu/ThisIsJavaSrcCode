package ch20.oracle.sec08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteExample {

	public static void main(String[] args) {
		
		
		Connection conn = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");
			
			String sql = "" + "DELETE FROM boards WHERE bwriter = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			int rows = pstmt.executeUpdate();
			System.out.println("제거된 행 수 : " + rows);
			
		}catch(Exception e) {
			
		}finally {
			if(conn !=null) {
				try{
					conn.close();
				}catch(SQLException e) {}
			}
		}

	}

}
