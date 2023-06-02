package ch18.sec06;

import java.io.OutputStream;
import java.io.FileOutputStream;

import java.io.Writer;
import java.io.OutputStreamWriter;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;

import java.io.Reader;


public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
		
	}
	
	public static void write(String str) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/ThisIsJavaTemp/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	
	
	public static String read() throws Exception {
		
		InputStream is = new FileInputStream("C:/ThisIsJavaTemp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		char[] data = new char[1000];
		int num = reader.read(data);
		reader.close();
		String str = new String(data, 0, num);
		return str;
	}

}
