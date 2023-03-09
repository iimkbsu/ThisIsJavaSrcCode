package ch09.sec06.exam03;

public class Button {

	
	//정적 중첩 인터페이스 (Button 객체 생성없이 사용가능 = Button.ClickListener)
	public static interface ClickListener {
		//추상 메소드
		void onClick();	
	}
	
	
	//인터페이스 타입으로 private 필드 선언
	private ClickListener clickListener;
	
	
	//pirvate 필드에 setter 하기위한 인스턴스 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	
	//인스턴스 메소드 click()
	public void Click() {
		this.clickListener.onClick();
	}
}
