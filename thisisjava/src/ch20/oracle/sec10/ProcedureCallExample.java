package ch20.oracle.sec10;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedureCallExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");
			
			
			String sql = "{call user_create(?, ?, ?, ?, ?, ?)}";
			CallableStatement cstmt = conn.prepareCall(sql);
			
			cstmt.setString(1, "summer");
			cstmt.setString(2, "한여름");
			cstmt.setString(3, "pw12345");
			cstmt.setString(4, "26");
			cstmt.setString(5, "summer@yahoo.co.kr");
			cstmt.registerOutParameter(6, Types.INTEGER);
			
			cstmt.execute();
			int rows = cstmt.getInt(6);
			System.out.println("저장된 행 수 : " + rows);
			
			cstmt.close();
			
		}catch(ClassNotFoundException e) {
			
		}catch(SQLException e) {
			
		}finally{
			if(conn !=null) {
				try {
					conn.close();
				}catch(SQLException e) {}
			}
		}

	}

}
