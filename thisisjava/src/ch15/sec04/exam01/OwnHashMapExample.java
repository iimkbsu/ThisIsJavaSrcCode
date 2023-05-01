package ch15.sec04.exam01;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

import java.util.Set;
import java.util.Iterator;


public class OwnHashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> myMap = new HashMap<>();
		
		myMap.put("kbs1", 1234);
		myMap.put("kbs2", 1234);
		myMap.put("kbs3", 1234);
		myMap.put("kbs1", 4321);
		
		boolean keyExist = myMap.containsKey("kbs4");
		System.out.println("kbs4 키 존재 : " + keyExist);
		
		boolean valueExist = myMap.containsValue(4321);
		System.out.println("4321 값 존재 : " + valueExist);
		
		int mapSize = myMap.size();
		System.out.println("map 엔트리 수 : " + mapSize);
		
		
		myMap.clear();
		System.out.println("map 엔트리 수 : " + myMap.size());
		
		System.out.println();
		System.out.println("----------------------------");
		
		///////////////////////////////////
		myMap.put("kbs1", 1234);
		myMap.put("kbs2", 1234);
		myMap.put("kbs3", 1234);
		myMap.put("kbs1", 4321);
		
		System.out.println("kbs3 키를 가진 엔트리 삭제 : " + myMap.remove("kbs3"));
		System.out.println("map 엔트리 수 : " + myMap.size());
		System.out.println();
		
		/*
		myMap
		("kbs1", 4321)
		("kbs2", 1234)
		*/
		
		Set<String> mySetString = myMap.keySet();
		Iterator<String> myStringIterator = mySetString.iterator();
		
		Set<Entry<String, Integer>> mySet = myMap.entrySet();
		Iterator<Entry<String, Integer>> myEntryIterator = mySet.iterator();
		
		
		System.out.println("String 키만 저장한 set의 이터레이터 반복");
		while(myStringIterator.hasNext()) {
			String tmpStr = myStringIterator.next();
			System.out.println(tmpStr);
		}
		System.out.println();
		
		
		System.out.println("엔트리를 저장한 set의 이터레이터 반복");
		while(myEntryIterator.hasNext()) {
			Entry<String, Integer> tmpEntry = myEntryIterator.next();
			String tmpStr = tmpEntry.getKey();
			int tmpInt = tmpEntry.getValue();
			
			System.out.println(tmpStr +" "+ tmpInt);
		}
		
		

	}

}
