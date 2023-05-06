                        package ch15.Quiz.Quiz08;

public class Student {
	
	public int stdNum;
	public String stdName;
	
	public Student(int stdNum, String stdName) {
		
		this.stdNum = stdNum;
		this.stdName = stdName;
	}
	
	
	
	//여기에 코드를 작성해 주세요
	@Override
	public int hashCode() {
		return stdNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student std) {
			return std.hashCode() == stdNum;
		}else {
			return false;
		}
	}
}
