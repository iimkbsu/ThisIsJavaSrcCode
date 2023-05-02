//
// 	Properties 클래스
//		- 동기화 되어 있음 (∵ Hashtable의 자식클래스)
//		- 엔트리 키, 값을 String 타입으로 제한한 컬렉션
//		- 파일명.properties(=프로퍼티 파일)를 읽을 때 사용
//		
//			# 예제.properties (프로퍼티 파일) 
//			
//				// String키=String값 으로 구성
//				// ISO 8859-1 문자셋으로 구성되어있음
//				// \u 는 유니코드를 나타냄
//			
//				driver=oracle.jdbc.OracleDriver
//				url=jdbc:oracle:thin:@localhost:1521:orcl
//				username=scott
//				password=tiger
//				admin=\uD64D\uAE38\uB3D9
//				
//				
//
//	□□□□ Properties 만들기 □□□□
//
//		Properties myProperties = new Properties();
//		
//		myProperties.load(클래스명.class.getResourceAsStream("프로퍼티명.properties"));
//		
//			# 프로퍼티 파일은 보통 관련 클래스와 같은 경로에 리소스로 저장되므로 리플렉션 클래스를 통해 리소스스트림(inputStream객체)을 load()시켜 myProperties로 저장



package ch15.sec04.exam03;

import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		
		Properties myProperties = new Properties();
		
		myProperties.load(PropertiesExample.class.getResourceAsStream("database.properties"));
		
		
		String driver = myProperties.getProperty("driver");
		String url = myProperties.getProperty("url");
		String username = myProperties.getProperty("username");
		String password = myProperties.getProperty("password");
		String admin = myProperties.getProperty("admin");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println(admin);

	}

}


