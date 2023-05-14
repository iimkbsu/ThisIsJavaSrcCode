package ch17.sec04.exam01;

import java.util.List;
import java.util.ArrayList;

import java.util.stream.*;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Product> myList = new ArrayList<>();
		
		for(int i=1; i<=5; i++) {
			Product myProduct = new Product(i, "상품"+i, "대기업", (int)(10000*Math.random()));
			
			myList.add(myProduct);
		}
		
		Stream<Product> myStream = myList.stream();
		myStream.forEach((Product prod) -> {System.out.println(prod);});
		
		System.out.println();
		
		//람다식 간단하게
		Stream<Product> myStream1 = myList.stream();
		myStream1.forEach(prod -> System.out.println(prod));

	}

}
