package ch15.sec08;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;


public class ImmutableExample {

	public static void main(String[] args) {
		
		// List 불변 컬렉션 생성
		List<String> unmodList = List.of("A", "B", "C");
		
		// Set 불변 컬렉션 생성
		Set<String> unmodSet = Set.of("A", "B","C");
		
		//Map 불변 컬렉션 생성
		Map<Integer, String> unmodMap = Map.of(1, "A", 2, "B", 3, "C");
		
		
		//List 컬렉션에서 copyOf()로 불변 컬렉션으로 복사
		List<String> myList = new ArrayList<>();
		myList.add("1");
		myList.add("1");
		myList.add("1");
		
		List<String> immutableList = List.copyOf(myList);
		
		//수정 불가
		//immutableList.add("2");
		
		
		//Set 컬렉션에서 copyOf()로 불변 컬렉션으로 복사
		Set<String> mySet = new HashSet<>();
		mySet.add("1");
		mySet.add("2");
		mySet.add("3");
		
		Set<String> immutableSet = Set.copyOf(mySet);
		
		//수정불가
		//immutableSet.remove("3");
		
		
		
		//Map 컬렉션에서 copyOf()로 불변 컬렉션으로 복사
		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "A");
		myMap.put(2, "B");
		myMap.put(3, "B");
		
		Map<Integer, String> immutableMap = Map.copyOf(myMap);
		
		//수정불가
		//immutableMap.put(4, "A");
		//immutableMap.remove(2);
		
		
		
		//배열을 immutable 컬렉션 리스트로 만들기
		int[] arr = {1,2,3,4};
		
		Integer[] convArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		List<Integer> immutableArrayList = Arrays.asList(convArr);
		
	}

}
