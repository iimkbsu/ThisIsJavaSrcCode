
/*
 
 리플랙션
 	- 자바의 클래스나 인터페이스(추상클래스)의 메타정보(패키지, 멤버, 타입 정보 등)를 프로그램을 통해 읽고 수정하는 행위
 	
 	- 클래스 정보 얻기
 		- Class myClass = 클래스명.class;								: 클래스 자체에서 얻기
 		- Class myClass = Class.forName("패키지.패키지...클래스명");		: 클래스 자체에서 얻기
 		
 		- Class myClass = 클래스참조객체.getClass();						: 클래스를 참조하는 객체로부터 얻기
 		
 
 	- 패키지 및 타입 정보 얻기
 		- 클래스정보.getPackage();			: 패키지 정보 읽기 (Package 타입)
 		- 클래스정보.getSimpleName();		: 패키지 제외한 타입 이름 (String 타입)
 		- 클래스정보.getName();				: 패키지 포함 전체 타입 이름 (String 타입)
 		
 	
 	- 맴버(생성자, 필드, 메소드) 정보 얻기 (import java.lang.reflect.*)
 		- 클래스정보.getDeclaredConstructors()		: 생성자 정보 읽기 (Constructor[] 타입) (.getParameterTypes()으로 매개변수 받고 printParameters()로 출력)
 		- 클래스정보.getDeclaredFields()			: 필드 정보 읽기 (Field[] 타입) 
 		- 클래스정보.getDeclaredMethods()			: 메소드 정보 읽기 (Method[] 타입) (.getParameterTypes()으로 매개변수 받고 printParameters()로 출력)
 		
 			*Declared는 '선언된' 이라는 뜻인데 사용자 선언 말고 자동 선언된 생성자도 포함임
 
 	
 	
 	- 리소스 경로 얻기 (이미지, xml, 프로퍼티 등 리소스의 경로)
 		- 클래스정보.getResource(String 리소스이름);					: 리소스 파일의 URL(경로) 리턴 (URL 타입)
 		- 클래스정보.getResource(String 리소스이름).getPath();			: 리소스 파일의 URL을 문자열 경로로 리턴 (String 타입)
 		- 클래스정보.getResourceAsStream(String 리소스이름);			: 리소스 파일의 InputStream(파일데이터)을 리턴 (InputStream 타입)
 		
 		
 			* 리소스 위치
 			 	- bin 폴더의 해당 클래스(.class)가 위치한 폴더
 		
 			* 자바 Stream (자세한 건 18장에서)
 				- 외부로 데이터를 가져오거나 보내는 흐름. 또는 그 흐름의 통로
 				- 다양한 데이터 소스를 표준화된 방법으로 다루기 위해 도입됨 (Set, List, Map 등의 사용법을 표준화시킴)
 				
 			* input/output Stream
 				- 바이트 기반 입출력 스트림의 최상위 추상 클래스
 				
 	
 	
 
 */


//리소스 경로 얻기
package ch12.sec11.exam03;

import java.io.InputStream;

public class GetResourceExample {

	public static void main(String[] args) {
		
		Class myClass = Car.class;
		
		String photo1Path = myClass.getResource("m340i_lci.jpg").getPath();
		String photo2Path = myClass.getResource("images/m340i_lci2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
		System.out.println();
		
		InputStream img1Stream = myClass.getResourceAsStream("m340i_lci.jpg");
		InputStream img2Stream = myClass.getResourceAsStream("images/m340i_lci2.jpg");
		
		System.out.println(img1Stream);
		System.out.println(img2Stream);
		System.out.println();
	}

}




