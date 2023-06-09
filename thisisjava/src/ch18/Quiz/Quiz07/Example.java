

/*
 
 7. 소스파일을 읽고 실행 결과와 같이 행의 라인 번호를 추가시켜 출력하도록 밑줄과 빈 곳에 코드를 작성하시오
 
 */

package ch18.Quiz.Quiz07;

import java.io.*;



public class Example {

	public static void main(String[] args) throws Exception {
		
		String filePath = "../thisisjava/src/ch02/sec01/VariableUseExample.java";
		
		// 빈칸1
		FileReader fr = new FileReader(filePath);
		// 빈칸2
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		
		// 빈칸3
		while(true) {
			rowNumber++;
			rowData = br.readLine();
			if(rowData == null) break;
			System.out.println(rowNumber + "\t" + rowData);
			
		}
		
		br.close();
		fr.close();

	}

}
