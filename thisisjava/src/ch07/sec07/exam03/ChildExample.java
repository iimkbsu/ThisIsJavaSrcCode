package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		
		Parent myParent = new Child();
		
		
		myParent.method_1();
		myParent.method_2();
		myParent.field1 = "부모필드";
		System.out.println(myParent.field1);
		System.out.println();
		
		//불가능
		/*
		myParent.method_3();
		myParent.filed2 = "자식필드";
		*/
		
		//가능하게 하려면 자동타입변환 된 걸 강제타입변환으로 다시 자식객체로 캐스팅
		Child myChild = (Child) myParent;
		
		myChild.method_3();
		myChild.field2 = "자식필드";
		System.out.println(myChild.field2);
		System.out.println();

	}

}
