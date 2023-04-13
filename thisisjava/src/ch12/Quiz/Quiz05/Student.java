package ch12.Quiz.Quiz05;

public class Student {

	
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		
		return studentNum;
	}
	
	
	//코드를 작성하시오
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student student) {
			student = (Student)obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	
}
