
/*
 
 ☆★☆★☆ 매우 중요 ☆★☆★☆
 
 
 메소드의 제한된 타입 파라미터
 	- 타입 파라미터는 기본적으로 Object 타입으로 간주되는데 이를 제한 하기 위함.
 	- 예를들어 숫자만 사용하고 숫자만 리턴하는 메소드는 Number 타입 또는 그 자식클래스(Byte, Short, Integer, Long, Double)로 제한할 필요가 있다.
 	- 타입 파라미터를 특정 타입으로 extends 키워드를 사용하여 상속시키면 특정 타입과 그 타입의 자식타입만 사용할 수 있게 제한 가능.
 	
 사용법.
 public <T extends 상위타입> 리턴타입 메소드(매개변수) {...}
 
 
 
 예.
 매개변수 두 숫자를 비교하고 같으면 true 아니면 false를 리턴하는 compare()메소드, 타입 파라미터는 숫자로 제한
 
 public <T extends Number> boolean compare(T t1, T t2){
 	double v1 = t1.doubleValue();
 	double v2 = t2.doubleValue();
 	boolean result = (v1 == v2);
 	return result;
 }
 
 
 *참고
 
 Number 클래스
 	- Character, Boolean 제외한 모든 숫자관련 포장클래스는 Number 클래스를 상속받음
 	- 숫자 자료형을 특정 타입으로 변경하는 메소드 존재
 		- .intValue()			: int형으로 변경
 		- .longValue()			: long형으로 변경
 		- .floatValue()			: float형으로 변경
 		- .doubleValue()		: double형으로 변경
 		- .byteValue()			: byte형으로 변경
 		. .shortValue()			: short형으로 변경
 
 
 */


package ch13.sec04;

public class GenericExample {
	
	public static <T extends Number> boolean compare(T t1, T t2) {
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + 
							t2.getClass().getSimpleName() + ")");
		
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return v1 == v2;
	}
	
	
	
	//내가 만든 메소드. double 타입이 아닌 int 타입으로 했을 경우
	public static <T extends Number> boolean myCompare(T t1, T t2) {
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + 
				t2.getClass().getSimpleName() + ")");
		
		//t1은 강제로 올림 시켜서 int형으로 만들고 t2는 정수형으로(소수점 버림)해보자~
		int v1 = (int) Math.ceil((double)t1);
		int v2 = t2.intValue();
		
		System.out.println("v1: " + v1 + "\nv2: " + v2);
		
		return v1 == v2;
	}
	
	
	

	public static void main(String[] args) {
		
		boolean result1 = compare(20, 20);
		System.out.println(result1);
		System.out.println();
		
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
		System.out.println();
		
		boolean result3 = compare(4.5, 4);
		System.out.println(result3);
		System.out.println();
		
		//내가 만든 메소드 실행
		boolean result4 = myCompare(4.5, 5);
		System.out.println(result4);
		System.out.println();
		
		boolean result5 = myCompare(4.2, 5.9);
		System.out.println(result5);

	}

}
