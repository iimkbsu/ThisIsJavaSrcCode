package ch05.sec03;

import java.util.Arrays;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		
		/*
		 new는 클래스 타입의 인스턴스(객체)를 생성해주는 역할을 담당한다. 
		 여기에 조금 더 설명을 붙이면,
		 new 연산자를 통해 메모리(Heap 영역)에 데이터를 저장할 공간을 할당받고 
		 그 공간의 참조값(reference value /해시코드)을 객체에게 반환하여 주고
		 (메모리, 객체 및 인스턴스 포스팅 참고) 이어서 생성자를 호출하게 된다. 
		 인스턴스를 핸들하기 위해서는 new 연산자를 통해 참조값을 저장한 객체로만 접근이 가능하다.
		
		*/
		
		// 클래스(자료형) 객체변수 = new(힙 할당 + 인스턴스 생성 + 참조값 리턴) 클래스(생성자 호출);
		
		int[] arr = {1, 2, 3};
		int[] arrr = {1, 2, 3};
		
		System.out.println(arr); // 힙 영역 주소값 나옴
		System.out.println(arrr); //힙 영역 주소값 나옴
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr1, arr2, arr3;
		
		arr1 = new int[] {1, 2, 3};
		
		System.out.println(arr1);//힙 영역 주소값 나옴
		
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		System.out.println(arr2);//힙 영역 주소값 나옴
		System.out.println(arr3);//힙 영역 주소값 나옴, arr2와 같음
		
		System.out.println("1." + (arr == arrr)); //false
		
		System.out.println("2." + (arr == arr1)); //false
		
		System.out.println("3." + (arr == arr2)); //false
		
		System.out.println("4." + (arr1 == arr2)); //false
		
		System.out.println("5." + (arr2 == arr3)); //true
		
		String name3 = "김범수";

		String name1 = "김범수";
		System.out.println(name1);//김범수 나옴
		
		String name;
		name = new String("김범수");
		System.out.println(name);//김범수 나옴
		
		System.out.println("6." + (name1 == name)); //false
		
		String name2 = name1;
		System.out.println("7." + (name2 == name1));//true
		
		System.out.println("77." + (name3 == name1));//true
		
		
		char[] char_array = {'1', '2'};
		System.out.println(char_array);//12 나옴
		char[] charr = {'1', '2'};
		
		char[] char2;
		char2 = new char[] {'1', '2'};
		System.out.println(char2);//12 나옴
		
		System.out.println("8." + (char_array == charr)); //false
		System.out.println("9." + (char_array == char2)); //false
		
		char[] char3 = char2;
		System.out.println("10." + (char3 == char2)); //true
		
		
	}

}
