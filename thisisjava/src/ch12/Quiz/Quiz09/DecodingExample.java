
//바이트 배열을 UTF-8 문자셋으로 인코딩한 데이터로, 다시 문자열로 디코딩해서 변수 data에 저장하시오


package ch12.Quiz.Quiz09;

public class DecodingExample {

	public static void main(String[] args) throws Exception {
		
		byte[] bytes = {-20, -107, -120, -21, -123, -107};
		
		//작성코드
		String str = new String(bytes, "UTF-8");
		
		
		System.out.println("str: " + str);

	}

}
