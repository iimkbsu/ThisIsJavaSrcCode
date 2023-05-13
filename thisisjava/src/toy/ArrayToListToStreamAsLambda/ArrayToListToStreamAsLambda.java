package toy.ArrayToListToStreamAsLambda;


import java.util.List;
import java.util.Arrays;


public class ArrayToListToStreamAsLambda {

	public static void main(String[] args) {
		
		List<Student> stdList = Arrays.asList(
				new Student("서울대", 90),
				new Student("연세대", 89),
				new Student("원광대", 80),
				new Student("한경대", 70)
				);
		
		//최고점
		int high = stdList.stream().mapToInt(Student :: getScore).max().getAsInt();
		System.out.println("최고점 : " + high);
		
		
		//최저점
		int low = stdList.stream().mapToInt(Student :: getScore).min().getAsInt();
		System.out.println("최저점 : " + low);
		
		
		//평균
		double avg = stdList.stream().mapToInt(std -> std.getScore()).average().getAsDouble();
		System.out.println("평균 : " + avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
