package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean k1;
		k1 = new Korean("1234-1234", "Kim");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		
		k1.name = "park";
		System.out.println(k1.name);
		
		//파이날 필드는 값 변경 불가
		//k1.nation = "Korea";
		
		//파이날 필드는 값 변경 불가
		//k1.ssn = "123444-12312";
		
		

	}

}
