package ch15.Quiz.Quiz10;

public class Student implements Comparable<Student>{
	
	public String id;
	public int score;
	
	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	//여기에 코드 작성
	@Override
	public int compareTo(Student std) {
		if(std.score >score) {
			return -1;
		}else if(std.score == score) {
			return 0;
		}else {
			return 1;
		}
	}
	
}
