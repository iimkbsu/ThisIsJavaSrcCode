package ch20.oracle.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {

	public static void main(String[] args) {
		
		
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "java", "oracle");){
				String sql = new StringBuilder()
						.append("INSERT INTO users (userid, username, userpassword, userage, useremail) ")
						.append("VALUES (?, ?, ?, ?, ?)")
						.toString();
				
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "winter");
				pstmt.setString(2, "한겨울");
				pstmt.setString(3, "12345");
				pstmt.setInt(4, 25);
				pstmt.setString(5, "winter@naver.com");
				
				int rows = pstmt.executeUpdate();
				System.out.println("저장된 행 수 : " + rows);
				
				pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}

	}

}
