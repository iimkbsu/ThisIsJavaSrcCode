package ch18.sec11;

import java.nio.file.Files;
import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import java.io.FileWriter;
import java.io.FileReader;

public class FileExample {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:/ThisIsJavaTemp1/images");
		File file1 = new File("C:/ThisIsJavaTemp1/file1.txt");
		File file2 = new File("C:/ThisIsJavaTemp1/file2.txt");
		File file3 = new File("C:/ThisIsJavaTemp1/file3.txt");
		
		
		if(dir.exists() == false) {dir.mkdirs();}
		if(file1.exists() == false) {file1.createNewFile();}
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		
		FileWriter fw = new FileWriter("C:/ThisIsJavaTemp1/file1.txt");
		fw.write("abcd");
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader("C:/ThisIsJavaTemp1/file1.txt");
		
		char[] tmp1 = new char[10];
		while(true) {
			int check = fr.read(tmp1);
			if(check == -1) break;
		}
		System.out.println("C:/ThisIsJavaTemp1/file1.txt 내용 출력 : " + Arrays.toString(tmp1));
		System.out.println("\n");
		fr.close();
		
		
		
		
		File tmp = new File("C:/ThisIsJavaTemp1");
		File[] contents = tmp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
			
			if(file.isDirectory()) {
				System.out.printf("%-10s%-20s", "<DIR>", file.getName());
			}
			else {
				System.out.printf("%-10s%-20s", file.length(), file.getName());
			}
			System.out.println();
		}

	}

}
