package ch09.sec06.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭합니다");
			}
		}
		
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭합니다");
			}
		}
		
		Button buttonOk = new Button();
		
		buttonOk.setClickListener(new OkListener());
		buttonOk.Click();
		
		
		Button buttonCancel = new Button();
		buttonCancel.setClickListener(new CancelListener());
		buttonCancel.Click();

		
		/*
		//버튼클래스로 ok버튼 객체 생성
		Button btnOk = new Button();
		
		//Button클래스의 중첩 인터페이스인 ClickListener의 구현 클래스 생성
		class OkListener implements Button.ClickListener {
			
			//중첩 인터페이스의 메소드 오버라이딩
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다");
			}
		}
		
		// 버튼클래스 객체의 setter 메소드의 매개변수로 위에 생성한 구현 클래스를 객체로 대입
		btnOk.setClickListener(new OkListener());
		
		//버튼클래스의 Click()메소드 호출
		btnOk.Click();
		
		//////////////////////////////////////////////
		
		
		Button btnCancel = new Button();
		
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다");
			}
		}
		
		btnCancel.setClickListener(new CancelListener());
		
		btnCancel.Click();
		*/

	}

}
