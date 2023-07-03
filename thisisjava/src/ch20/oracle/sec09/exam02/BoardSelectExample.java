package ch20.oracle.sec09.exam02;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardSelectExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");
			
			
			
			String sql = new StringBuilder().append("SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata ").append("FROM boards ").append("WHERE bwriter=?").toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt(1));
				board.setBtitle(rs.getString(2));
				board.setBwriter(rs.getString(3));
				board.setBcontent(rs.getString(4));
				board.setBdate(rs.getDate(5));
				board.setBfilename(rs.getString(6));
				board.setBfiledata(rs.getBlob(7));
				
				System.out.println(board);
				
				Blob blob = board.getBfiledata();
				if(blob != null) {
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("C:/ThisIsJavaTemp/" + board.getBfilename());
					is.transferTo(os);
					os.flush();
					os.close();
					is.close();
				}
			}
			
			rs.close();
			pstmt.close();
			
				
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			
		}

	}

}
