package ch05.Quiz;

import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class Quiz {

	public static void main(String[] args) throws IOException {
		
			/*
			 1. 참조 타입에 대한 설명으로 틀린 것은?
			 
			 - 참조 타입에는 배열, 열거, 클래스, 인터페이스가 있다 (O)
			 - 참조 타입 변수의 메모리 생성 위치는 스택이다(O)
			 - 참조 타입에서 == != 연산자는 객체 번지를 비교한다(O)
			 - 참조 타입은 null 값으로 초기화 할 수 없다 (X) 초기화 가능
			 
			 */
		
		/*
		 2. 자바에서 메모리 사용에 대한 설명으로 틀린 것은?
		 
		 - 로컬 변수(지역 변수)는 스택 영역에 생성되며 실행 블록이 끝나면 소멸한다 (O)
		 - 메소드 코드나 상수, 열거 상수는 정적(메소드) 영역에 생성된다 (O)
		 - 참조되지 않는 객체는 프로그램에서 직접 소멸 코드를 작성하는 것이 좋다 (X) JVM은 쓰레기 수집기를 통해 힙영역에서 자동 제거
		 - 배열 및 객체는 힙 영역에 생성된다 (O)
		 
		 */
		
		/*
		 3. String 타입에 대한 설명으로 틀린 것은?
		 
		 - String은 클래스이므로 참조 타입이다(O)
		 - String 타입의 문자열 비교는 == 를 사용한다 (X) 문자열 변수.equals(문자열 or 문자열 변수명)
		 - 동일 문자열 리터럴을 저장하는 변수는 동일한 String 객체를 참조한다(O)
		 - new String ("문자열") 은 문자열이 동일하더라도 다른 String 객체를 생성한다(O)
		 
		 */
		
		/*
		 4. 배열 생성 방법으로 틀린 것은?
		 
		 - int[] array = {1, 2, 3}; (O)
		 - int[] array; array = {1, 2, 3}; (X)
		 - int[] array = new int[3]; (O)
		 - int[][] array = new int[2][3]; (O)
		 
		 */
		
		/*
		 5. 배열의 기본 초기값에 대한 설명으로 틀린 것은?
		 
		 - 정수 타입 배열 항목의 기본 초기값은 0 (O)
		 - 상수 타입 배열 항목의 기본 초기값은 0.0 또는 0.0f (O)
		 - boolean 타입 배열 항목 기본 초기값은 true (X) false임
		 - 참조 타입 배열 항목의 기본 초기값은 null (O)
		 */
		
		
		//6. 아래는 배열 길이 출력 코드. 실행 결과 작성해보자
		int[][] array6 = {{95,86}, {83,92,96}, {78, 83, 93, 87, 88}};
		
		System.out.println(array6.length); //3
		System.out.println(array6[2].length); //5
		
		System.out.println();
		
		
		
		//7. 주어진 배열 항목에서 최대값을 출력하는 코드 작성하라(for문 사용)
		int[] array7 = {1, 2, 3, 4, 5};
		
		//-------for문 사용, 오름차순 정렬--------------
		for(int i = 0; i<array7.length ;i++) {
			for(int j = 0; j<i; j++) {
				if(array7[i] > array7[j]) {
					int temp = array7[i];
					array7[i] = array7[j];
					array7[j] = temp;
				}
			}
		} // 5,4,3,2,1
		int max = array7[0];
		System.out.println(max);
		//----------------------------------------
		
		//---------for문 사용---------------------
		int maxx = array7[0];
		
		for(int i =0; i<array7.length; i++) {
			if(array7[0] < array7[i]) {
				maxx = array7[i];
			}
		}
		System.out.println(maxx);
		//--------------------------------------
		
		
		//----------Arrays.sort() 이용--------------
		Arrays.sort(array7);
		System.out.println(array7[(array7.length)-1]);
		//-----------------------------------------
		
		
		//----------Arrays.Stream 이용 ------------------
		System.out.println("최대값 : " + Arrays.stream(array7).max().getAsInt());
		System.out.println("최소값 : " + Arrays.stream(array7).min().getAsInt());
		//------------------------------------------------------
		System.out.println();
		
		
		
		//8. 주어진 배열 항목의 전체 합과 평균을 구해 출력 (중첩for)
		int[][] array8 = {{95,86}, {83,92,96}, {78, 83, 93, 87, 88}};
		
		int sum = 0;
		int count = 0;
		for(int i=0; i<array8.length; i++) {
			for(int j=0; j<array8[i].length; j++) {
				sum += array8[i][j];
				count++;
			}
		}
		double avg = (double)sum / count;
		System.out.println(avg);
		System.out.println();
		System.out.println();
		//----------------------------------------------------
		
		
		//9.학생들의 점수 분석 프로그램 (조건, while문, Scanner nextLine() 사용)
		
		/*
		  -------------------------------------------------
		  1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료
		  -------------------------------------------------
		  선택> 1
		  학생수> 3
		  
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		int NumStudent = 0;
		int[] scores = {};
		boolean key = true;
		
		while(key) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택 >");
			String selection = scanner.nextLine();
			
			switch(selection) {
				case "1" -> {
					System.out.print("학생수 > ");
					NumStudent = Integer.parseInt(scanner.nextLine());
					scores = new int[NumStudent];
				}
				case "2" -> {
					for(int i =0; i<NumStudent; i++) {
						System.out.print("scores[" + i +"] >");
						scores[i] = scanner.nextInt();
					}scanner.nextLine();
				}
				case "3" -> {
					for(int i =0; i<NumStudent; i++) {
						System.out.println("scores[" + i +"] >" + scores[i]);
					}
					
				}
				case "4" -> {
					if(NumStudent == 0) {
						continue;	
					}
					else {
						System.out.println("최고 점수 : " + Arrays.stream(scores).max().getAsInt());
						System.out.println("평균 점수 : " + Arrays.stream(scores).average().getAsDouble());	
					}
					
				}
				case "5" -> {
					System.out.print("프로그램 종료");
					key = false;
				}
			}
			
			
		}

	}

}
