package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		//변수 사용범위 (전역변수, 지역변수)
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5; //v2 에러발생(지역변수)
		
	}

}
