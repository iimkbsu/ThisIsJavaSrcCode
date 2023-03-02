package ch07.sec10.exam02;

public class AbstractMethodExample {
	
	public static void animalSound(Animal animal) {
		animal.breathe();
		animal.sound();
	}

	
	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		Dog myDog = new Dog();
		
		myCat.sound();
		myDog.sound();
		System.out.println();
	
		//Animal animal = new Cat(); (자식클래스 자동타입변환)
		animalSound(new Cat());
		//Animal animal = new Dog(); (자식클래스 자동타입변환)
		animalSound(new Dog());
	}
	

}
