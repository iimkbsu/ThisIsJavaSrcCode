package ch12.sec03.exam05;

import java.util.HashSet;

public class MemberExample {

	public static void main(String[] args) {
		
		//Member 클래스는 lombok 라이브러리를 import 하고 있음
		//Member 클래스는 @Data, @AllArgsConstructor, @RequiredArgsConstructor 어노테이션 하고 있음
		
		//필드
		//private final String id
		//@NonNull private String name
		//private int age
		
		
		//m1이 만들어 질 때 @RequiredArgsConstructor 어노테이션으로 인해 id와 name만 초기화 가능한 객체 만들 수 잇음
		Member m1 = new Member("id1", "Null아님");
		Member m3 = new Member("id1", "Null아님");
		
		//m2가 만들어 질 때 @AllArgsConstructor 어노테이션으로 인해 id name age 모두 초기화 하는 객체 만들 수 있음
		Member m2 = new Member("id2", "Null아님", 60);
		
		
		
		
		
		//Member 객체는 @Data 어노테이션으로 인해 getter, setter, toString() 등 포함되어 있음
		System.out.println(m1);
		//toString() 하지 않아도 객체 데이터를 자동으로 문자열 출력해줌
		System.out.println(m1.toString());
		System.out.println();
		
		System.out.println(m2);
		System.out.println(m2.toString());
		System.out.println();
		
		//equals()와 hashCode()는 lombok에서 자동 재정의 되어있는 상태이므로 동등객체로 판단
		System.out.println(m1.equals(m3));
		System.out.println(m1.hashCode() == m3.hashCode());
		System.out.println();
		
		//동등 객체 중복 저장 X
		HashSet hashset = new HashSet();
		hashset.add(m1);
		hashset.add(m3);
		//m1과 m3는 동등객체로 판단하여 hashset에는 하나의 객체만 저장됨
		System.out.println(hashset.size());
	}

}




