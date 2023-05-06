package ch15.sec05.exam02;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import java.util.Set;
import java.util.NavigableSet;
import java.util.NavigableMap;
import java.util.Iterator;


public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> myTreeMap = new TreeMap<>();
		
		myTreeMap.put("apple", 10);
		myTreeMap.put("forever", 60);
		myTreeMap.put("description", 40);
		myTreeMap.put("ever", 50);
		myTreeMap.put("zoo", 80);
		myTreeMap.put("base", 20);
		myTreeMap.put("guess", 70);
		myTreeMap.put("cherry", 30);
		
		
		// Entry 하나씩 갖고오기 방법1
		Set<Entry<String, Integer>> myEntrySet = myTreeMap.entrySet();
		
		for(Entry<String, Integer> e : myEntrySet) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("\n");
		
		
		
		// Entry 하나씩 갖고오기 방법2
		Iterator<Entry<String, Integer>> myIterator = myEntrySet.iterator();
		
		while(myIterator.hasNext()) {
			Entry<String, Integer> tmpEntry = myIterator.next();
			System.out.println(tmpEntry.getKey() + " : " + tmpEntry.getValue());;
		}
		System.out.println("\n");
		
		
		
		//
		Entry<String, Integer> entry = null;
		entry = myTreeMap.firstEntry();
		System.out.println("TreeMap의 제일 처음 Entry");
		System.out.println(entry.getKey() + " : " + entry.getValue());

		System.out.println("\n");
		
		//
		entry = myTreeMap.lastEntry();
		System.out.println("TreeMap의 제일 마지막 Entry");
		System.out.println(entry.getKey() + " : " + entry.getValue());
		
		System.out.println("\n");
		
		//ever키를 가진 Entry의 바로 앞 Entry
		entry = myTreeMap.lowerEntry("ever");
		System.out.println("TreeMap에서 ever키를 가진 Entry의 바로 앞 Entry");
		System.out.println(entry.getKey() + " : " + entry.getValue());
		
		System.out.println("\n");
		
		
		System.out.println("내립차순 정렬");
		System.out.println();
		//내림차순 정렬 Map
		NavigableMap<String, Integer> dnm = myTreeMap.descendingMap();
		
		//Entry 하나씩 갖고오기 방법 1
		Set<Entry<String, Integer>> dEntrySet = dnm.entrySet();
		for(Entry<String, Integer> e : dEntrySet) {
			System.out.println(e.getKey() +" : " + e.getValue());
		}
		System.out.println("\n");
		
		//Entry 하나씩 갖고오기 방법 2
		Iterator<Entry<String, Integer>> dIterator = dEntrySet.iterator();
		while(dIterator.hasNext()) {
			Entry<String, Integer> e = dIterator.next();
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("\n");
		
		// c~h 사이 단어 키 검색
		System.out.println("키의 첫 글자가 c~h 사이의 단어 검색");
		NavigableMap<String, Integer> rangeMap = myTreeMap.subMap("c", true, "h", false);
	
		for(Entry<String, Integer> e : rangeMap.entrySet()) {
			System.out.println(e.getKey() +" : " + e.getValue());
		}
		
	}

}
