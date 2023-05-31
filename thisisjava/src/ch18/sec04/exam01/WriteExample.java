package ch18.sec04.exam01;

import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {

	public static void main(String[] args) {

		try {
			//문자 기반 출력 스트림 생성
			Writer writer = new FileWriter("C:/ThisIsJavaTemp/test.txt");
			
			char a = 'A';
			char b = 'B';
			char enter = 10; //10 or 13은 enter
			
			writer.write(a);
			writer.write(65);
			writer.write(enter);
			
			writer.write(b);
			writer.write(enter);
			
			char[] charArr = {'C','D','E'};
			
			writer.write(charArr);
			writer.write(enter);
			
			writer.flush();
			
			
			writer.write(charArr, 0, 2);
			writer.write(enter);
			
			String str = "FGH";
			writer.write(str);
			writer.write(enter);
			
			writer.write(str, 1, 2);
			writer.write(enter);
			
			
			writer.flush();
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("문자 출력 스트림 종료");
		}
		
		

	}

}
