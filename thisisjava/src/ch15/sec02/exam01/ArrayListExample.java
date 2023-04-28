package ch15.sec02.exam01;

import java.util.List;
import java.util.ArrayList;


public class ArrayListExample {

	public static void main(String[] args) {
		
		///////////////////
		System.out.println("----------List 타입 ArrayList 객체------------");
		List<Board> myList1 = new ArrayList<>();
		
		
		myList1.add(new Board("제목1", "내용1", "저자1"));
		myList1.add(new Board("제목2", "내용2", "저자2"));
		myList1.add(new Board("제목3", "내용3", "저자3"));
		myList1.add(new Board("제목4", "내용4", "저자4"));
		myList1.add(new Board("제목5", "내용5", "저자5"));
		myList1.add(new Board("제목1", "내용1", "저자1"));
		
		int size = myList1.size();
		System.out.println("총 책 개수 : " + size);
		System.out.println();
		
		Board myBoard = myList1.get(2);
		System.out.println(myBoard.getSub() + "\t"+ myBoard.getCont() +"\t"+ myBoard.getWriter());
		System.out.println();
		
		for(int i=0; i<size; i++) {
			Board tmpBoard = myList1.get(i);
			System.out.println(tmpBoard.getSub() + "\t"+ tmpBoard.getCont() +"\t"+ tmpBoard.getWriter());
		}
		System.out.println();
		
		myList1.remove(5);
		
		for(Board tmpBoard : myList1) {
			System.out.println(tmpBoard.getSub() + "\t"+ tmpBoard.getCont() +"\t"+ tmpBoard.getWriter());
		}
		System.out.println();
		////////////////////
		
		System.out.println("----------ArrayList 타입 ArrayList 객체------------");
		///////////////
		ArrayList<Board> myList2 = new ArrayList<>();
		
		myList2.add(new Board("제목1", "내용1", "저자1"));
		myList2.add(new Board("제목2", "내용2", "저자2"));
		myList2.add(new Board("제목3", "내용3", "저자3"));
		myList2.add(new Board("제목4", "내용4", "저자4"));
		myList2.add(new Board("제목5", "내용5", "저자5"));
		myList2.add(new Board("제목1", "내용1", "저자1"));
		
		
		int size2 = myList2.size();
		System.out.println("총 책 개수 : " + size2);
		System.out.println();
		
		Board myBoard2 = myList2.get(2);
		System.out.println(myBoard2.getSub() + "\t"+ myBoard2.getCont() +"\t"+ myBoard2.getWriter());
		System.out.println();
		
		for(int i=0; i<size2; i++) {
			Board tmpBoard2 = myList2.get(i);
			System.out.println(tmpBoard2.getSub() + "\t"+ tmpBoard2.getCont() +"\t"+ tmpBoard2.getWriter());
		}
		System.out.println();
		
		myList2.remove(5);
		
		for(Board tmpBoard2 : myList2) {
			System.out.println(tmpBoard2.getSub() + "\t"+ tmpBoard2.getCont() +"\t"+ tmpBoard2.getWriter());
		}
		System.out.println();
		////////////////////
	}

}
