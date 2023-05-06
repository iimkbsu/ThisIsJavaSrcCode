package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	public static void checkQSize(Queue myQueue) {

		System.out.println("현재 큐 사이즈 : " + myQueue.size());
		System.out.println();
	}

	
	
	public static void main(String[] args) {
		
		Queue<Message> myQueue = new LinkedList<>();
		
		
		myQueue.offer(new Message("sendMail", "홍길동"));
		myQueue.offer(new Message("sendPic", "신용권"));
		myQueue.offer(new Message("sendMoney", "김은행"));
		
		myQueue.add(new Message("sendKakaoTalk", "김자바"));
		myQueue.add(new Message("sendGift", "김스프링"));
		myQueue.add(new Message("sendbomb", "김친구"));
		
		

		
		checkQSize(myQueue);
		
		Message tmpM = myQueue.peek();
		System.out.println(tmpM.command +" to "+ tmpM.to);
		
		tmpM = myQueue.element();
		System.out.println(tmpM.command +" to "+ tmpM.to);
		
		checkQSize(myQueue);

		System.out.println("remove() poll() 한 번씩");
		myQueue.remove();
		myQueue.poll();
		
		checkQSize(myQueue);

		
		
		
		while(!myQueue.isEmpty()) {
			Message tmp = myQueue.poll();
			switch(tmp.command) {
				case "sendMail" :
					System.out.println(tmp.to + "에게 메일 보내기");
					break;
				case "sendPic" :
					System.out.println(tmp.to + "에게 사진 보내기");
					break;
				case "sendMoney" :
					System.out.println(tmp.to + "에게 돈 보내기");
					break;
				case "sendKakaoTalk" :
					System.out.println(tmp.to + "에게 카톡 보내기");
					break;
				case "sendGift" :
					System.out.println(tmp.to + "에게 선물 보내기");
					break;
				case "sendbomb" :
					System.out.println(tmp.to + "에게 폭탄 보내기");
					break;
			}
		}
		
		checkQSize(myQueue);
	}

}
