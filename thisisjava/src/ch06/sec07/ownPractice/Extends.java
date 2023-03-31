package ch06.sec07.ownPractice;

class Parents {
	
}

class Child1 extends Parents{
	
}

class Child2 extends Parents{
	
}

class Grandchild1 extends Child1{
	
}

class Grandchild2 extends Child2{
	
}


public class Extends {

	public static void main(String[] args) {
		
		Parents myp;
		myp = new Child1();
		myp = new Child2();
		
		Child1 myc1 = new Child1();
		Child2 myc2 = new Child2();
		
		//자동타입변환
		Parents pare = myc1;
		Parents paree = myc2;
		
		Grandchild1 myg1 = new Grandchild1();
		Child1 c1 = myg1;
		
		//강제타입변환
		Grandchild1 mygg1 = (Grandchild1) c1;
		
	}
}
