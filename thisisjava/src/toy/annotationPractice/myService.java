package toy.annotationPractice;

public class myService {
	
	@methodAnnotation
	public void method1() {
		System.out.println("메소드1 실행");
	}
	
	@methodAnnotation("*")
	public void method2() {
		System.out.println("메소드2 실행");
	}
	
	@methodAnnotation(value = "~", number=30)
	public void method3() {
		System.out.println("메소드3 실행");
	}

}
