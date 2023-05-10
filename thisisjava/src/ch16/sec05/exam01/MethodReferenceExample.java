package ch16.sec05.exam01;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		Person myPerson = new Person();
		
		myPerson.action((x,y) -> Computer.staticMethod(x, y));
		
		myPerson.action(Computer :: staticMethod);
		
		
		Computer myCom = new Computer();
		
		myPerson.action((x,y)-> myCom.instanceMethod(x, y));
		
		myPerson.action(myCom :: instanceMethod);

	}

}
