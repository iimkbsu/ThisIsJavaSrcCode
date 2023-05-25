package ch18.sec02.exam02;

import java.io.OutputStream;
import java.io.FileOutputStream;

import java.io.IOException;

public class WriteExample {

	public static void main(String[] args) {
	
		try {
			OutputStream os = new FileOutputStream("C:/ThisIsJavaTemp/test2.db/");
			
			os.write(new byte[] {10, 20, 30});
		
			os.close(); //자동 flush() 후 close()됨.
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
