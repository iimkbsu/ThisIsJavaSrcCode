package ch15.sec03.exam01;

import java.util.Set;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> mySet = new HashSet<>();
		
		mySet.add(null);
		mySet.add(null); //HashSet null도 중복 저장 안 됨
		mySet.add(null); //HashSet null도 중복 저장 안 됨
		
		mySet.add("Java"); //자바. 객체지향언어
		mySet.add("Java"); // 중복 저장 안 됨
		mySet.add("JDBC"); // JDBC. 자바에서 DB접근을 하기위한 API
		mySet.add("JSP"); // 동적 웹페이지에 자바 언어를 올리기 위한 자바 서버사이드 스크립터언어
		mySet.add("Spring"); // 동적 웹페이지 개발에 필요한 다양한 서비스를 제공하는 프레임워크
		
		
		System.out.println(mySet.size());
		

	}

}
