package ch17.sec02;

import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		
		myList.add("홍길동");
		myList.add("신용권");
		myList.add("김자바");
		myList.add("람다식");
		myList.add("박병렬");
		myList.add("스프링");
		myList.add("JSP");
		
		Stream<String> myStream = myList.parallelStream();
		
		myStream.forEach((name)->{
			System.out.println(name + " : " + Thread.currentThread().getName());
		});
		

	}

}
