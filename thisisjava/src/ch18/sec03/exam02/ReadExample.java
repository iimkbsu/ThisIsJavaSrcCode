package ch18.sec03.exam02;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) {
		
		
		
		try (InputStream is = new FileInputStream("C:/ThisIsJavaTemp/test1.db");){
			
			byte[] arr = new byte[100];
			
			while(true) {
				
				int num = is.read(arr); //바이트배열 arr에 is를 1byte씩 입력하고 입력한 개수를 num에 저장 더 이상 읽을 게 없으면 -1 리턴
				
				for(int i=0; i<num; i++) {
					System.out.println(arr[i]);
				}
				if(num == -1)
					break;
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		
		
		
	}

}
