package ch15.sec04.exam01;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

import java.util.Set;
import java.util.Iterator;

import java.util.Collection;


public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> myMap = new HashMap<>();
		
		myMap.put("신용권", 85);
		myMap.put("홍길동", 90);
		myMap.put("동장군", 80);
		myMap.put("홍길동", 95); //키 중복 안 됨. 값만 85→95 변경
		
		int mapSize = myMap.size();
		System.out.println("myMap 엔트리 수 : " + mapSize);
		
		
		int value = myMap.get("홍길동");
		System.out.println("홍길동 : " + value);
		
		System.out.println();
		
		Set<String> myKeySet = myMap.keySet();
		Iterator<String> myKeySetIterator = myKeySet.iterator();
		
		while(myKeySetIterator.hasNext()) {
			String k = myKeySetIterator.next();
			int v = myMap.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		Set<Entry<String, Integer>> myEntrySet = myMap.entrySet();
		Iterator<Entry<String, Integer>> myEntrySetIterator = myEntrySet.iterator();
		
		while(myEntrySetIterator.hasNext()) {
			Entry<String, Integer> myEntry = myEntrySetIterator.next();
			String k = myEntry.getKey();
			int v = myEntry.getValue();
			System.out.println(k +" : "+ v);
		}
		
		System.out.println();
		
		int tmp = myMap.remove("홍길동");
		System.out.println("키가 \"홍길동\"인 엔트리 삭제 : 리턴 값 " + tmp);
		
		System.out.println("myMap 엔트리 수 : " + myMap.size());
		Set<Entry<String, Integer>> myEntrySet1 = myMap.entrySet();
		Iterator<Entry<String, Integer>> myEntrySetIterator1 = myEntrySet1.iterator();
		
		while(myEntrySetIterator1.hasNext()) {
			Entry<String, Integer> myEntry = myEntrySetIterator1.next();
			String k = myEntry.getKey();
			int v = myEntry.getValue();
			System.out.println(k +" : "+ v);
		}
		System.out.println();
		
		
		System.out.println("Collection 인터페이스 구현객체로 Map의 엔트리의 값만 저장");
		System.out.println("Iterator로 반복해서 값 출력하기");
		//
		Collection<Integer> myCol = myMap.values();
		Iterator<Integer> myIntIterator = myCol.iterator();
		while(myIntIterator.hasNext()) {
			System.out.println(myIntIterator.next());
		}

	}

}
