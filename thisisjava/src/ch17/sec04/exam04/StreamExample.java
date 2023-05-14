package ch17.sec04.exam04;

//new Input Output 패키지  (기존 io보다 최신이고 더 많으 기능 지원)

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.stream.Stream;



public class StreamExample {

	public static void main(String[] args) throws Exception {
		
		//data.txt 파일의 경로(URL)를 URI로 바꿔 경로를 객체로 얻기
		Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
		
		//경로객체에 있는 파일을 한 줄씩 기본 유니코드로 읽어와 스트림으로 받기
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		
		//스트림에서 각 행 불러와 람다식으로 출력
		stream.forEach(line -> System.out.println(line));
		stream.close();
		
		
		
		
		
		

	}

}
