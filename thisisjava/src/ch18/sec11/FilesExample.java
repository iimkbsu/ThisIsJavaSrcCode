package ch18.sec11;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;

public class FilesExample {

	public static void main(String[] args) {
		
		try {
			String data = "" + "id: winter\n" + "email: winter@mycompany.com\n" + "tel: 010-1234-1234";
			
			Path path = Paths.get("C:/ThisIsJavaTemp/user.txt");
			
			Files.writeString(path, data, Charset.forName("UTF-8"));
			
			System.out.println("파일 유형 : " + Files.probeContentType(path));
			System.out.println("파일 크기 : " + Files.size(path) + "bytes");
			
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
