package ch20.oracle.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {

	public static void main(String[] args) {
		
		/*
		Connection conn = null;
		
		try {
			//JDBC Driver 메모리에 로딩하고 DriverManager에 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			// DB연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");
			System.out.println("DB 연결 성공");
			
			//":thin:@Ip주소or도메인:Port번호/DB이름", "사용자이름", "사용자암호"
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}catch(SQLException e1) {
			e1.printStackTrace();
			
		}finally {
			
			if(conn != null) {
				try {
					//DB연결 끊기
					conn.close();
					System.out.println("DB 연결 끊기");
					
				}catch(SQLException e) {
					
				}
			}
		}
		*/
		
		
		//Connection 클래스가 autocloseable 구현하므로 아래처럼 작성해도 됨
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle")){
				System.out.println("DB 연결 성공");
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			System.out.println("DB 연결 끊김");
		}catch(ClassNotFoundException e) {
			
		}
		
		
		

	}

}
