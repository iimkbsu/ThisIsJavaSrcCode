package ch06.sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		
		//Korean 객체생성
		Korean k1 = new Korean("박자바", "0112312412");
		
		System.out.println(k1.nation +" "+ k1.name +" "+ k1.ssn);
		
		Korean k2 = new Korean("김자바스크립트", "1123124");
		System.out.println(k2.nation +" "+ k2.name +" "+ k2.ssn);
		
		
		
	}

}
