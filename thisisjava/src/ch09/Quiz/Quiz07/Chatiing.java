package ch09.Quiz.Quiz07;

public class Chatiing {

	//중첩 클래스
	class Chat {
		
		//로컬 메소드
		void start() {	
		}
		
		void sendMessage(String message) {
		}
		
	}
	
	
	
	
	//인스턴스 메소드
	void startChat(String chatId) {
		
		/*
		String nickName = null;
		nickName = chatId;
		*/
		final String nickName = chatId;
		
		
		//메소드 안에서 중첩클래스로 로컬 익명객체 생성
		//로컬 객체 안에서 nickName이라는 로컬 변수 사용하고 있으므로 final 특성을 갖게 됨. null로 초기화하면 final 특성으로 null로 고정. 초기화를 매개변수인 chatId로 해줘야 함
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		
		chat.start();
		
		
	}
	
	
	
}
