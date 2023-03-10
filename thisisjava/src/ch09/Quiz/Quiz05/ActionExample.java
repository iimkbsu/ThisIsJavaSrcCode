package ch09.Quiz.Quiz05;

public class ActionExample {

	public static void main(String[] args) {
		
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("작동을 합니다");
			}
		};
		
		action.work();

	}

}
