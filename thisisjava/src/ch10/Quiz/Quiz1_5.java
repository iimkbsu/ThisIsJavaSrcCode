package ch10.Quiz;

public class Quiz1_5 {
	/*
	 1. 자바 라이브러리에 대한 설명으로 틀린 것은?
	 	- 일반적으로 JAR(.jar) 파일 형태로 존재한다 (.java로 존재, dist 폴더에 .jar 형태로 변경하여 배포 가능)
	 	- JAR 파일 안에는 클래스 및 인터페이스의 소스 파일이 있다 (X) (.jar은 바이트코드가 있음)
	 	- 라이브러리에 포함된 모든 패키지는 프로그램에서 접근이 가능하다
	 	- 이클립스 프로젝트에서 사용할 경우 Build Path에 JAR 파일을 추가한다 (.jar인 경우 jar 라이브러리 패스 추가, .java인 경우 프로젝트 라이브러리 패스 추가)
	 	
	 
	 2. 모듈에 대한 설명으로 틀린 것은?
	 	- 모듈은 패키지 관리 기능까지 포함된 라이브러리라고 볼 수 있다 (라이브러리의 모든 패키지 접근을 은닉처리함으로써 패키지 관리기능까지 포함한 모듈로 만듦)
	 	- 모듈에 포함된 일부 패키지는 은닉해서 접근할 수 없도록 할 수 있다
	 	- 모듈은 모듈 기술자가 반드시 존재할 필요는 없다 (X) (모듈의 경우 module-info 반드시 필요)
	 	- 모듈도 라이브러리이므로 JAR 파일 형태로 배포될 수 있다
	 	
	 
	 3. 모듈 기술자 (module-info.java)에 기술되는 내용으로 틀린 것은?
	 	- exports는 외부에서 접근할 수 있는 패키지를 기술한다
	 	- requires는 의존 모듈을 기술한다
	 	- requires를 기술할 때 exports를 기술할 수 없다 (X)
	 	- transitive는 전이 의존 모듈을 기술한다
	 	
	 	//예. 현재 모듈이 pack1의 패키지에 있는 클래스(코드)를 사용할 수 있게 하고 
	 	 module module_example {
	 	 	exports pack1;
	 	 	requires module_a;
	 	 }
	 	
	 
	 4. 집합 모듈에 대한 설명으로 틀린 것은?
	 	- 한 번의 의존 설정으로 여러 모듈을 사용할 수 있도록 해준다 (module {requires transitive module})
	 	- 집합 모듈 기술자에는 requires transitive로 의존 모듈을 기술한다
	 	- 집합 모듈 기술자에는 requires transitive로 다른 집합 모듈을 기술할 수 있다
	 	- 집합 모듈을 의존 설정할 경우에는 다른 모듈을 의존 설정할 수 없다 (X) (집합모듈 포함하여 다양한 모듈을 같이 의존 설정 할 수 있다)
	 	
	 	
	 5. 자바 표준 모듈에 대한 설명으로 틀린 것은?
	 	- java.base 모듈은 기본 모듈이므로 requires하지 않아도 사용할 수 있다
	 	- java.base 모듈에 속한 패키지는 import 없이도 사용할 수 있다 (X) (requires 없이 사용 가능, import는 선언 해줘야 함) (e.g. import java.util.*)
	 	- jave.se 모듈은 JDK의 전체 모듈을 사용할 수 있도록 구성된 집합모듈이다 (java.se가 최상위 모듈)
	 	- 자바 표준 모듈은 작은 자바 실행 환경을 만들기 위해 설계되었다.
	 
	 */
	

}
