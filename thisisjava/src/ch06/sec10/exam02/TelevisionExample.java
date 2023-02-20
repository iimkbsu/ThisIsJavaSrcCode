package ch06.sec10.exam02;

public class TelevisionExample {

	public static void main(String[] args) {
		
		
		//JVM은 자동으로 Television 클래스를 메모리에 저장하여 static 자동 실행
		System.out.println(Television.info);
		System.out.println();
		

		Television myTv = new Television();
		System.out.println(myTv.samsung());

		System.out.println();
		System.out.println(myTv.LG("IPS패널"));
	}

}
