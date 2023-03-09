package ch09.sec06.exam02;

public class Button {
	
	//정적 중첩 인터페이스
	public static interface ClickListener {
		
		//추상 메소드
		abstract void onClick();
	}
	
	
	//인터페이스 타입으로 필드 선언 (private = 클래스 안에서만 접근)
	private ClickListener clickListener;
	
	
	//인스턴스 setter 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

}
