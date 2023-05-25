package ch18.sec03.exam01;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExample {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("C:/ThisIsJavaTemp/test1.db");

			while(true) {
				int a = is.read();
				if(a == -1) {
					break;
				}
				System.out.println(a);
			}
			is.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
