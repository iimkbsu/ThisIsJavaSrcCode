
/* 
 숫자 100과 300으로 각각 박싱된 Integer 객체를 == 연산자로 비교한 코드이다
 System.out.println(obj1 == obj2); 는 true 리턴이지만
 System.out.println(obj3 == obj4); 는 flase 리턴이다
 이유를 설명하고 값만 비교할 수 있도록 코드 수정하세요




  포장 클래스(Wrapper class)
 	-  컬랙션 객체 때문에 래퍼 클래스 사용함 (기본 타입의 값은 저장이 안 되는데, 객체는 저장이 가능해서)
 
 
 자동 Boxing 과 UnBoxing
 	- 포장 클래스 타입으로 값을 저장할 때 Boxing이 발생해 포장 객체가 된다.
 	- 포장 객체에서 기본 타입으로 값을 저장할 때 UnBoxing이 발생하여 기본 타입 변수에 저장됨.
 
 
 
 기본타입				포장 클래스
 
 int				Integer
 char				Character
 
 short				Short
 byte				Byte
 long				Long
 float				Float
 double				Double
 boolean			Boolean
 
 
 
 포장 값 비교
 	- 객체의 값 자체 비교 : equals()
 	- 객체 참조 비교 : ==, !=
 	
 	- 객체 생성 없는 값 자체비교 : ==, !=
 	
 	
 참고
 	- 포장 값이 일정 범위 안에 있으면 같은 객체 참조하므로 equals() 메소드도 true를 반환함
 
 
 같은 객체 참조 범위
 	- boolean (true, false)
 	- char (\u0000 ~ \u0071)
 	- int, byte, short (-128 ~ 127)
 	
*/


package ch12.Quiz.Quiz12;

public class IntegerCompareExample {

	public static void main(String[] args) {
		
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		//원래코드
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		System.out.println();
		
		//수정코드
		System.out.println("수정코드");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj4));

	}

}
