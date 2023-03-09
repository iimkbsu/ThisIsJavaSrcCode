package ch08.sec13;

//봉인된 인터페이스 (무차별한 상속을 막기 위해)
public sealed interface InterfaceA permits InterfaceB {

	void methodA();
}
