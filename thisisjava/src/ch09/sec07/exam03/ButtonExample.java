package ch09.sec07.exam03;

import ch09.sec06.exam03.Button;

//ch09.sec06.exam03의 ButtonExample에서 인터페이스의 구현객체를 직접 생성한 코드를
//익명구현객체로 리펙토링 작업
public class ButtonExample {

	public static void main(String[] args) {
		
		
		//Ok 버튼
		Button btnOk = new Button();
		
		//익명구현객체를 매개변수로 하여 메소드 오버라이딩
		btnOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭합니다");
				
			}
		});
		
		btnOk.Click();
		
		
		
		//Cancel버튼
		Button btnCancel = new Button();
		//익명구현객체를 매개변수로 하여 메소드 오버라이딩
		btnCancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭합니다");
				
			}
		});
		
		btnCancel.Click();
		

	}

}
