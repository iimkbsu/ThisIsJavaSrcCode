package ch08.sec13;

//sealed 인터페이스를 상속받으면 sealed이거나 non-sealed로 해야 함 (class는 final도 있음)
public non-sealed interface InterfaceB extends InterfaceA {

	void methodB();
}
