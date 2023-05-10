package ch16.sec05.sec03;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		
		Person myPerson = new Person();
		
		
		
		
		Member m1 = myPerson.getMember1(new Creatable1() {
			@Override
			public Member create(String id) {
				Member mb = new Member(id);
				return mb;
			}
		});
		
		Member m2 = myPerson.getMember2(new Creatable2() {
			@Override
			public Member create(String id, String name) {
				Member mb = new Member(id, name);
				return mb;
			}
		});
		
		System.out.println(m1);
		System.out.println(m2);
		
		System.out.println();
		
		
		
		
		
		Member mm1 = myPerson.getMember1((id)->{return new Member(id);});
		Member mm2 = myPerson.getMember2((id, name)->{return new Member(id, name);});
		
		System.out.println(mm1);
		System.out.println(mm2);
		
		System.out.println();
		
		
		
		
		
		Member mb1 = myPerson.getMember1(Member :: new);
		Member mb2 = myPerson.getMember2(Member :: new);
		
		System.out.println(mb1);
		System.out.println(mb2);
		
		System.out.println();
		
		
		
		
		
		
		
	}

}
