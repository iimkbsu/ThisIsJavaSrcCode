
/*
 
 10. 실행하면 다음과 같이 원본 파일 경로와 복사 파일 경로를 콘솔로 입력받고 원본 파일을 복사하는 프로그램을 만들어라.
 
 	# 조건
 		- 바이트 기반 스트림, 성능 향상 보조스트림 반드시 사용
 		- 원본 파일이 존재하지 않을 경우, "원본 파일이 존재하지 않습니다" 출력할 것
 		- 복사 파일 경로에서 디렉토리가 존재하지 않으면 경로상의 모든 디렉토리를 자동 생성할 것
 		- 복사가 성공되었을 때 "복사가 성공되었습니다" 출력할 것
 		
 	
 	# 출력결과
 		<원본 파일이 존재하지 않을 경우>
 		
 		원본 파일 경로 : C:/ThisIsJavaTemp/dir1/photo1.jpg
 		복사 파일 경로 : C:/ThisIsJavaTemp/dir2/photo2.jpg
 		원본 파일이 존재하지 않습니다.
 		
 		<원본 파일이 존재할 경우>
 		
 		원본 파일 경로 : C:/ThisIsJavaTemp/dir1/photo1.jpg
 		복사 파일 경로 : C:/ThisIsJavaTemp/dir2/photo2.jpg
 		복사가 성공되었습니다.
 		
 
 */


package ch18.Quiz.Quiz10;

import java.util.Scanner;
import java.io.*;


public class Example {

	public static void main(String[] args) {
		
		
		try {
			Scanner myScanner = new Scanner(System.in);
			
			
			System.out.print("원본 파일 경로 : ");
			String originalFilePath = myScanner.nextLine();
			
			System.out.print("복사 파일 경로 : ");
			String targetFilePath = myScanner.nextLine();

			
			File originalFile = new File(originalFilePath);
			if(!originalFile.exists()) {
				System.out.println("원본파일이 존재하지 않습니다.");
			}
			
			
			File targetFile = new File(targetFilePath);
			File parentFile = targetFile.getParentFile();
			
			if(!parentFile.exists()) {
				parentFile.mkdirs();
			}
			
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalFilePath));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFilePath));
			
			byte[] data = new byte[1024];
			int num = -1;
			
			while(true) {
				num = bis.read(data);
				if(num == -1) { break; }
				bos.write(data, 0, num);
			}
			System.out.println("복사가 성공되었습니다.");
			
			bis.close(); bos.close(); 
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}












