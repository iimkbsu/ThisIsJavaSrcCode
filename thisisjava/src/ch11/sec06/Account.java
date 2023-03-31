package ch11.sec06;

public class Account {
	
	//잔액
	private long balance;
	
	///////////////
	
	public Account() {
		
	}
	
	///////////////
	
	public long getBalance() {
		return balance;
	}
	
	//예금
	public void deposit(int money) {
		balance += money;
	}
	
	//출금 예외발생 시키는 코드 (throw new 사용자예외처리클래스)
	public void withdraw(int money) throws InsufficientException{
		if(balance < money) {
			throw new InsufficientException("잔고부족 : " + (money-balance) + " 모자람");
		}else {
			balance -= money;
		}
		
	}

}
