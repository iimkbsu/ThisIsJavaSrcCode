package ch11.Quiz.Quiz6;

public class Main {
	
	static String[] strArray = {"10", "2a"};
	static int value = 0;
	
	static void method() {
		for(int i=0; i<=2; i++) {
			
			try {
				value = Integer.parseInt(strArray[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과함");
			}catch(NumberFormatException e){
				System.out.println("숫자로 변환할 수 없음");
			}finally {
				System.out.println(value);
			}
		}
	}
	

	public static void main(String[] args) {
		
		method();
		
		

	}

}

/*
 
 출력:
 
 10  				(for문 돌아서 try의 value에 "10"을 int 형 10으로 저장, 두 개의 catch 예외처리 없이 finally에서 value 출력)
 숫자로 변환할 수 없음 	(for문 돌아서 try의 value에 "2a"를 int 형으로 저장하려고 했더니 "2a"는 parseInt 안 되면서 NumberFormatException 예외처리 catch)
 10 				(finally에서 value 출력, 여전히 10)
 인덱스를 초과함 		(for문 돌면서 try의 strArray[]에 배열인덱스 2가 들어가면서 바운드 초과되는 예외 발생, catch를 통해 예외처리)
 10 				(finally에서 value 출력, 여전히 10)
 
 */
 