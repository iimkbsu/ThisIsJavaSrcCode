package ch18.sec10;

import java.io.*;

import java.util.Arrays;


public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		
		
		//현재 프로그램에서 C:/ThisIsJavaTemp/object.dat에 스트림으로 객체 출력(저장)
		FileOutputStream fos = new FileOutputStream("C:/ThisIsJavaTemp/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Member m1 = new Member("fall", "단풍이");
		Product p1 = new Product("노트북", 1000000);
		int[] arr1 = {1,2,3};
		
		
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr1);
		
		oos.flush(); oos.close(); fos.close();
		
		
		// C:/ThisIsJavaTemp/object.dat에서 현재 프로그램으로 객체를 스트림으로 가져와서 입력(불러오기)
		FileInputStream fis = new FileInputStream("C:/ThisIsJavaTemp/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Member m2 = (Member) ois.readObject();
		Product p2 = (Product) ois.readObject();
		int[] arr2 = (int[]) ois.readObject();
		
		ois.close(); fis.close();
		
		
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));
		
	}

}
