package ch18.sec04.exam02;

import java.io.Reader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample {

	public static void main(String[] args) {
		
		Reader reader = null;
		
		try {
			reader = new FileReader("C:/ThisIsJavaTemp/test.txt");
			
			int a = reader.read();
			char aa = (char)reader.read();
			
			System.out.println("읽기스트림.read() : " + a + "\n(char) 읽기스트림.read() : " + aa);
			System.out.println();
			
			
			
			char[] word = new char[1000];
			
			int length = reader.read(word);
			
			for(int i=0; i<length; i++) {
				char data = word[i];
				System.out.print(data);
			}
			
			reader.close();
			
			System.out.println();
			
			reader = new FileReader("C:/ThisIsJavaTemp/test.txt");
			while(true) {
				int data = reader.read();
				if(data == -1) {
					break;
				}else {
					System.out.print((char)data);
				}
			}
			reader.close();
			
			System.out.println();
			
			
			reader = new FileReader("C:/ThisIsJavaTemp/test.txt");
			
			char[] data = new char[1000];
			
			while(true) {
				int num = reader.read(data);
				if(num == -1) break;
				for(int i=0; i<num; i++) {
					System.out.print(data[i]);
				}
			}
			reader.close();
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("\n입력스트림 완료");
		}
		
		

	}

}
