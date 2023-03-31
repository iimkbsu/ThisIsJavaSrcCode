
//try-catch-finally로 예외처리한 코드

package ch11.Quiz.Quiz8;

import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("file.txt");
			fw.write("java");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				fw.close();
			}
			catch(IOException e) {
				
			}
		}

	}

}
