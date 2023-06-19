package ch19.sec05.exam02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewsServer {
	
	private static DatagramSocket dgs;
	private static ExecutorService threadPool = Executors.newFixedThreadPool(10);
	
	public static void startServer() {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					dgs = new DatagramSocket(50001);
					System.out.println("[서버] 시작됨");

					while(true){
						DatagramPacket receivedPacket = new DatagramPacket(new byte[1024], 1024);
						System.out.println("클라이언트의 희망 뉴스 종류 얻기 위해 대기중");
						
						dgs.receive(receivedPacket);
						
						threadPool.execute(()->{
							try {
								String newsKind = new String(receivedPacket.getData(), 0, receivedPacket.getLength(), "UTF-8");
								
								SocketAddress sa = receivedPacket.getSocketAddress();
								
								for(int i=1; i<=100; i++) {
									String data = newsKind + ": 뉴스" +i;
									byte[] bytes = data.getBytes("UTF-8");
									DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, sa);
									dgs.send(sendPacket);
									Thread.sleep(1000);
								}
							}catch(Exception e) {
								
							}
							
						});
						
					}
				}catch(Exception e) {
					System.out.println("[서버] : " + e.getMessage());
				}
			}
		});
		
		thread.start();
		
	}
	
	public static void stopServer() {
		
		dgs.close();
		threadPool.shutdownNow();
		System.out.println("[서버] 종료됨");
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
