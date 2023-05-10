package ch16.sec02.exam02;

public class Button {
	
	//Button 클래스와 밀접한 연관이 있는 인터페이스이므로 중첩인터페이스로 선언
	@FunctionalInterface
	public static interface ClickListener {
		
		public void onClick();
	}
	
	
	private ClickListener clickListener;
	
	
	//함수형 인터페이스를 매개변수로 하는 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}

}
