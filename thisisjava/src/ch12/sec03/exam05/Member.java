
/*
 롬복(Lombok) : DTO 사용할 때 record와 비슷한 자동코드 생성 라이브러리, 표준라이브러리는 아님.
 
 record 와 차이점
 	- final 필드가 아님 (사용자가 final 선택 가능)
 	- 표준라이브러리 아님
 	- getter는 get@@@ (is@@@) setter는 set@@@ 메소드 이름으로 생성됨 (자바빈즈 정식 표현)
 	- 설치해서 사용해야 함 https://projectlombok.org/download (lombok.jar 라이브러리 파일 다운로드)
 	- record는 클래스를 바로 만들어서 사용가능하지만 lombok은 cmd에서 java -jar lombok.jar 커맨드 해주고 
 	- lib 폴더를 만들어 .jar을 넣어준 후라이브러리(jar) 파일처럼 buildpath 설정 해줘야 함
 	- import 라이브러리 해줘야 함
 	- @Data 어노테이션이(주석) 있음 (자바 어노테이션 : app 실행에서 처리하는 코드가 아니라 컴파일 과정에서 코드 처리방법 표기하기 위한 주석)
 	
 	java 어노테이션 종류
 		- 자바 빌트인(기본제공) 어노테이션
 			- @Override (상속시 메소드 재정의)
 			- @Deprecated (메소드 사용중지, 하위호환을 위해 메소드를 살려두지만 사용하지 말 것 알리고 싶을 때)
 			- @SuppressWarnings("인자") (어노테이션 인자에 따라 컴파일러 경고 출력 억제)
 			- @SafeVarargs (제너릭과 같은 가변인자 매개변수 사용 경고 무시)
 			- @FunctionalInterface (자바에서 람다식 인터페이스 지정, 람다식 사용이 적절치 못한 곳에 입력할 경우 컴파일 오류 발생시킴)
 			
 			- 메타 어노테이션 (사용자 정의 어노테이션 만들 때 사용)
 				- @Retention (어노테이션의 리탠션 기간 명명)
 				- @Documented (자바 문서에도 어노테이션 정보가 표현될 수 있도록)
 				- @Target (생성할 어노테이션의 적용 위치 나열)
 				- @Ingerited (자식 클래스에서도 어노테이션 상속받게 함)
 				- @Repeatable (어노테이션 반복적으로 선언 가능)
 		
 		
 		- 커스텀 어노테이션
 			- lombok.jar
 				- @Data ( 기본생성자, getter, setter, hashCode(), equals(), toString() 메소드 자동생성)
 				
 				- @NoArgsConstructor (기본 생성자 포함시킴)
 				- @AllArgsConstructor (모든 필드 초기화 되는 생성자 포함시킴)
 				- @RequiredArgsConstructor (매개변수 없는 생성자 포함시킴, 만약 final, @NonNull 붙은 필드가 있으면 이 필드만 초기화 생성자 포함시킴)
 				
 				- @Getter (getter 메소드 자동생성)
 				- @Setter (setter 메소드 자동생성)
 				- @EqualsAndHashCode (hashCode(), equals() 자동생성)
 				- @ToString (toString() 메소드 자동생성)
 				
 */



// lombok.jar을 thisisjava 최상위 폴더 lib에 저장한 후 전체가 lombok.jar 라이브러리를 사용할 수 있도록 buildpath 해줌 (.jar은 라이브러리 또는 모듈, .java는 프로젝트)
package ch12.sec03.exam05;

//롬복의 라이브러리 import
import lombok.*;

//Data 어노테이션

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Member {
	
	private final String id;
	@NonNull private String name;
	private int age;

}









