package ch17.sec13;

import java.util.Random;

import java.util.List;
import java.util.ArrayList;

import java.util.stream.Stream;

import java.util.stream.Collectors;

public class ParallelExample {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		//1억개 점수객체를 갖는 리스트
		List<Integer> scores = new ArrayList<>();
		for(int i=0; i<100000000; i++) {
			scores.add(rd.nextInt(101));
		}
		
		double avg = 0.0;
		long startTime = 0;
		long endTime = 0;
		long time = 0;
		
		
		//일반 스트림으로 처리
		Stream<Integer> myStream = scores.stream();
		startTime = System.nanoTime();
		avg = myStream.mapToInt(i -> i.intValue()).average().getAsDouble();
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("avg : " + avg + ", 일반 스트림 처리 시간 : " + time/(1000*1000) + "밀리초");
		
		System.out.println();

		
		//병렬 스트림으로 처리
		Stream<Integer> myStream1 = scores.parallelStream();
		startTime = System.nanoTime();
		avg = myStream1.mapToInt(i -> i.intValue()).average().getAsDouble();
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("avg : " + avg + ", 병렬 스트림 처리 시간 : " + time/(1000*1000) + "밀리초");
		
		System.out.println();
		
		
		
		
		Long count = scores.stream().count();
		System.out.println("총 점수 개수 : " + count);
		
		System.out.println();
		
		
		Stream<Integer> myStream2 = scores.stream();
		Long hundcount = myStream2.parallel().mapToInt(sc -> sc.intValue()).filter(sc -> sc == 100).count();
		System.out.printf("100점 개수 : " + hundcount + "\n100점 분포율 : %.5f%%", (double)(hundcount*100)/count);
		
		
		
	}

}
