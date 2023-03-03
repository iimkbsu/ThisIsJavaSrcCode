package ch07.Quiz.Quiz07;

public class ChildExample {

	public static void main(String[] args) {
		
		Child myChild = new Child();

	}

}

//Child(){ this("홍길동")}에서 Child(String name){}으로 감
//Child(String name){ super();}로 부모 클래스로 넘어감
//Parent(){this("대한민국")}에서 Parent(String name){}으로 감
// String nation에 "대한민국" 입력되고 Parent 필드 nation에 변수 저장 후 
//System.out.println("Parent(String nation) call"); 실행 (1)
//this("대한민국") 다음 줄 System.out.println("Parent() call"); 실행 (2)
// 숨겨진 super(); 다음 줄 this.name = name; 실행하여 Child 필드 name 변수에 "홍길동" 저장
//System.out.println("Child(String name) call"); 실행 (3)
//this("홍길동"); 다음 줄 System.out.println("Child() call"); 실행 (4)

/*
 출력 결과
 
 Parent(String nation) call
 Parent() call
 Child(String name) call
 Child() call
 
 */

//부모 없는 자식 없음 -> 자식객체 생성되려면 반드시 부모 객체 먼저 생성 됨 
//부모 객체 생성자 선언이 안 되어있을 경우 자식 객체 생성자를 선언하면 컴파일 에러 남
// 자식객체 생성자에 부모객체 생성자를 호출하는 super(); 숨겨져 있음