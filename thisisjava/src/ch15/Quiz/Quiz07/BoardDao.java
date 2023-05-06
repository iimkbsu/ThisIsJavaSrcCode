package ch15.Quiz.Quiz07;

import java.util.List;
import java.util.ArrayList;

public class BoardDao {

	public List<Board> getBoardList() {
		
		List<Board> myList = new ArrayList<>();
		
		for(int i=1; i<=3; i++) {
			Board myBoard = new Board("제목"+i, "내용"+i);
			myList.add(myBoard);
		}
		
		return myList;
	}
	
}
