
/*
 
 뉴스가 반복적으로 제공되는 서버를 만들어보자.
 뉴스가 중간에 한두 개 손실되어도 큰 문제가 없으므로 UDP 서버로 뉴스를 제공.
 
 */

package ch19.sec04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

public class NewsServer {

	private static DatagramSocket dgs;

	//
	public static void startServer() {

		// 작업스레드 정의
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					// DatagramSocket 생성 및 Port 바인딩
					dgs = new DatagramSocket(50001);
					System.out.println("[UDP서버] 시작됨");

					while (true) {
						// 클라이언트가 구독하고 싶은 뉴스 주제 얻기
						System.out.println("클라가 요청한 뉴스 종류 얻기 위해 서버 대기");
						
						DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
						dgs.receive(receivePacket);
						
						

						byte[] bytes = receivePacket.getData();
						int num = receivePacket.getLength();
						String newsKind = new String(bytes, 0, num, "UTF-8");

						// 클라이언트 IP주소와 Port정보 있는 SocketAddress 얻기
						SocketAddress sa = receivePacket.getSocketAddress();
						
						// 주제와 관련된 뉴스 10개를 클라로 전송하기
						for(int i=1; i<=10; i++) {
							String data = newsKind + ": 뉴스" + i;
							byte[] dataBytes = data.getBytes("UTF-8");
							DatagramPacket sendPacket = new DatagramPacket(dataBytes, 0, dataBytes.length, sa);
							dgs.send(sendPacket);
							Thread.sleep(1000);
						}

					}

				} catch (Exception e) {
					System.out.println("[UDP서버] : " + e.getMessage());
				}
			}
		});
		thread.start();
	}

	//
	public static void stopServer() {
		
		dgs.close();
		System.out.println("[UDP 서버] 종료됨");

	}

	//
	public static void main(String[] args) {

		System.out.println("-------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter키를 입력하세요");
		System.out.println("-------------------------------------------");

		// UDP 서버 시작
		startServer();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			String key = scanner.nextLine();
			if (key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();

		// UDP 서버 종료
		stopServer();

	}

}
