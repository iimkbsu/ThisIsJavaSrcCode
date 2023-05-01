package ch15.sec03.exam02;

import java.util.Set;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		// HashSet은 객체중복X 순서X 없는 자료구조
		
		// Member 클래스에 hashCode()와 equals() 메소드를 재정의
		
		// 원래는 동등객체 아니지만 이름과 나이가 같다면 동등객체로 판단하는 Member 클래스 사용
		
		Set<Member> mySet = new HashSet<>();
		
		mySet.add(new Member("홍길동", 33));
		mySet.add(new Member("홍길동", 33)); //동등객체로 판단하여 중복발생
		
		mySet.add(new Member("김개똥", 12));
		
		System.out.println("HashSet 저장 개수 : "+mySet.size());
		
		
		
		
		System.out.println("HashSet 저장 개수 : "+mySet.size());
		

	}

}
