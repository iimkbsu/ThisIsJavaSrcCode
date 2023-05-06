package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		
		TreeSet<Fruit> myTreeSet = new TreeSet<>(new FruitComparator());

		myTreeSet.add(new Fruit("포도", 3000));
		myTreeSet.add(new Fruit("수박", 10000));
		myTreeSet.add(new Fruit("딸기", 6000));
		
		
		for(Fruit f : myTreeSet) {
			System.out.println(f.name + " : " + f.price);
		}
		
	}

}
