
/*
 
 제네릭 타입
 	- 타입이 결정되지 않은 파라미터를 가지는 클래스와 인터페이스
 	- <A,B ..> : 타입 파라미터. <> 안에는 기본타입(예 int)은 올 수 없고 참조가능한 타입(예 Integer 포장클래스)만 올 수 있음
 
 	* 타입파라미터는 아무 알파벳이나 써도 됨
 
 
 //제네릭 타입 클래스
 public class 클래스명<A, B, ...>{
 	
 	A 필드명1;
 	
 	A 메소드명1(){
 	
 	}
 	
 	B 메소드명2(){
 	
 	}
 	...
 
 }
 

 
 */



package ch13.sec02.exam01;

public class GenericExample {
	
	
	public static void getsetTv() {
		
		Product<Tv, String> myProduct1 = new Product<>();
		
		myProduct1.setKind(new Tv());
		myProduct1.setModel("LG_34160");
		
		Tv myTv = myProduct1.getKind();
		String tvModel = myProduct1.getModel();
		
		System.out.println(myTv.getClass());
		System.out.println(tvModel);
	}
	
	
	public static void getsetCar() {
		
		Product<Car, String> myProduct2 = new Product<>();
		
		myProduct2.setKind(new Car());
		myProduct2.setModel("Porsche_911GT3");
		
		Car myCar = myProduct2.getKind();
		String carModel = myProduct2.getModel();
		
		System.out.println(myCar.getClass());
		System.out.println(carModel);
		
	}
	

	public static void main(String[] args) {
		
		getsetTv();
		System.out.println();
		
		getsetCar();
		
		

	}

}
