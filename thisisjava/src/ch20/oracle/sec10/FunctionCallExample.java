package ch20.oracle.sec10;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class FunctionCallExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");
			
			String sql = "{? = call user_login(?, ?)}";
			CallableStatement cstmt = conn.prepareCall(sql);
			
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.setString(2, "summer");
			cstmt.setString(3, "pw12345");
			
			cstmt.execute();
			
			int result = cstmt.getInt(1);
			
			cstmt.close();
			
			String message = switch(result) {
				case 0 -> "로그인 성공";
				case 1 -> "비밀번호 틀림";
				default -> "아이디가 존재하지 않음";
			};
			System.out.println(message);
			
			
		}catch(ClassNotFoundException e) {
			
		}catch(SQLException e) {
			
		}finally {
			if(conn !=null) {
				try {
					conn.close();
				}catch(SQLException e) {}
			}
		}

	}

}
