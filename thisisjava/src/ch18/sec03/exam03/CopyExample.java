package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {

	public static void main(String[] args) {
		
		String originalFileName = "C:/ThisIsJavaTemp/test.jpg";
		String copyFileName = "C:/ThisIsJavaTemp/test2.jpg";
		
		try (InputStream is = new FileInputStream(originalFileName); OutputStream os = new FileOutputStream(copyFileName);) {
			
			byte[] data = new byte[1024]; // 1KB
			
			while(true) {
				int num = is.read(data);
				if(num == -1) {
					break;
				}
				os.write(data, 0, num);
			}
			
			os.flush();

			System.out.println("복사가 잘 되었습니다");
			
		}catch(Exception e) {
			
		}
		
		
		

	}

}
