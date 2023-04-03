
/*
 해시코드 : 객체의 동등성 비교, 객체의 주소값 int로 가지고옴
 보통 재정의 하여 사용
 
 hashCode() : false면 서로 다른 객체, true면 equals()가 true일 경우 동등 객체
 
 */

package ch12.sec03.exam02;

public class HashCodeExample {

	public static void main(String[] args) {
		
		//생성된 객체는 달라도 학생 번호와 이름이 같다면 동등 객체로 판단하는
		//재정의 된 equals(), hashCode()메소드 사용
		
		Student std1 = new Student(1, "홍길동");
		Student std2 = new Student(1, "홍길동");
		
		if(std1.hashCode() == std2.hashCode()) {
			if(std1.equals(std2)) {
				System.out.println("동등객체");
			}else {
				System.out.println("데이터가 다르므로 동등객체 아님");
			}
		}else {
			System.out.println("해시코드가 다르므로 동등객체 아님");
		}

	}

}
