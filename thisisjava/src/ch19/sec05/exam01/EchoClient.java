package ch19.sec05.exam01;

import java.io.*;
import java.net.*;

public class EchoClient {

	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("localHost", 50001);
			
			System.out.println("[클라이언트] 연결 성공");
			
			//데이터 보내기
			String sendMessage = "나는 자바가 좋아~";
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄 : " + sendMessage);
			
			//데이터 받기
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String receivedMessage = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받음 : " + receivedMessage);
			
			//연결 끊기
			s.close();
			System.out.println("[클라이언트] 연결 끊음");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
