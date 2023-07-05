package ch20.Quiz.Quiz10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import ch20.Quiz.Quiz08.User;
import ch20.oracle.sec12.Board;

public class BoardCompleteExample {
	
	private Scanner scanner = new Scanner(System.in);
	
	private Connection conn = null;
	
	private String loginId;
	
	public BoardCompleteExample() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");
		}catch(Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]\t" + ((loginId != null)? ("사용자 : " + loginId) : ""));
		System.out.println("----------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("----------------------------------------------------------");
		
		try {
			String sql = new StringBuilder().append("SELECT bno, btitle, bcontent, bwriter, bdate ")
					.append("FROM boards ")
					.append("ORDER BY bno DESC").toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s\n", board.getBno(), board.getBwriter(), board.getBdate(), board.getBtitle());
			}
			
			rs.close();
			pstmt.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
			exit();
		}
		mainMenu();
	}
	
	public void mainMenu() {
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		if(loginId == null) {
			System.out.println("메인메뉴 : 1.Create | 2.Read | 3.Clear | 4.Join | 5.Login | 6.Exit");
			System.out.print("메뉴 선택 : ");
			String menuNo = scanner.nextLine();
			System.out.println();
			
			switch(menuNo) {
			case "1" -> create();
			case "2" -> read();
			case "3" -> claer();
			case "4" -> join();
			case "5" -> login();
			case "6" -> exit();
			}
			
		}else {
			System.out.println("메인메뉴 : 1.Create | 2.Read | 3.Clear | 4.Logout | 5.Exit");
			System.out.print("메뉴 선택 : ");
			String menuNo = scanner.nextLine();
			System.out.println();
			
			switch(menuNo) {
			case "1" -> create();
			case "2" -> read();
			case "3" -> claer();
			case "4" -> logOut();
			case "5" -> exit();
			
			}
		}
		
	}
	
	public void login() {
		User user = new User();
		
		System.out.println("[로그인]");
		System.out.print("아이디 : ");
		user.setUserId(scanner.nextLine());
		System.out.print("비밀번호 : ");
		user.setUserPassword(scanner.nextLine());
		System.out.println("----------------------------------------");
		System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택 : ");
		String menuNo = scanner.nextLine();
		
		if(menuNo.equals("1")) {
			
			 try {
				 
				 String sql = "SELECT userpassword FROM users WHERE userid= ?";
				 PreparedStatement pstmt = conn.prepareStatement(sql);
				 pstmt.setString(1, user.getUserId());
				 ResultSet rs = pstmt.executeQuery();
				 
				 if(rs.next()) {
					 String dbPassword = rs.getString("userpassword");
					 if(dbPassword.equals(user.getUserPassword())) {
						 loginId = user.getUserId();
					 } else {
						 System.out.println("비밀번호가 일치하지 않습니다.");
					 }
				 } else {
					 System.out.println("아이디가 존재하지 않습니다.");
				 }
				 rs.close();
				 pstmt.close();
				 
			 } catch (Exception e) {
				 e.printStackTrace();
				 exit();
			 }
		}
		list();
	}
	
	
	public void logOut() {
		loginId = null;
		
		list();
	}
	
	public void join() {
		
		User user = new User();
		
		System.out.println("[새 사용자 입력]");
		System.out.print("아이디 : ");
		user.setUserId(scanner.nextLine());
		System.out.print("이름 : ");
		user.setUserName(scanner.nextLine());
		System.out.print("비밀번호 : ");
		user.setUserPassword(scanner.nextLine());
		System.out.print("나이 : ");
		while(true) {
			try {
				user.setUserAge(Integer.parseInt(scanner.nextLine()));
				break;
			}catch(NumberFormatException e) {
				System.out.println("숫자를 입력해주세요");
				System.out.print("나이 : ");
			}
		}
		
		
		System.out.print("이메일 : ");
		user.setUserEmail(scanner.nextLine());
		System.out.println("--------------------------------------");
		System.out.println("보조메뉴 : 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택 : ");
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			try {
				String sql = ""+"INSERT INTO users (userid, username, userpassword, userage, useremail) " 
						+ "VALUES (?, ?, ?, ?, ?)";
				
			PreparedStatement pstmt2 = conn.prepareStatement(sql);
			
			pstmt2.setString(1, user.getUserId());
			pstmt2.setString(2, user.getUserName());
			pstmt2.setString(3, user.getUserPassword());
			pstmt2.setInt(4, user.getUserAge());
			pstmt2.setString(5, user.getUserEmail());
			
			pstmt2.executeUpdate();
			pstmt2.close();
			
			}catch(SQLException e) {
				System.out.println("** 신규가입이 취소되었습니다.");
				e.printStackTrace();
			}
			
			System.out.println("** 신규가입이 완료되었습니다.");
			
			list();
			
		}else {
			System.out.println("** 신규가입이 취소되었습니다.");
			list();
		}
		
		
		
	}
	
	public void create() {
		
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.print("제목 : ");
		board.setBtitle(scanner.nextLine());
		System.out.print("내용 : ");
		board.setBcontent(scanner.nextLine());
		if(loginId == null) {
			System.out.print("작성자 : ");
			board.setBwriter(scanner.nextLine());
		}else {
			board.setBwriter(loginId);
		}
		
		
		System.out.println("-------------------------------------");
		System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택 : ");
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			try {
				String sql = new StringBuilder().append("INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate) ")
						.append("VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE)").toString();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.executeUpdate();
				pstmt.close();
				
			}catch(Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		System.out.println("*** create() 메소드 실행됨");
		list();
	}
	public void read() {
		
		System.out.println("[게시물 읽기]");
		System.out.print("bno : ");
		int bno = Integer.parseInt(scanner.nextLine());
		
		try {
			String sql = "" + "SELECT bno, btitle, bcontent, bwriter, bdate " + "FROM boards " + "WHERE bno = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				
				System.out.println("#################");
				System.out.println("번호 : " + board.getBno());
				System.out.println("제목 : " + board.getBtitle());
				System.out.println("내용 : " + board.getBcontent());
				System.out.println("작성자 : " + board.getBwriter());
				System.out.println("날짜 : " + board.getBdate());
				System.out.println("#################");
				
				if(loginId != null && loginId.equals(board.getBwriter())) {
					System.out.println("--------------------------");
					System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List");
					System.out.print("메뉴 선택 : ");
					String menuNo = scanner.nextLine();
					System.out.println();
					
					if(menuNo.equals("1")) {
						update(board);
					}else if(menuNo.equals("2")) {
						delete(board);
					}
				}
				
			}
			rs.close();
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
			exit();
		}
		
		System.out.println("*** read() 메소드 실행됨");
		list();
	}
	
	public void update(Board board) {
		System.out.println("[수정 내용 입력]");
		System.out.print("제목 : ");
		board.setBtitle(scanner.nextLine());
		System.out.print("내용 : ");
		board.setBcontent(scanner.nextLine());
		
		System.out.println("------------------------------------");
		System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택 : ");
		
		String menuNo = scanner.nextLine();
		
		if(menuNo.equals("1")) {
			try {
				String sql = new StringBuilder().append("UPDATE boards SET btitle = ?, bcontent = ?, bwriter = ? ")
						.append("WHERE bno = ?").toString();
				
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.setInt(4, board.getBno());
				pstmt.executeUpdate();
				pstmt.close();
				
			}catch(Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
		
	}
	
	public void delete(Board board) {
		
		try {
			String sql = "DELETE FROM boards WHERE bno = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBno());
			pstmt.executeUpdate();
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
			exit();
		}
		list();
	}
	
	
	
	public void claer() {
		
		System.out.println("[모든 게시물 삭제]");
		System.out.println("-----------------------------------");
		System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택 : ");
		String menuNo = scanner.nextLine();
		
		if(menuNo.equals("1")) {
			try {
				String sql = "TRUNCATE TABLE boards";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
				pstmt.close();
			}catch(Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
		
		
		System.out.println("*** clear() 메소드 실행됨");
		list();
	}
	public void exit() {
		if(conn != null) {
			try {
				conn.close();
			}catch(SQLException e) {
				
			}
		}
		System.out.println("** 게시판 종료");
		System.exit(0);
	}

	public static void main(String[] args) {
		
		BoardCompleteExample bc = new BoardCompleteExample();
		bc.list();

	}

}
