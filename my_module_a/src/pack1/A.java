package pack1;

//B 패키지2 은닉처리
//A 패키지1을 통해 모듈을 가져다 씀
import pack2.B;
import pack3.C;

//라이브러리(.jar) = 활용할 수 있는 클래스들 + 인터페이스들의 모음

//pack1과 pack2의 클래스와 메소드는 공통으로 자주 사용된다고 가정하자.
//우리는 이걸 임의로 라이브러리 형식으로 저장할 수 있고 간편하게 라이브러리를 가져다가 사용할 수 있다
//dist 폴더 (distribution = 배포)에 저장하여 .jar 라이브러리 만들기

public class A {

	public void method() {
		System.out.println("A-mehtod() 실행");
		
		B b = new B();
		b.method();
	}
	
	//pack1 pack2에 있는 A, B 모듈 인포에 requires my_module_b를 해줌으로써 A,B 모듈에서는 C,D 클래스(모듈)를 사용할 수 있음
	public C getC() {
		C c = new C();
		return c;
	}
}
