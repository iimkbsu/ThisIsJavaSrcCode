package ch16.sec03;

public class LambdaExample {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		//익명구현객체 만들어서 사용하기
		person.action1(new Workable() {
			@Override
			public void work(String name, String calling) {
				System.out.println(name+"이 " +calling+"을 합니다");
			}
		});
		
		//람다식
		person.action1((String name, String calling)->{
			System.out.println(name+"이 " +calling+"을 합니다");
		});
		
		//람다식
		person.action1((var 이름, var 직업) -> System.out.println(이름+"이 " +직업+"을 합니다"));

		//람다식
		person.action1((성함, 천직) -> System.out.println(성함+"이 " +천직+"을 합니다"));
		
		//람다식
		person.action2(word -> System.out.println(word));
	}

}
