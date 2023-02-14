package ch06.sec07.exam03;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("박자바", "0101010101");
		System.out.println(k1.nation +" "+ k1.name + " "+ k1.ssn);
		
		Korean k2 = new Korean("김김자바", "01011111");
		System.out.println(k2.nation+ " "+ k2.name +" "+ k2.ssn);

	}

}
