package ch15.sec05.exam03;

import java.util.*;

public class ComparableExample {

	public static void main(String[] args) {
		
		TreeSet<Person> myTreeSet = new TreeSet<>();

		myTreeSet.add(new Person("홍길동", 45));
		myTreeSet.add(new Person("김자바", 25));
		myTreeSet.add(new Person("박지원", 35));
		
		for(Person p : myTreeSet) {
			System.out.println(p.name + " " + p.age);
		}
		
		
		System.out.println("\n");
		
		
		TreeMap<Person, Integer> myTreeMap = new TreeMap<>();
		
		myTreeMap.put(new Person("홍길동", 45), null);
		myTreeMap.put(new Person("김자바", 25), null);
		myTreeMap.put(new Person("박지원", 35), null);
		
		Set<Person> myKeySet = myTreeMap.keySet();
		
		Iterator<Person> myIterator = myKeySet.iterator();
		
		while(myIterator.hasNext()) {
			Person p = myIterator.next();
			System.out.println(p.name +" : " + p.age);
		}
			
		
		
	}

}
