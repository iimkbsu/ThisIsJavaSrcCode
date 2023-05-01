package ch15.sec02.exam03;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
	
	/*
	 ArrayList와 LinkedList에 각각 0번 인덱스에 0~9999를 삽입하는 작업
	 
	 ArrayList는 0번에 넣고 이후에 0번에 넣으면 원래 있던 0번 데이터는 뒤로 하나씩 밀림
	 
	 LinkedList는 사실 인덱스라는 개념이 없고 데이터를 넣은 후 기존 맨 앞에 데이터 앞으로 링크해주면 됨
	 */
	public static void main(String[] args) {
		
		List<String> myList1 = new ArrayList<>();
		
		List<String> myList2 = new LinkedList<>();
		
		
		long startTime;
		long endTime;
		
		//////
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			myList1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("ArrayList 걸린시간 : %d ns \n",endTime - startTime);

		////////////
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			myList2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("LinkedList 걸린시간 : %d ns \n",endTime - startTime);
		
		
	}

}
