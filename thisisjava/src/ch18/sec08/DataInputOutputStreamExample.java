package ch18.sec08;

import java.io.*;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("C:/ThisIsJavaTemp/primitive.db");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("홍길동");
			dos.writeDouble(95.5);
			dos.writeInt(1);
			
			dos.writeUTF("김자바");
			dos.writeDouble(90.3);
			dos.writeInt(2);
			
			dos.writeUTF("김스프링");
			dos.writeDouble(91.3);
			dos.writeInt(3);
			
			dos.writeUTF("이JSP");
			dos.writeDouble(97.7);
			dos.writeInt(4);
			
			dos.flush();
			dos.close();
			fos.close();
			
			
			
			FileInputStream fis = new FileInputStream("C:/ThisIsJavaTemp/primitive.db");
			DataInputStream dis = new DataInputStream(fis);
			
			//교제방식
			for(int i=0; i<2; i++) {
				String name = dis.readUTF();
				Double score = dis.readDouble();
				int order = dis.readInt();
				System.out.println(name + " : " + score + " : " + order);
			}
			
			System.out.println("------------------------------------");
			
			
			//while 반복 방식
			//EOFException 예외는 read() 메소드에서 읽을 게 없어서 null일 경우에 발생, 예외처리로 반복문 break 해주는 방식으로 빠져나옴
			while(true) {
				
				try {
					String name = dis.readUTF();
					Double score = dis.readDouble();
					int order = dis.readInt();
					System.out.println(name + " : " + score + " : " + order);
					
				}catch(EOFException e) {
					break;
				}
				
			}
			
			
			dis.close();
			fis.close();
			
			
		}catch(IOException e ) {
			e.printStackTrace();
		}
		
		

	}

}
