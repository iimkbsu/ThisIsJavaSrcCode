
/*
 봉인된 클래스 : sealed Class
 	- 자바 15부터 무분별한 클래스 상속을 막기 위해 생긴 클래스 종류 (final 클래스 제외하고 모든 클래스는 상속이 가능했음, 단일상속) (인터페이스만 다중상속 가능)
 	
 	사용방법
 	- public sealed Class 봉인클래스명 permits 상속할클래스, 상속할클래스 {}
 	
 		- public final/non-sealed Class 상속클래스명 extends 봉인클래스명 {}		
 		
 		(sealed 클래스를 상속받은 자식클래스에서는 반드시 봉인을 끝낼건지(final) 열어놓고 다른 클래스를 상속시킬건지(non-sealed) 명시해줘야 함)
 	
 	
 
 */



package ch07.sec11;

public class SealedExample {

	public static void main(String[] args) {
		
		Person p = new Person();
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();
		
		p.work();
		e.work();
		m.work();
		d.work();

	}

}
