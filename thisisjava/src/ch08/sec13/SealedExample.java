package ch08.sec13;

public class SealedExample {

	public static void main(String[] args) {
		
		ImplClass implclass = new ImplClass();
		
		InterfaceA ia = implclass;
		ia.methodA();
		
		InterfaceB ib = implclass;
		ib.methodA();
		ib.methodB();
		
		
		InterfaceC ic = implclass;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
