package ch05.sec08;

import java.util.Arrays;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		int[] intArray = new int[4];
		intArray[0] = 1;
		intArray[1] = 1;
		intArray[2] = 3;
		// intArray = 힙 영역에 저장된 {1,2,3}
		
		System.out.println(intArray[0]); //1
		System.out.println(intArray[1]); //2
		System.out.println(intArray[2]); //3
		System.out.println(intArray[3]); //0
		System.out.println(intArray[0] == intArray[1]); //true
		System.out.println();
		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "C++";
		strArray[2] = "C#";
		// strArray = 힙 영역에 저장된 {1번지, 2번지, 3번지}
		// 1번지 -> 객체"Java"     2번지 -> 객체"C++"     3번지 -> 객체"C#"
		
		String[] language = new String[3];
		language[0] = "Java";
		language[1] = "Java";
		language[2] = new String("Java");
		
		System.out.println(language[0]);
		System.out.println(language[1]);
		System.out.println(language[2]);
		System.out.println();
		System.out.println(language[0] == language[1]); //true (같은 객체주소 참조)
		System.out.println(language[0] == language[2]); //false (다른 객체주소 참조)
		System.out.println(language[1] == language[2]); //false (다른 객체주소 참조)
		System.out.println();
		System.out.println(language[0].equals(language[1])); //true (문자열 같음)
		System.out.println(language[0].equals(language[2])); //true (문자열 같음)
		System.out.println();
		
		/*
		arr1.equals(arr2): 배열의 번지 비교 (문자열 그대로 비교 가능, 문자열 참조 주소비교는 ==)

		Arrays.equals(arr1, arr2): 배열의 1차 항목값만 비교 (문자열은 암 됨)

		Arrays.deepEquals(arr1, arr2): 중첩 배열의 모든 항목값 비교
		*/
		
		/*
		 str1.equals(str2): 문자열 그대로 비교
		 str1 == str2 : 문자열이 들어있는 힙 영역의 참조 주소 비교
		 */
		
		int[] intArray2 = new int[3];
		intArray2[0] = 1;
		intArray2[1] = 1;
		intArray2[2] = 2;
	
		System.out.println(intArray2[0] == intArray2[1]); //true
		System.out.println(intArray2[1] == intArray2[2]); //false
		System.out.println(intArray2[0] == intArray2[2]); //false
		
		int[] intArray1 = {1, 1, 2};
		
		System.out.println(intArray2 == intArray1); //false
		System.out.println(intArray2.equals(intArray1)); //false
		
		System.out.println(Arrays.equals(intArray2, intArray1)); //true
		

	}

}
