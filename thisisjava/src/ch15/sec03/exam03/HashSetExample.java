package ch15.sec03.exam03;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
	
		Set<String> mySet = new HashSet<>();
		mySet.add("Java");
		mySet.add("Spring");
		mySet.add("JDBC");
		mySet.add("JSP");
		mySet.add("Docker");
		mySet.add("Kubernetes");
		
		Iterator<String> myIterator = mySet.iterator();
		
		while(myIterator.hasNext()) {
			String element = myIterator.next();
			System.out.println(element);
			
			if(element.equals("JSP")) {
				myIterator.remove();
			}
		}
		System.out.println();
		
		
		mySet.remove("JDBC");
		
		for(String element : mySet) {
			System.out.println(element);
		}
		
		/*
		//아래 코드는 예외발생함. for 반복 수가 for문이 돌면서 변경되기 때문에 사용 못 함
		 
		for(String element : mySet) {
			if(element.equals("Java")) {
				mySet.remove(element);
			}
		}
		
		//참고로 위와같이 for문으로 객체 조사하여 Set에서 remove 하거나 add 하는 방법이 없어서 while문 Iterator 사용해서 remove 해야 함
		 
		*/
		
	}

}
