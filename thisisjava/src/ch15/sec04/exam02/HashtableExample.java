package ch15.sec04.exam02;

import java.util.Map;
import java.util.Hashtable;



//추가
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;

public class HashtableExample {

	public static void main(String[] args) {
		
		Map<String, Integer> myMap = new Hashtable<>();
		
		Thread threadA = new Thread(new Runnable() {
			@Override
			public void run() {
				
				for(int i=1; i<=1000; i++) {
					myMap.put(String.valueOf(i), i);
				}
			}
			
		});
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				
				for(int i=1001; i<=2000; i++) {
					myMap.put(String.valueOf(i), i);
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		
		// 메인 스레드가 스레드A 스레드B 작업이 다 끝날 때 까지 잠시 기다리거나 또는
		/*
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		*/
		
		
		
		// 메인 스레드가 스레드A 스레드B 작업이 다 끝날 때 까지 join()으로 일시정지
		
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			
		}
		
		
		// Hashtable에 스레드A 스레드B가 동기화 접근하여 각각 1000개 총 2000개의 엔트리를 저장.
		// 메인스레드에서 맵의 엔트리 총 수 출력하기 위해서 스레드A와 스레드B가 모두 일을 마칠 때 까지 가디려야 하기 때문에 join() 사용
		int size = myMap.size();
		System.out.println("총 엔트리 수 : " + size);
		System.out.println();
		
		
		//모든 엔트리를 출력해보자
		Set<Entry<String, Integer>> mySet = myMap.entrySet();
		Iterator<Entry<String, Integer>> myEntryIterator = mySet.iterator();
		
		int counts = 0;
		
		while(myEntryIterator.hasNext()) {
			Entry<String, Integer> myEntry = myEntryIterator.next();
			counts++;
			String tmpKey = myEntry.getKey();
			Integer tmpValue = myEntry.getValue();
			System.out.println(counts+"번→ 키 " + tmpKey +" : 값 "+ tmpValue);
		}
		

	}

}
