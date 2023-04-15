package ch13.sec02.exam03;

public class GenericExample {

	public static void main(String[] args)  {
		
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		Box myBox3 = new Box();
		
		myBox1.content = "100";
		myBox2.content = "100";
		myBox3.content = 100;
		
		
		Box<String> myBox4 = new Box<>();
		Box<String> myBox5 = new Box<>();
		Box<Integer> myBox6 = new Box<>();
		
		myBox4.content = "100";
		myBox5.content = "100";
		myBox6.content = 100;
		
		
		System.out.println(myBox1.compare(myBox2)); //true
		System.out.println(myBox1.compare(myBox3)); //false
		System.out.println(myBox2.compare(myBox3)); //false
		
		
		System.out.println(myBox1.compare(myBox4)); //true
		System.out.println(myBox1.compare(myBox5)); //true
		
		System.out.println(myBox4.compare(myBox5)); //true
		
		System.out.println(myBox3.compare(myBox6)); //true
		
	}

}
