package ch06.sec11.exam02;

public class Earth {
	
	//상수 선언 및 초기화 (static final)
	//지구 반지름
	static final double EARTH_RADIUS = 6400.0;
	
	//상수 선언(대문자_ 선언)
	//지구 표면적
	static final double EARTH_SURFACE_AREA;
	
	//정적 블록 선언 후 상수 초기화만 가능, 이 외의 방법으로 불가
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * Math.pow(EARTH_RADIUS, 2);
	}

}
