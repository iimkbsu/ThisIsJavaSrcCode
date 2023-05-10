package ch16.sec05.exam02;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		Person myPerson = new Person();
		
		// 기존 인터페이스 익명구현객체 만들어서 사용하기
		myPerson.ordering(new Comparable() {
			@Override
			public int compare(String a, String b) {
				return a.compareToIgnoreCase(b);
			}
		});
		System.out.println("\n");
		
		
		
		// 람다식으로 간단히 하기
		myPerson.ordering((a,b)->{
			return a.compareToIgnoreCase(b);
		});
		System.out.println("\n");
		
		
		
		// 람다식 참조형태로 더 간단히
		myPerson.ordering(String :: compareToIgnoreCase);

	}

}
