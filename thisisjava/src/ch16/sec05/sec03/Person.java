package ch16.sec05.sec03;

public class Person {

	public Member getMember1(Creatable1 creatable) {
		String id = "winter";
		Member mb = creatable.create(id);
		return mb;
	}
	
	public Member getMember2(Creatable2 creatable) {
		String id = "winter";
		String name = "한겨울";
		Member mb = creatable.create(id, name);
		return mb;
	}
}
