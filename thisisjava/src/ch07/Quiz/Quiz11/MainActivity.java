package ch07.Quiz.Quiz11;

public class MainActivity extends Activity{
	
	public MainActivity() {
		
	}

	@Override
	public void onCreate() {
		super.onCreate();
		System.out.println("추가적인 실행 내용");
	}
	
	
	
	//실행 메소드
	public static void main(String[] args) {
		MainActivity myMain = new MainActivity();
		
		myMain.onCreate();
	}
}




