
/*
 
 학생의 영어 평균점수, 수학 평균점수를 구하는 메소드를 작성하시오
 
 
 */

package ch16.Quiz.Quiz09;

public class Example {
	
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};

	
	//avg() 메소드 작성
	private static double avg(Function<Student> fun) {
		double sum = 0;
		for(Student std : students) {
			sum += fun.apply(std);
		}
		return sum/students.length;
	}
	
	public static void main(String[] args) {
		
		double englishAvg = avg( Student :: getEnglishScore);
		System.out.println("영어 평균 점수 : "+ englishAvg);
		
		double mathAvg = avg( Student :: getMathScore);
		System.out.println("수학 평균 점수 : "+ mathAvg);

	}

}
