package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("src/ch18/sec07/exam02/ReadLineExample.java");
		BufferedReader br = new BufferedReader(fr);
		
		int lineNum = 1;
		while(true) {
			String str = br.readLine();
			
			lineNum++;
			if(str == null) {
				break;
			}
			System.out.println(lineNum+ "\t" + str);
			
		}
		
		
		br.close();
	}

}
