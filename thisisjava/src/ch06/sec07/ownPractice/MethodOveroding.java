package ch06.sec07.ownPractice;

public class MethodOveroding {
	
	
	//메소드
	static int rectangleArea(double x) {
		int area = (int)x*(int)x;
		
		return area;
	}
	
	//메소드 오버로딩
	static int rectangleArea(double x, double y) {
		int area =(int)x * (int)y;
		return area;
	}
	
	public static void main(String[] args) {
		
		System.out.println(rectangleArea(3));
		System.out.println(rectangleArea(3,4));
	}

}
