package ch15.sec05.exam04;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit f1, Fruit f2) {
		if(f1.price == f2.price) return 0;
		else if(f1.price > f2.price) return 1; //오름차순
		else return -1; //오름차순
	}
}
