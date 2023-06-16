package ch19.sec03.exam01;

import java.net.Socket;
import java.io.IOException;
import java.net.UnknownHostException;
import java.net.InetSocketAddress;

public class ClientExample {

	public static void main(String[] args) {
		
		try {
			Socket s = new Socket();
			
			s.connect( new InetSocketAddress("localhost", 50001));
			
			System.out.println("[클라이언트] 연결 성공");
			
			s.close();
			System.out.println("[클라이언트] 연결 끊음");
			
		}catch(UnknownHostException e) {
			System.out.println("UnknownHostException : " + e.toString());
			
		}catch(IOException e1) {
			System.out.println("IOException : " + e1.toString());
		}
		

	}

}
