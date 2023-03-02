package ch07.sec11;

//봉인된 부모클래스로부터 상속받기 위해선 final, non-sealed, sealed 자식클래스 이어야 함
//final 클래스는 다른 클래스에게 상속 불가능
//non-sealed 클래스는 다른 클래스 상속 가능
//sealed 클래스는 다른 클래스 상속 가능하고 permits 자식클래스 작성해줘야 함
public final class Employee extends Person{

	@Override
	public void work() {
		System.out.println("제품을 생산합니다");
	}
}
