package ch18.sec02.exam01;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class WriteExample {

	public static void main(String[] args) {
		
		//10, 20, 30 정수가 저장된 바이트를 파일 C:\ThisIsJavaTemp\test1.db로 출력해서 저장
		
		/*
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:\\ThisIsJavaTemp\\test1.db");
			
			os.write(10);
			os.write(20);
			os.write(30);
			os.flush();

		}catch(Exception e) {}
		finally {
			try {
				os.close();
			}catch(IOException e) {
				
			}
		}
		*/
		
		try(OutputStream os = new FileOutputStream("C:\\ThisIsJavaTemp\\test1.db")){
			os.write(10);
			os.write(20);
			os.write(30);
			os.flush();
		}catch(Exception e) {
			
		}

	}

}
