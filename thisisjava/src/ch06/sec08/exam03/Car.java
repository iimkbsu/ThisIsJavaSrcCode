package ch06.sec08.exam03;




public class Car {
	
	int gas;
	
	
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("연료가 없습니다");
			return false;
		}else {
			System.out.println("연료가 있습니다");
			return true;
		}
			
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("운행중 (연료잔량 : "+gas+")");
				gas--;
				try {
				Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println("정지 (연료잔량 : "+gas+")");
				//return은 메소드를 종료하고 값을 리턴함.
				//없을 경우 메소드만 종료
				return;
			}
			
		}
	}

}
