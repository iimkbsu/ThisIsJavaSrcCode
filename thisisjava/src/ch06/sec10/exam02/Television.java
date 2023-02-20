package ch06.sec10.exam02;

public class Television {
	
	String comp = "삼성오디세이";
	String mod = "C32G54T";
	String inf;
	
	public String samsung() {
		System.out.println("3");
		inf = comp +" - "+ mod + " - VA패널";
		return inf;
	}
	
	String LG(String inf) {
		this.comp = "LG울트라기어";
		this.mod = "32GP750";
		this.inf = inf;
		
		return comp +" - "+ mod + " - " + inf;
	}
	
	//정적필드, 보편적으로 값을 바로 줌
	static String company = "LG울트라기어";
	static String model = "32GP750";
	static String info;
	
	//정적 블록, 정적필드는 this(객체) 안 씀
	static {
		System.out.println("1");
		info = company +" - "+ model + " - IPS패널";
	}
	
	static {
		System.out.println("2");
		
	}
}
