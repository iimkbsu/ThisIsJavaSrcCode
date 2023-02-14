package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		
		String board = "1.,자바 학습,참조 타입 String을 학습합니다.,김범수";
		
		String[] tokens = board.split(",");
		System.out.println("토큰 갯수 : " + tokens.length);
		
		int i;
		for(i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}

	}

}
