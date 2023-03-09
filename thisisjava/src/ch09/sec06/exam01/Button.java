package ch09.sec06.exam01;


//중첩 인터페이스 (클래스 안에 인터페이스)
//해당 클래스와 긴밀한 구현이 필요한 인터페이스일 때 (안드로이드 UI 버튼 이벤트)


public class Button {

	//정적 중첩 인터페이스
	public static interface ClickListener {
		
		//자동 abstract 메소드
		void onClick();
	}
}
