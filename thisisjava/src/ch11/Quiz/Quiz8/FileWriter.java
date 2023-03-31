package ch11.Quiz.Quiz8;

import java.io.IOException;

//AutoCloseable 인터페이스의 close() 메소드를 Overriding 하여 자동으로 닫게 함
//닫을 때 예외는 IOException 클래스에게 넘김
public class FileWriter implements AutoCloseable {
	
	
	public FileWriter(String filePath) throws IOException {
		System.out.println(filePath + " 파일을 엽니다.");
	}
	
	
	
	///////////
	public void write(String data) throws IOException {
		System.out.println(data + "를 파일에 저장합니다.");
	}
	
	@Override
	public void close() throws IOException {
		System.out.println("파일을 닫습니다.");
	}

}
