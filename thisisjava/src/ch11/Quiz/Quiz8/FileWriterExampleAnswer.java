
//FileWriterExample 코드를 리소스 자동닫기를 이용하도록 수정

package ch11.Quiz.Quiz8;

import java.io.IOException;

public class FileWriterExampleAnswer {

	public static void main(String[] args) {
		
		
		
		try(FileWriter fw = new FileWriter("file.txt")){
			fw.write("java");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			
		}

	}

}
