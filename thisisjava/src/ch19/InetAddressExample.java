package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressExample {

	public static void main(String[] args) {
		
		try {
			
			// 현재 컴퓨터(로컬호스트) IP 주소 얻기
			InetAddress ia = InetAddress.getLocalHost();
			
			System.out.println(ia);
			System.out.println(ia.getAddress()); // 이거는 스택에 있는 객체 주소를 불러옴
			System.out.println(ia.getHostAddress());
			System.out.println();
			
			
			
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			
			System.out.println(Arrays.toString(iaArr));
			System.out.println();
			
			for(InetAddress iaa : iaArr) {
				System.out.println(iaa);
			}
			System.out.println();
			
			for(InetAddress iaaa : iaArr) {
				System.out.println(iaaa.getHostAddress());
			}
			
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		

	}

}
