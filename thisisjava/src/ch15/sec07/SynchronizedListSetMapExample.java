
/*
 ArrayList의 동기화 버전인 Vector
 HashMap의 동기화 버전인 Hashtable, Priorites
 를 제외한 Set Map List를 동기화 시켜보자
 
 */

package ch15.sec07;

import java.util.List;
import java.util.ArrayList;

import java.util.Set;
import java.util.HashSet;

import java.util.Map;
import java.util.HashMap;

import java.util.Collections;
import java.util.Map.Entry;

import java.util.Iterator;

public class SynchronizedListSetMapExample {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		List<String> mySyncList = Collections.synchronizedList(myList);
		
		//또는
		List<String> mySynList = Collections.synchronizedList(new ArrayList<String>());
		
		
		Set<Integer> mySet = new HashSet<>();
		Set<Integer> mySyncSet = Collections.synchronizedSet(mySet);
		
		//또는
		Set<Integer> mySynSet = Collections.synchronizedSet(new HashSet<Integer>());
		
		
		Map<Integer, String> myMap = new HashMap();
		Map<Integer, String> mySyncMap = Collections.synchronizedMap(myMap);
		
		//또는
		Map<Integer, String> mySynMap = Collections.synchronizedMap(new HashMap<>());
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				
				for(int i=1; i<=1000; i++) {
					mySynMap.put(i, "내용"+i);
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					mySynMap.put(i, "내용"+i);
				}
			}
		};
		
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		}catch(InterruptedException e) {
			
		}
		
		
		Set<Entry<Integer, String>> myMaptoSet = mySynMap.entrySet();
		
		for(Entry<Integer, String> e : myMaptoSet) {
			System.out.println(e.getKey() +" : " + e.getValue());
		}
		
		System.out.println("\n");
		
		Iterator<Entry<Integer, String>> myIt = myMaptoSet.iterator();
		
		while(myIt.hasNext()) {
			Entry<Integer, String> e = myIt.next();
			System.out.println(e.getKey() + " : " + e.getValue() );
		}
		
		
		
		
		

	}

}
