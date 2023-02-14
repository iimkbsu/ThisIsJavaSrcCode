package ch02.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		//자바13부터 텍스트 블록 제공
		
		String str1 = "" +
		"{\n"+
		"\t\"id\":\"winter\"\n"+
		"\t\"name\":\"눈송이\"\n"+
		"}";
		
		String str2 = """
				{
					"id"= "summer"
					"name" = "매미"
				}
				--------------------------
				""";
		String str3 = """
				나는 \
				자바를 \
				학습합니다.
				나는 자바를 학습합니다.
				""";
		
		System.out.println(str1);
		System.out.println("--------------------------");
		System.out.println(str2);
		System.out.println(str3);

	}

}
