package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

import java.util.Iterator;

public class TreeSetExample {

	public static void main(String[] args) {
		
		//TreeSet 자동 오름차순 정렬
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		
		System.out.println("TreeSet 점수 표 (자동 오름차순 정렬)");
		for(Integer s : scores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		//TreeSet 검색 메소드
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("95점 바로 아래 점수 : " + scores.lower(95));
		System.out.println("95점 바로 위 점수 : " + scores.higher(95));
		System.out.println("95점이거나 바로 아래 점수 : " +scores.floor(95));
		System.out.println("95점이거나 바로 위 점수 : " + scores.ceiling(95));

		System.out.println("\n");
		
		
		System.out.println("TreeSet을 NavigableSet 인터페이스로 내림차순 하여 저장하기");
		//TreeSet의 오름차순을 NavigableSet 인터페이스로 내림차순 정렬하기
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for(Integer s : descendingScores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		System.out.println("TreeSet을 Iterator에 내림차순으로 정렬하여 저장하기");
		//TreeSet을 Iterator에 내림차순으로 정렬하여 저장하기
		Iterator<Integer> descendingIteratorScores = scores.descendingIterator();
		
		while(descendingIteratorScores.hasNext()) {
			int s = descendingIteratorScores.next();
			System.out.print(s + " ");
		}
		
		System.out.println("\n");
		
		
		System.out.println("TreeSet에서 80이상 객체만 NavigableSet에 저장하기");
		//80<= 범위 검색
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		
		for(Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		
		System.out.println("80이상 객체만 저장된 위의 NavigableSet에서 90미만 객체만 NavigableSet에 저장하기");
		//80이상 객체만 저장된 NavigableSet에서 90미만만 NavigableSet에 저장하기
		NavigableSet<Integer> rangeSet2 = rangeSet.headSet(90, false);
		for(Integer s : rangeSet2) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		
		System.out.println("TreeSet에서 80이상 90 미만 객체만 NavigableSet에 저장하기");
		//TreeSet에서 80이상 90 미만 객체만 NavigableSet에 저장하기
		NavigableSet<Integer> rangeSet3 = scores.subSet(80, true, 90, false);
		for(int i : rangeSet3) {
			System.out.print(i + " ");
		}
		
	
		
	}

}
