
//에코서버. 클라가 서버에 데이터를 보내면 서버가 그 데이터를 다시 클라한테 그대로 보내는 작업

package ch19.sec03.exam02;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class EchoServer {
	
	private static ServerSocket ss = null;
	
	
	public static void startServer() {
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					ss = new ServerSocket(50001);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다림\n");
						Socket s = ss.accept();
						
						InetSocketAddress isa = (InetSocketAddress)s.getRemoteSocketAddress();
						System.out.println("[서버] " + isa.getHostString() +"의 연결 요청을 수락함");
						
						// 데이터 받기
						DataInputStream dis = new DataInputStream(s.getInputStream());
						String message = dis.readUTF();
						
						//데이터 보내기
						DataOutputStream dos = new DataOutputStream(s.getOutputStream());
						dos.writeUTF(message);
						dos.flush();
						System.out.println("[서버] 받은 데이터 다시 보냄 : " + message);
						
						//연결 끊기
						s.close();
						System.out.println("[서버] " + isa.getHostString() + "의 연결을 끊음");
					}
				}catch(IOException e) {
					System.out.println("[서버] " + e.getMessage());
				}
			}
		};
		thread.start();
	}
	
	public static void stopServer() {
		try {
			ss.close();
			System.out.println("[서버] 종료됨");
		}catch(IOException e1) {
			
		}
	}

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------");
		System.out.println(" 서버를 종료하려면 (q/Q)를 입력하고 Enter 키를 입력하세요");
		System.out.println("------------------------------------------------");
		
		startServer();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();
		
		stopServer();

	}

}
