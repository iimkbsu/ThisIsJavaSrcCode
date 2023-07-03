package ch20.oracle.sec06;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardWithFileInsertExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");
			
			String sql = new StringBuilder().append("INSERT INTO BOARDS (BNO, BTITLE, BCONTENT, BWRITER, BDATE, BFILENAME, BFILEDATA) ")
					.append("VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)").toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"BNO", "btitle"});
			
			pstmt.setString(1, "눈오는 날");
			pstmt.setString(2, "폭설이 내려요");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "winter.jpg");
			FileInputStream fis = new FileInputStream("src/ch20/oracle/sec06/snowman.jpg");
			pstmt.setBlob(5, fis);
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수 : " + rows);
			
			// BNO 값 얻기
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("저장된 bno : " + bno);
					
					String btitle = rs.getString(2);
					System.out.println("저장된 btitle :" + btitle);
				}
				rs.close();
			}
			
			pstmt.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {
					
				}
			}
		}

	}

}
