
/*
 -----------------------------------------------------------------------------------------------------
 어노테이션 (웹 어플리케이션을 개발할 때 스프링 프레임워크에서 많이 사용)
 	- @어노테이션이름
 	- 클래스 또는 인터페이스를 컴파일, 실행 할 때 어떤 처리를 거쳐야 하는지 설명하는 설정 정보.
 	- 용도
 		- 컴파일 시 사용하는 정보의 전달		(RetentionPolicy.SOURCE)									: 예. @Override
 		- 빌드 툴이 코드를 자동으로 생성할 떄, 메모리에 저장할 때 사용하는 정보를 전달	(RetentionPolicy.CLASS)		: 예. 롬복의 @Data
 		- 실행 시 특정 기능을 처리할 때 사용하는 정보를 전달	(RetentionPolicy.RUNTIME)
 		
 	- 자바 기본제공 어노테이션
 		- @Override					: 컴파일러에게 메소드를 오버라이딩한다고 알려줌으로써 제대로 재정의 했는지 검사하게 함
 		- @Deprecated				: 앞으로 사용하지 않음을 알림 (버전이 바뀔 때)
 		- @FunctionalInterface		: 함수형 인터페이스라고 알림
 		- @SuppressWarning			: 컴파일러가 경고 메시지를 출력하지 않음
 		- @SafeVargrs				: 제네릭과 같은 가변인자의 매개변수를 사용할 때 경고 나타내지 않음
 		
 	- 메타 어노테이션 (어노테이션을 정의하는 어노테이션, 어노테이션에 추가로 붙는 어노테이션)
 		- @Target({타입열거})				: 어노테이션 적용 대상 정의
 		- @Documented					: javaDoc 문서에 어노테이션 정보 포함시킴
 		- @Inherited					: 어노테이션을 하위 클래스에 상속시킴
 		- @Retention({타입})				: 어노테이션 유지 기간 설정
 		- @Repeatable					: 어노테이션 반복 적용
 	
 	- 사용자 정의 어노테이션
 		- 롬복
 			- @Data						: 롬복 라이브러리에서 정의된 getter setter toString 등의 메소드를 자동으로 불러오는 어노테이션 (아래 내용 모두 포함)
 			- @ToString					
 			- @Getter
			- @Setter
			- @NoArgsConstructor
			- @AllArgsConstructor
 	
 	
 	- 인터페이스 선언 방법
 		- [public] interface 인터페이스이름 {}
 		
 	- 어노테이션 정의(선언)방법
 		- public @interface 어노테이션이름 {}
 		
 	- 어노테이션 사용방법
 		- @어노테이션이름[(속성=속성값)]
 		
 	
 	
 	
 	
 예. 
 
 <어노테이션 선언 후 속성 부여>------------------------------------------------------
 
 public @interface MyAnnotation {
 	
 	String 속성이름1();				: 속성이름1의 String 타입 속성, 기본값 없음
 	int 속성이름2() default 1;			: 속성이름2의 int 타입 속성, 기본값 1
 	
 }
 
 
 
 <어노테이션 사용>-----------------------------------------------------------------
 
 @MyAnnotation(이름1 = "문자열");				: 정상작동. 이름2는 default 값 1이 있어서 기술 없이 사용 가능
 @MyAnnotation(이름2 = 3);					: 오류남. 이름1의 default 값이 없어서 반드시 초기값 기술해줘야 함
 @MyAnnotation(이름1 ="문자열", 이름2 = 3);		: 정상 작동.
 	
 	
 	
 <어노테이션 기본 속성 value()>-------------------------------------------------------
 
 public @interface MyAnnotation2 {
 	
 	String value();			: 기본 속성. 속성이름 없이 값만 넣어 사용 가능
 	int 속성이름() default 1;
 
 }
 
 
 
 <기본속성 어노테이션 사용>-------------------------------------------------------------
 
 @MyAnnotation2("문자열");						: 기본속성 String value()로 되어있기 때문에 속성이름 없이 값만 줄 수 있음
 @MyAnnotation2(value = "문자열", 속성이름 = 3);		: 단, 다른 속성 값을 동시에 줄 경우에는 value 표기해줘야 함
 
 
 
 <어노테이션 적용 대상>------------------------------------------------------------
 
 ElementType 열거상수					적용요소
 
 	TYPE							클래스, 인터페이스, 열거타입
 	ANNOTATION_TYPE					어노테이션
 	FIELD							필드
 	CONSTRUCTOR						생성자
 	METHOD							메소드
 	LOCAL_VARIABLE					로컬변수
 	PACKAGE							패키지
 	
 
 <어노테이션 적용 방법>----------------------------------------------------------
 
 어노테이션 생성시 맨 위에 적용대상을 @Target()으로 명시한 후 어노테이션을 적용할 코드 선언부 앞에 @어노테이션이름으로 작성
 
 //어노테이션 선언
  
 @Target( { ElementType.Type, ElementType.FIELD, ElementType.METHOD } )
 public @interface myAnnotation {
 
 	String str() default "문자열";
 	int value();
 	
 }
 
 
 //어노테이션 적용 (생성자는 target 설정하지 않았으므로 어노테이션 적용을 할 수 없음)
  
  @myAnnotation
  public class myClass{
  	
  	@myAnnotation
  	private String myField;
  	
  	public myClass(){
  	}
  	
  	@myAnnotation
  	public void myMethod(){
  	}
  	
  }
  
 
 <어노테이션 유지 정책>----------------------------------------------------------
 
 RetentionPolicy 열거상수				어노테이션 적용 시점					어노테이션 제거 시점
 
 	SOURCE							컴파일 시 적용						컴파일 완료 후 제거
 	CLASS							메모리로 로딩할 때 적용				메모리 로딩 완료 후 제거
 	RUNTIME							프로그램 실행할 때 적용				제거 안 됨. 계속 유지
 
 
 //어노테이션 선언 (유지정책 포함)
  
 @Target( { ElementType.Type, ElementType.FIELD, ElementType.METHOD } )
 @Retention(RetentionPolicy.RUNTIME)
 public @interface myAnnotation {
 
 	String str() default "문자열";
 	int value();
 	
 }	



 <어노테이션 설정 정보 이용>---------------------------------------------------------------
 
 	(boolean 타입)		isAnnotationPresnet(AnnotationName.class)		: 지정한 어노테이션이 적용 되었는지 여부 확인 
 	(Annotation 타입)		getAnnotation(AnnotationName.class)				: 지정한 어노테이션이 적용되었다면 어노테이션 리턴, 아니면 null 
 	(Annotation[] 타입)	getDeclaredAnnotations()						: 적용된 어노테이션 모두 리턴 
 	
 
 */



package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target({ElementType.METHOD})			//타겟은 엘레멘트타입.메소드
@Retention(RetentionPolicy.RUNTIME)		//런타임(프로그램실행)때 어노테이션
public @interface PrintAnnotation {
	String value() default "-";			//선 모양
	int number() default 15;			//선 출력 횟수

}





