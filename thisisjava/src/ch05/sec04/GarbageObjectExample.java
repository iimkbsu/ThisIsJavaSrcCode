package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		
		String hobby = "여행";
		hobby = null; // 힙 영역에 "여행"이라는 문자열 값이 쓰레기 객체가 됨.
		
		
		//kind1은 kind2에 대입하는 용도로 사용한 후 정리함
		
		String kind1 = "자동차"; // kind1의 임의 주소값 10이라는 힙 영역에 "자동차" 참조중
		String kind2 = kind1; // kind2에 주소값 10넣어주고 "자동차" 참조중
		kind1 = null; // kind1의 주소값 null, 주소값10의 "자동차"는 kind2에서 계속 참조중
		System.out.println(kind2); 

	}

}
