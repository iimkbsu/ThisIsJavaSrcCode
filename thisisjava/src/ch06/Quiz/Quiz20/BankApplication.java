package ch06.Quiz.Quiz20;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner myScan = new Scanner(System.in);
	static int count = 0;
	
	
	public static void main(String[] args) {
		boolean on = true;
		String select = "0";
		
		while(on) {
		System.out.println("-----------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-----------------------------------------");
		System.out.print("선택 > ");
		select = myScan.nextLine();
		System.out.println("----------");
		
			if(select.equals("1")) {
				createAccount();
			}else if(select.equals("2")) {
				accountList();
			}else if(select.equals("3")) {
				deposite();
			}else if(select.equals("4")){
				withdraw();
			}else if(select.equals("5")){
				on = false;
				System.out.println("프로그램 종료");
			}
			
		}	
		
	}


	//출금하기
	private static void withdraw() {
		Account account = null;
		System.out.print("계좌번호 : ");
		String check = myScan.nextLine();
		for(int i = 0; i <accountArray.length; i++) {
			if(accountArray[i] != null) {
				String search = accountArray[i].getNum();
				if(search.equals(check)) {
					account = accountArray[i];
					System.out.print("출금액 : ");
					String bal = myScan.nextLine();
					int ball = Integer.parseInt(bal);
					if(account.getBalance() >= ball) {
						account.setBalance(account.getBalance() - ball);
						System.out.println("출금되었습니다");
						break;
					}else {
						System.out.println("출금 실패하였습니다");
						break;
					}
					
				}
			}
			
		}
		
	}

	//입금하기
	private static void deposite() {
		Account account = null;
		System.out.print("계좌번호 : ");
		String check = myScan.nextLine();
		for(int i = 0; i <accountArray.length; i++) {
			if(accountArray[i] != null) {
				String search = accountArray[i].getNum();
				if(search.equals(check)) {
					account = accountArray[i];
					System.out.print("예금액 : ");
					String bal = myScan.nextLine();
					int ball = Integer.parseInt(bal);
					account.setBalance(account.getBalance() + ball);
					System.out.println("예금되었습니다");
					break;
				}
				
			}else {
				System.out.println("예급에 실패했습니다");
				break;
			}
		}
			
	}
		


	
	//계좌목록
	private static void accountList() {
		System.out.println("계좌목록");
		System.out.println("----------");
		
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getNum() + "\t");
				System.out.print(account.getName() + "\t");
				System.out.println(account.getBalance());
			}else {
				break;
			}
			
		}
		
	}

	
	//계좌생성
	private static void createAccount() {
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		String number = myScan.nextLine(); //next()
		//중복계좌생성 방지
		for(int i = 0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getNum().equals(number)) {
					System.out.println("이미 존재하는 계좌번호 입니다");
					return;
				}	
			}
		}
		
		System.out.print("계좌주 : ");
		String name = myScan.nextLine(); //next()
		
		System.out.print("초기입금액 : ");
		String money = myScan.nextLine(); //nextInt()
		int balance = Integer.parseInt(money);
		
		Account myAccount = new Account(number, name, balance);
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[count] = myAccount;
				count++;
				break;
			}
		}
		System.out.println("결과 : 계좌가 생성되었습니다");	
	}
}
