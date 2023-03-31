package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		
		Account myaccount = new Account();
		
		myaccount.deposit(10000);
		System.out.println("잔고 : " + myaccount.getBalance() + "원");
		
		myaccount.deposit(10000);
		System.out.println("잔고 : " + myaccount.getBalance() + "원");
		
		
		try {
			myaccount.withdraw(30000);
		}catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);		
		}
		System.out.println("잔고 : " + myaccount.getBalance() + "원");
		
	
	}

}
