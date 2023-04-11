
/*
 properties : 속성
 

 시스템 프로퍼티 : 자바 언어로 쓰여진 코드가 OS위에서 JVM을 통해 실행될 때 자동으로 설정되는 시스템 속성
 	- OS 종류, 사용자 정보, 자바 버전 등
 	
 사용법
 	- import java.util.Properties;
 	- System.getProperty("키 문자열");
 	
 	전체 속성
 	- Properties myprops = System.getProgerties();
 
 종류(키)
 	- java.specification.version		자바 버전
 	- java.home							JDK의 디렉토리 경로
 	- os.name							OS 이름
 	- user.name							사용자 이름
 	- user.home							사용자 홈 디렉토리 경로
 	- user.dir							현재 디렉토리 경로
 
 
 
 
 */

package ch12.sec04;


import java.util.Properties; //Key = Value 형태로 된 "파일이름.properties" 파일 또는 Xml파일,  Key를 주면 Value로 변환하는 기능 있음, DB 연결정보 저장용도로 많이 쓰임
import java.util.Set;//컬랙션 집합 Set 클래스, (중복X, 순서 및 정렬은 사용자 지정가능)


public class GetPropertyExample {

	public static void main(String[] args) {
		
		
		//getProperty("키") → value로 변환하여 저장
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		
		String userHome = System.getProperty("user.home");
		System.out.println(userHome);
		
		String javaVersion = System.getProperty("java.specification.version");
		System.out.println(javaVersion);
		
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		
		
		
		//Properties(모든속성정보) 클래스로 객체 생성
		Properties myprops = System.getProperties();
		
		//키들을 Set 클래스 변수에 저장 (set은 중복된 값 저장 안 함)
		Set keys = myprops.keySet();
		
		//키 set 컬랙션 집합의 데이터 개수만큼 반복하여 objkey에 각 데이터 저장
		for(Object objkey : keys) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n", key, value);
		}
		
		
	}

}









