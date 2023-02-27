package ch06.Quiz.Quiz20;

public class Account {
	
	private String accountNum;
	private String name;
	private int balance;
	
	
	void setNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	String getNum() {
		return accountNum;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setBalance(int balance) {
		this.balance = balance;
	}
	
	int getBalance() {
		return balance;
	}

	
	
	
	public Account(String accountNum, String name, int balance) {
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
	}
}
