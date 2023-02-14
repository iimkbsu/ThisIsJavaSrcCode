package ch05.sec05;

import java.util.*;

public class OwnPractice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String Comp_str1 = "ABCD,EFGH,IJKLMNOPQRSTU";
		String Comp_str2 = "ABCD,EFGH,IJKLMNOPQRSTU"; //Comp_str1과 같은 힙 영역 주소
		String Comp_str3 = new String("ABCD,EFGH,IJKLMNOPQRSTU"); //Comp_str1과 다른 힙 영역 주소
		
		
		//next() nextLine() 차이
		System.out.print("문자열 입력: ");
		String Input_str1 = scanner.nextLine(); //엔터, 스페이스도 입력받아 반환
		System.out.println(Input_str1);
		System.out.print("문자열 입력: ");
		String Input_str2 = scanner.next(); //엔터, 스페이스 전까지 문자열
		System.out.println(Input_str2);
		
		//문자열에서 문자 추출 charAt(인덱스)
		System.out.println(Comp_str1.charAt(3)); //D
		
		
		//문자열 길이
		System.out.println(Comp_str1.length()); //23
		
		//문자열 비교 equals(문자열), ==
		System.out.println(Comp_str1.equals(Comp_str2)); //true
		System.out.println(Comp_str1 == Comp_str2); //true
		
		System.out.println(Comp_str1.equals(Comp_str3)); //true
		System.out.println(Comp_str1 == Comp_str3); //false
		
		
		//문자열 안의 문자 존재여부 or 존재 인덱스 번호 indexOf(문자), contains(문자)
		System.out.println(Comp_str1.indexOf("G")); //7
		System.out.println(Comp_str1.indexOf("Z")); // -1
		System.out.println(Comp_str1.contains("G")); //True
		System.out.println(Comp_str1.contains("Z")); //False
		
		
		
		//문자열 부분만 출력 substring(인덱스, (인덱스))
		System.out.println(Comp_str1.substring(14)); //14포함 끝까지 반환
		System.out.println(Comp_str1.substring(14, 23));//14포함 22까지 반환
		System.out.println(Comp_str2.substring(0, 14));//0부터 13까지 반환
		
		
		//문자열에서 특정문자 기준으로 split("문자")  나눠진 문자열 배열을 토큰이라 함
		String[] Comp_strArray = Comp_str1.split(",");
		System.out.println(Comp_strArray[0]); //ABCD
		System.out.println(Comp_strArray[1]); //EFGH
		
		
		//문자열에서 특정문자 변경 replace("문자", "문자")
		System.out.println(Comp_str1.replace(",", "/")); //ABCD/EFGH/IJ...
		

	}

}
