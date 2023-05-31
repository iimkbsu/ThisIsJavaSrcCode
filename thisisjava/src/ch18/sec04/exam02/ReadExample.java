package ch18.sec04.exam02;

import java.io.Reader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExample {

	public static void main(String[] args) {
		
		Reader reader = null;
		
		try {
			reader = new FileReader("C:/ThisIsJavaTemp/test.txt");
			//문자 하나씩 읽기
			while(true) {
				int data = reader.read();
				if(data == -1) {
					break;
				}else System.out.print((char)data);
			}
			reader.close();
			System.out.println();
			
			//문자 배열로 읽기
			reader = new FileReader("C:/ThisIsJavaTemp/test.txt");
			char[] data = new char[1000];
			
			while(true) {
				int num = reader.read(data);
				if(num == -1) {
					break;
				}else {
					for(int i=0; i<num; i++) {
						System.out.print(data[i]);
					}
				}
			}
			reader.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
