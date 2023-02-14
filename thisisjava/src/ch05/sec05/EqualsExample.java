package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		
		String str = "김범수";
		String str1 = "김범수";
		String str2 = new String("김범수");
		
		if(str == str1) {
			System.out.println("str과 str1의 참조 주소값이 같음"); //같음
		}else if(str != str1) {
			System.out.println("str과 str1의 참조 주소값이 다름");
		}
		
		
		if(str == str2) {
			System.out.println("str과 str2의 참조 주소값이 같음");
		}else if(str != str2) {
			System.out.println("str과 str2의 참조 주소값이 다름"); //다름
		}
		
		if(str.equals(str1)) {
			System.out.println("str과 str1의 문자열 자체가 같음"); //같음
		}else {
			System.out.println("str과 str1의 문자열 자체가 다름");
		}
		
		if(str.equals(str2)) {
			System.out.println("str과 str2의 문자열 자체가 같음"); //같음
		}
		else {
			System.out.println("str과 str2의 문자열 자체가 다름");
		}
		
		
		
		
		
		
	}

}
