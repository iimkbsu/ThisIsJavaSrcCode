
/*
 5. 람다식 작성
 
 출력:
 Ok 버튼을 클릭했습니다
 Cancel 버튼을 클릭했습니다
 
 
 */

package ch16.Quiz.Quiz05;

public class Example {

	public static void main(String[] args) {
		
		Button btnOk = new Button();
		btnOk.setClickListener(()->{System.out.println("Ok 버튼을 클릭했습니다");});
		btnOk.click();
		
		
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(()->{System.out.println("Cancel 버튼을 클릭했습니다");});
		btnCancel.click();
	}

}
