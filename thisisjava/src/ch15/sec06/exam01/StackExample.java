                                                                                                                                                                                                                                                                                                                                                                                                                                                                        package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
	
	public static void checkStackSize(Stack<Integer> coinStack) {
		System.out.println("현재 스택 객체 개수 : "+coinStack.size());
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		
		Stack<Integer> coinStack = new Stack<>();
		
		int size = 0;
		
		coinStack.add(1);
		coinStack.add(10);
		coinStack.add(5);
		coinStack.add(10);
		
		coinStack.push(10);
		coinStack.push(100);
		coinStack.push(500);
		coinStack.push(500);
		
		
		
		
		//Stack은 idx가 1부터 시작
		//Top에 가장 가까운 객체의 idx 리턴해줌
		System.out.println("10원이 들아긴 위치 : "+coinStack.search(10));
		
		checkStackSize(coinStack);
		
		int top = coinStack.pop();
		System.out.println("pop() 메소드 : " + top);
		
		checkStackSize(coinStack);
		
		int peek = coinStack.peek();
		System.out.println("peek() 메소드 : " + peek);
		
		checkStackSize(coinStack);
		
		
		coinStack.remove(2);
		checkStackSize(coinStack);
		
		for(int coins : coinStack) {
			System.out.print(coins + " ");
		}
		System.out.println();
		checkStackSize(coinStack);
		
		
		while(!coinStack.empty()) {
			System.out.print(coinStack.pop() + " ");
		}
		System.out.println();
		checkStackSize(coinStack);
		
		
		
		

	}

}
