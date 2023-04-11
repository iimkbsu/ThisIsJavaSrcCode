
/*
 
 문자열 관련 클래스
 
 	String				- 문자열 저장 및 기본 조작 클래스 (String으로 한 번 들어온 데이터는 못 바꿈)
 	StringBuilder		- 효율적인 문자열 조작 기능으로 문자열 완성해 나가는 클래스 (StringBuilder는 데이터 조작 가능)
 	StringTokenizer		- 토큰(구분자)으로 연결된 문자열 분리할 때 사용 클래스
 
 
 
 
 String 클래스 : 문자열 저장, 조작할 때 사용, 문자열 리터럴은 자동으로 String 타입 객체로 생성됨, String 클래스에 다양한 생성자를 사용하여 직접 객체 생성 가능
 
 	- byte[] → 문자열  (네트워크 통신시 사용)
 		String str = new String(byte[] bytes);
 		
 		String str = new String(byte[] bytes, String charsetName); 	(서로 기능 같음)
 		String str = new String(byte[] bytes, String charset); 		(서로 기능 같음)
 		
 		
 		
 	- 문자열 → byte[]  (네트워크 통신시 사용)
 		byte[] bytes = str1.getBytes();
 		byte[] bytes = str1.getBytes("유니코드이름");
 		
 
 OS에 따라 바이트 인코딩, 디코딩 유니코드가 다름
 	mac = (고정) UTF-8
 	windows = (default) MS944(= EUC-KR)
 	
 	
 */


package ch12.sec05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args) {
		
		String data ="자바";
		
		
		//String → byte[]  (기본 UTF-8 유니코드 인코딩)
		byte[] arr1 = data.getBytes();
		System.out.println("arr1 : " + Arrays.toString(arr1));

		//byte[] → String (기본 UTF-8 유니코드 디코딩)
		String str1 = new String(arr1);
		System.out.println(str1);
		System.out.println();
		
		
		
		//getBytes("유니코드 문자열")에서 잘못 된 유니코드 문자열 키가 들어왔을 경우에 대한 예외처리
		try {
			
			//String → byte[]  (EUC-KR 유니코드 인코딩)
			byte[] arr2 = data.getBytes("EUC-KR");
			System.out.println("arr2 : " + Arrays.toString(arr2));
			
			//byte[] → String (기본 UTF-8 유니코드로 디코딩) (제대로 된 문자열 복원 안 됨)
			String str2 = new String(arr2);
			System.out.println(str2);
			System.out.println();
			
			//////////////////////////////////////////////////////////////
			
			//String → byte[]  (EUC-KR 유니코드 인코딩)
			byte[] arr3 = data.getBytes("EUC-KR");
			System.out.println("arr2 : " + Arrays.toString(arr2));
			
			//byte[] → String (EUC-KR 유니코드 디코딩) (제대로 된 문자열 복원)
			String str3 = new String(arr3, "EUC-KR");
			System.out.println(str3);
			
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
	}

}





