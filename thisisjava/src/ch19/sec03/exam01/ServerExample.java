package ch19.sec03.exam01;

import java.net.*;
import java.io.IOException;
import java.util.Scanner;

public class ServerExample {
	
	private static ServerSocket ss = null;

	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요.");
		System.out.println("----------------------------------------------");
		
		
		//TCP 서버 시작
		startServer();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String key = sc.nextLine();
			if(key.toUpperCase().equals("Q")) {
				break;
			}
		}
		sc.close();
		
		//TCP 서버 종료
		stopServer();
		
		
		
	}
	
	
	
	public static void startServer() {
		
		//작업 스레드 정의
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//ServerSocket 생성 및 Port 바인딩
					ss = new ServerSocket(50001);
					System.out.println("[서버] 시작 됨");
					
					// 클라에서 연결 요청이 오면 무한 수락하기 위해 accept()를 while 반복문을 사용하여 반복시킴
					while(true) {
						System.out.println("\n[서버] 요청을 기다리는 중");
						//연결 수락
						Socket s = ss.accept();
						
						//연결된 클라 정보 얻기
						InetSocketAddress isa = (InetSocketAddress)s.getRemoteSocketAddress();
						// 클라이언트 IP 주소 확인
						System.out.println("[서버] " + isa.getHostString() + "의 연결 요청을 수락함");
						// 클라이언트 Port 번호 확인
						System.out.println("[서버] " + isa.getPort());
						
						//연결 끊기
						s.close();
						System.out.println("[서버] " + isa.getHostString() + "의 연결을 끊음");
					}
				}catch(IOException e) {
					System.out.println("[서버] " + e.getMessage());
				}
			}
		};
		
		//스레드 시작
		thread.start();
		
		
	}
	
	public static void stopServer() {
		
		//ServerSocket을 닫고 Port 언바인딩
		try {
			ss.close();
			System.out.println("[서버] 종료됨");
		}catch(IOException e1) {
			
		}
	}

}
