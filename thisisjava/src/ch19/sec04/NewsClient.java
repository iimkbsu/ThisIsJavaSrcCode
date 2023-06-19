package ch19.sec04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class NewsClient {

	public static void main(String[] args) {
		
		try {
			// UDP 클라이언트 DatagramSocket 생성
			DatagramSocket dgs = new DatagramSocket();
			
			// UDP 서버에 보낼 문자열 데이터(바이트로 바꿈)
			String data = "정치";
			byte[] bytes = data.getBytes("UTF-8");
			
			// 보낼 바이트배열데이터를 DatagramPacket에 저장
			DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, new InetSocketAddress("localHost", 50001));
			
			// DatagramSocket으로 sendPacket 보내기
			dgs.send(sendPacket);
			
			
			// UDP 서버에서 뉴스 받기 (서버단에서 10개 보냄)
			while(true) {
				DatagramPacket receivedPacket = new DatagramPacket(new byte[1024], 1024);
				dgs.receive(receivedPacket);
				
				//받은 패킷 문자열로 변환
				String receivedNews = new String(receivedPacket.getData(), 0, receivedPacket.getLength(), "UTF-8");
				
				System.out.println(receivedNews);
				//10개 뉴스 받으면 while문 종료
				if(receivedNews.contains("뉴스10")) {
					break;
				}
			}
			// DatagramSocekt 닫기
			dgs.close();
			
		} catch (Exception e) {
			System.out.println("[UDP 클라이언트] : " + e.getMessage());
		}
		

	}

}
