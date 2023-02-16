package ch06.sec08.exam04;

public class Calculator {
	
	//메소드 오버로딩
	
	//하나의 값만 들어왔을 때 정사각형
	double areaRectangle(double width) {
		return width * width;
	}
	
	//두개의 값이 들어왔을 때 직사각형
	double areaRectangle(double width, double height) {
		return width * height;
	}

}
