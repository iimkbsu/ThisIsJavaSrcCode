package ch13.sec02.exam03;

public class Box<T> {

	//필드 선언
	public T content;
	
	//메소드 선언 
	//타입 파라미터는 기본적으로 Object 타입. eqauls() 메소드 사용 가능
	//Box의 content 필드 객체 내용 비교하는 메소드
	public boolean compare(Box<T> box) {
		
		boolean result = content.equals(box.content);
		return result;
	}
}
