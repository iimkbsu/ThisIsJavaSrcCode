package ch19.sec05.exam01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EchoServer {

	private static ServerSocket ss;

	// 스레드풀 만들고 스레드 최대 10개로 제한하기
	private static ExecutorService threadPool = Executors.newFixedThreadPool(10);

	// 서버 시작 메소드
	public static void startServer() {

		// 스레드 만들고 run() 재정의
		// run()에 Port번호 50001로 서버 소켓 객체 만들고 소켓 accept() 반복처리하여 대기시킴
		// 반복처리 안에 스레드풀 실행 정의하기 (클라에서 데이터 받기 + 클라에게 데이터 보내기, 최대 10개 동시 처리가능)
		// 스레드 실행
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {

				try {
					ss = new ServerSocket(50001);
					System.out.println("[서버] 시작됨");

					while (true) {

						Socket socket = ss.accept();

						threadPool.execute(() -> {
							try {
								InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
								System.out.println("[서버] " + isa.getHostString() + "의 연결 요청을 수락함");

								DataInputStream dis = new DataInputStream(socket.getInputStream());
								String message = dis.readUTF();

								DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
								dos.writeUTF(message);
								dos.flush();
								System.out.println("[서버] 받은 데이터를 다시 보냄 : " + message);

								socket.close();
								System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음\n");
							} catch (Exception e) {

							}

						});

					}

				} catch (Exception e) {
					System.out.println("[서버] : " + e.getMessage());
				}
			}
		});
		thread.start();
	}

	public static void stopServer() {

		try {
			ss.close();
			threadPool.shutdownNow();
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {

		}
	}

	public static void main(String[] args) {

		System.out.println("----------------------------------------");
		System.out.println("서버를 종료하려면 q/Q를 입력하고 Enter키를 입력하세요.");
		System.out.println("----------------------------------------");

		startServer();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			String key = scanner.nextLine();
			if (key.toLowerCase().equals("q")) {
				break;
			}

		}
		scanner.close();
		stopServer();

	}

}
