
/*
 HashSet 컬랙션 : hashCode()와 equals()가 재정의 되어있는 클래스. 동등객체(여기서는 학생 번호와 학생 이름이 같다고 정의)일 경우 중복을 허용하지 않음
 
 java.util.HashSet
 
 */

package ch12.sec03.exam02;

//HashSet 컬렉션 import
import java.util.HashSet;


public class HashSetExample {
	public static void main(String[] args) {
		
		//해시셋 컬렉션 생성
		HashSet hashSet = new HashSet();
		
		//std1 학생 객체를 만든 후 해시셋 컬랙션에 저장
		Student std1 = new Student(1, "홍길동");
		hashSet.add(std1);
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		//공동객체 중복되어 해시셋에 저장하지 않음
		Student std2 = new Student(1, "홍길동");
		hashSet.add(std2);
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		
		Student std3 = new Student(2, "홍길동");
		hashSet.add(std3);
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		
		Student std4 = new Student(1, "임꺽정");
		hashSet.add(std4);
		System.out.println("저장된 객체 수 : " + hashSet.size());

	}

}