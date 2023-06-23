package ch19.chatPractice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient {
	
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	String chatName;
	
	public void connect() throws IOException {
		s = new Socket("localHost", 50001);
		dis = new DataInputStream(s.getInputStream());
		dos = new DataOutputStream(s.getOutputStream());
		System.out.println("[클라이언트] 채팅서버에 연결됨");
	}
	
	public void receive() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						String json = dis.readUTF();
						JSONObject jo = new JSONObject(json);
						String clientIp = jo.getString("clientIp");
						String chatName = jo.getString("chatName");
						String message = jo.getString("message");
						System.out.println("<" + chatName + "@" + clientIp + ">" + message);
					}
				}catch(IOException e){
					System.out.println("[클라이언트] 채팅서버와 연결 끊김");
					System.exit(0);
				}
			}
		});
		
		thread.start();
	}
	
	public void send(String json) throws IOException {
		
		dos.writeUTF(json);
		dos.flush();
	}
	
	public void unconnect() throws IOException {
		s.close();
	}
	

	public static void main(String[] args) {
		try {
			ChatClient cc = new ChatClient();
			cc.connect();
			Scanner scanner = new Scanner(System.in);
			System.out.print("닉네임 입력 : ");
			cc.chatName = scanner.nextLine();
			
			JSONObject jo = new JSONObject();
			jo.put("command", "incoming");
			jo.put("data", cc.chatName);
			String json = jo.toString();
			cc.send(json);
			
			cc.receive();
			
			System.out.println("-----------------------------");
			System.out.println("채팅 메시지를 입력하고 Enter로 보내기");
			System.out.println("채팅을 종료하려면 q/Q를 입력하고 Enter");
			System.out.println("-----------------------------");
			
			while(true) {
				String message = scanner.nextLine();
				if(message.toUpperCase().equals("Q")) {
					break;
				}else {
				jo = new JSONObject();
					jo.put("command", "message");
					jo.put("data", message);
					json = jo.toString();
					cc.send(json);
				}
			}
			scanner.close();
			cc.unconnect();
		}catch(IOException e) {
			System.out.println("[클라이언트] 채팅서버와 연결 안됨");
			
		}

	}

}
