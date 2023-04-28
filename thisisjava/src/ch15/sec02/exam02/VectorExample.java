package ch15.sec02.exam02;

import java.util.Vector;
import java.util.List;

//import java.util.ArrayList;

import ch15.sec02.exam01.*; //Board 클래스 가져오기

public class VectorExample {

	public static void main(String[] args) {
		
		List<Board> myList = new Vector<>();	//2000개 모두 저장 됨. Vector 클래스의 모든 메소드는 synchronized 되어 있는 동기화 메소드들임
		
		//List<Board> myList = new ArrayList<>();	//스레드 동기화가 되지 않아서 2000개 보다 적게 저장되거나 에러 발생 가능
		
		
		
		Thread threadA = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					myList.add(new Board("제목"+i, "내용" +i, "저자"+i));
				}
			}
		});
		
		Thread threadB = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					myList.add(new Board("제목"+i, "내용" +i, "저자"+i));
				}
			}
		});
		
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
			
		}
		
		System.out.println("Vector 리스트에 저장된 Board 객체 수 : " + myList.size());
		System.out.println();
		
		for(int i=0; i<myList.size(); i++) {
			Board tmpBoard = myList.get(i);
			System.out.println(tmpBoard.getSub() +"\t" + tmpBoard.getCont()+"\t" + tmpBoard.getWriter());
		}
		System.out.println();

	}

}
