package pack1;


//라이브러리(.jar) = 활용할 수 있는 클래스들 + 인터페이스들의 모음

//pack1과 pack2의 클래스와 메소드는 공통으로 자주 사용된다고 가정하자.
//우리는 이걸 임의로 라이브러리 형식으로 저장할 수 있고 간편하게 라이브러리를 가져다가 사용할 수 있다
//dist 폴더 (distribution = 배포)에 저장하여 .jar 라이브러리 만들기

public class A {

	public void method() {
		System.out.println("A-mehtod() 실행");
	}
}
