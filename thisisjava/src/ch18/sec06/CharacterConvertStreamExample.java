package ch18.sec06;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;

import java.io.Writer;
import java.io.OutputStreamWriter;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;

import java.io.Reader;


public class CharacterConvertStreamExample {

	public static void main(String[] args) {
		
		write("입출력스트림을 문자변환스트림을 사용하여 문자스트림으로 변환합니다.");
		
		String data = read();
		System.out.println(data);
		
	}
	
	public static void write(String str) {
		
		try {
			OutputStream os = new FileOutputStream("C:/ThisIsJavaTemp/test.txt");
			Writer writer = new OutputStreamWriter(os);
			writer.write(str);
			writer.flush();
			
			os.close();
			writer.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

	public static String read() {
		
		try {
			InputStream is = new FileInputStream("C:/ThisIsJavaTemp/test.txt");
			Reader reader = new InputStreamReader(is);
			char[] data = new char[100];
			int num = reader.read(data);
			
			is.close();
			reader.close();
			
			String str = new String(data, 0, num);
			
			return str;
			
 		}catch(IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
