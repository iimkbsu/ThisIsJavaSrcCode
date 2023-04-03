package ch12.sec03.exam04;

public class RecordExample {

	public static void main(String[] args) {
		
		//레코드 객체
		Member m1 = new Member("id1", "눈송이", 25);
		
		System.out.println(m1.id());
		System.out.println(m1.name());
		System.out.println(m1.age());
		
		System.out.println(m1); //m1.toString()하고 같음
		System.out.println(m1.toString());
		System.out.println();
		
		
		//m1 m2 m3 객체는 서로 다르지만 hashCode를 id,이름,나이로 분류하기 떄문에
		//데이터가 서로 같으므로 전부 동등 객체로 인식
		Member m2 = new Member("id1", "눈송이", 25);
		Member m3 = new Member("id1", "눈송이", 25);
		
		System.out.println("m2 해시코드 : " + m2.hashCode());
		System.out.println("m3 해시코드 : " + m3.hashCode());
		
		System.out.println("m1과 m2와 m3가 동등 객체인가? :" + (m1.equals(m2) && m2.equals(m3)));
	}

}
