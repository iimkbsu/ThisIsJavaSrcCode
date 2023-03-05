package ch08.sec08;

//다중 인터페이스 구현
public class SmartTelevision implements RemoteControl, Searchable {

	String url;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	
	@Override
	public void search(String url) {
		this.url = url;
		System.out.println(this.url + "을 검색합니다");
		urlReturn();
	}
	
	private void urlReturn() {
		System.out.println("www."+this.url+".com");
	}
}
