package ch05.sec04;

public class NullPointerExemptionExample {

	public static void main(String[] args) {
		//null = 주소값이 없다는 뜻 (스택 영역에 변수만 저장되어 있고 힙 영역에 저장된 값이 없어서 주소가 null)
		
		int[] intArray = null; //객체를 참조하고 있지 않은 상태
		//intArray[0] = 10; //NullPointerExemption 에러
		
		intArray = new int[2]; //8byte, 2개의 값을 담을 수 있는 배열을 new로 초기화시켜 힙 영역에 생성
		intArray[0] = 100;
		System.out.println(intArray[0]);
		

		int[] intArray2;
		intArray2 = new int[3];
		intArray2[0] = 10;
		System.out.println(intArray2[0]);
		
		String str = null;
		//System.out.println(str.length());//NullPointerExemption 에러
		
		str = "ss";
		
		System.out.println(str.length());

	}

}
