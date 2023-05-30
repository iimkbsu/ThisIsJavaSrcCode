package ch17;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;

import java.util.Map.Entry;


import java.util.Map;
import java.util.HashMap;

import java.util.stream.Collectors;

import java.util.List;
import java.util.ArrayList;

import java.util.Iterator;

import java.util.Random;



public class StreamPractice {
	
	
	public static class Student {
		
		private String name;
		private int score;
		
		public Student(String name, int score) {
			this.name = name;
			this.score = score;
		}
		
		public String getName() {
			return name;
		}
		
		public int getScore() {
			return score;
		}
		
	}

	
	
	
	
	public static void main(String[] args) {
		
		int[] intArr = new int[] {1,2,3,4,5,5,5};
		
		long[] longArr = {1,2,3,4,5,5,5};
		
		String[] strArr = {null, "a", "abc", "abcd"};
		
		
		//스트림 생성, 스트림 갖고오기
		IntStream intStream1 = Arrays.stream(intArr);
		IntStream intStream2 = IntStream.of(intArr);
		IntStream intStream3 = IntStream.of(intArr);
		
		LongStream longStream1 = Arrays.stream(longArr);
		LongStream longStream2 = LongStream.of(longArr);
		LongStream longStream3 = Arrays.stream(longArr);
		
		Stream<String> strStream1 = Arrays.stream(strArr);
		Stream<String> strStream2 = Stream.of(strArr);
		Stream<String> strStream3 = Arrays.asList(strArr).stream();
		
		IntStream intStreamRange = IntStream.range(1, 100);
		IntStream intStreamRangeClosed = IntStream.rangeClosed(1, 100);
		
		LongStream longStreamRange = LongStream.range(1, 100);
		LongStream longStreamRangeClosed = LongStream.range(1, 100);
		
		
		
		Random myRandom = new Random();
		
		IntStream rdIntStream = myRandom.ints(2, 10, 20);
		LongStream rdLongStream = myRandom.longs(20);
		DoubleStream rdDoubleStream = myRandom.doubles(20);
		
		rdIntStream.forEach(rdnum -> System.out.println(rdnum));
		
		
		
		//스트림 종류 바꾸기(맵핑)
		DoubleStream doubleStream1 = intStream1.mapToDouble(num -> (double)num);
		DoubleStream doubleStream2 = longStream1.mapToDouble(num -> (double)num);
		
		Stream<Integer> integerStream1 = intStream2.mapToObj(num -> num);
		Stream<Integer> integerStream2 = intStream3.boxed();
		
		Stream<Long> LongStream1 = longStream2.mapToObj(num -> num);
		Stream<Long> LongStream2 = longStream3.boxed();
		
		
		IntStream iss = Arrays.stream(intArr).distinct();
		DoubleStream dss = iss.asDoubleStream();
		
		
		
		//중간처리
		IntStream.of(intArr).distinct().forEach(num -> System.out.print(num + " "));
		
		System.out.println();
		
		LongStream.of(longArr).distinct().filter(num ->{
			if(num % 2 == 0) {
				return true;
			}else return false;
		}).forEach(num -> System.out.print(num + " "));
		System.out.println();
		
		
		String str = "sss sss sss";

		List<String> list = Arrays.asList(str.split(" "));
		list.stream().forEach(stra -> System.out.println(stra));
		
		System.out.println();
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		for(String strr : list) {
			System.out.println(strr);
		}

		
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("김개똥", 32);
		myMap.put("김창렬", 99);
		myMap.put("김혜자", 40);
		
		boolean existKey = myMap.containsKey("김개똥");
		boolean existValue = myMap.containsValue(32);
		int score = myMap.get("김개똥");
		boolean mapEmpty = myMap.isEmpty();
		int mapSize = myMap.size();
		
		Collection<Integer> scoreCollection = myMap.values();
		
		Set<String> mySet = myMap.keySet();
		
		Set<Entry<String, Integer>> myEntrySet = myMap.entrySet();
		
		Set<Entry<String, Integer>> mygoSet = myEntrySet.stream().filter(entry -> {
			if(entry.getKey().equals("김개똥")) {
				return false;
			}else return true;
			}).collect(Collectors.toSet());
		
		
		System.out.println(myMap);
		System.out.println(existKey);
		System.out.println(existValue);
		System.out.println(score);
		System.out.println(mapEmpty);
		System.out.println(mapSize);
		System.out.println(scoreCollection);
		System.out.println(mySet);
		System.out.println(myEntrySet);
		System.out.println(mygoSet);
		
		
		int[] intArr1 = {2,5,3,4,1,5,5,6,7,9,2,1,1,5,3,4,4,2,7,8,8,1};
		
		List<Integer> myllist = Arrays.stream(intArr1).distinct().boxed().sorted(Comparator.reverseOrder()).toList();
		System.out.println(myllist);
		
		
		String test = "10, 20, 30, 40, 50";
		//위의 문자열을 숫자 스트림으로 변환
		
		List<String> strList = Arrays.asList(test);
		
		strList.stream().flatMapToInt(str1 ->{
			String[] strArr1 = str1.split(",");
			int[] intArr2 = new int[strArr1.length];
			for(int i=0; i<strArr1.length; i++) {
				intArr2[i] = Integer.parseInt(strArr1[i].trim());
			}
			return Arrays.stream(intArr2);
		}).forEach(num -> System.out.print(num + " "));
		
		System.out.println();
		
		List<Student> stdList = Arrays.asList(
				new Student("홍길동", 21),
				new Student("신용권", 12),
				new Student("유미선", 35)
				);
		
		stdList.stream().sorted((std1, std2) -> Integer.compare(std1.getScore(), std2.getScore()))
		.forEach(std -> System.out.print(std.getName() + " : " + std.getScore() + "   "));
		
		System.out.println();
		
		stdList.stream().sorted((std1, std2) -> Integer.compare(std2.getScore(), std1.getScore()))
		.forEach(std -> System.out.print(std.getName() + " : " + std.getScore() + "   "));


		System.out.println();
		
		double avg = stdList.stream().sorted((std1, std2) -> Integer.compare(std1.getScore(), std2.getScore())).peek(std -> System.out.print(std.getScore() + " "))
		.mapToInt(std -> std.getScore()).average().getAsDouble();
		System.out.printf("\n점수 평균 : %.2f", avg);
		
		
		
	}
	
	
}


