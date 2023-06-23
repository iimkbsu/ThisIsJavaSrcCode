package ch19.chatPractice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {
	
	ServerSocket ss;
	ExecutorService threadPool = Executors.newFixedThreadPool(100);
	Map<String, ClientSocket> chatRoom = new Hashtable<>();
	
	public void startServer() throws IOException {
		
		ss = new ServerSocket(50001);
		System.out.println("[채팅서버] 열림");
		
		Thread serverThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						Socket s = ss.accept();
						ClientSocket cs = new ClientSocket(ChatServer.this, s);
					}
				}catch(IOException e) {
					
				}
				
			}
		});
		serverThread.start();
		
		
	}
	
	public void addClientSocket(ClientSocket cs) {
		String serverKey = cs.chatName + "@" + cs.clientIp;
		chatRoom.put(serverKey, cs);
		System.out.println("입장 : " + serverKey);
		System.out.println("현재 채팅방 참여자 수 : " + chatRoom.size() + "\n");
	}
	
	public void removeClientSocket(ClientSocket cs) {
		String serverKey = cs.chatName + "@" + cs.clientIp;
		chatRoom.remove(serverKey);
		System.out.println("나감 : " + serverKey);
		System.out.println("현재 채팅방 참여자 수 : " + chatRoom.size() + "\n");
	}
	
	public void sendToAll(ClientSocket sender, String message) {
		JSONObject root = new JSONObject();
		root.put("clientIp", sender.clientIp);
		root.put("chatName", sender.chatName);
		root.put("message", message);
		String json = root.toString();
		
		//values() : Map에 저장된 모든 엔트리의 값만 Collection<타입>에 담아서 리턴함
		Collection<ClientSocket> cs = chatRoom.values();
		for(ClientSocket clientSocket : cs) {
			if(clientSocket == sender) {
				continue;
			}
			clientSocket.send(json);
		}
	}
	
	public void stopServer() {
		
		try {
			ss.close();
			threadPool.shutdownNow();
			chatRoom.values().stream().forEach(cs -> cs.closeClientSocket());
			System.out.println("[채팅서버] 닫힘");
		}catch(Exception e) {
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ChatServer cs = new ChatServer();
		try {
			cs.startServer();

			System.out.println("----------------------------");
			System.out.println("[채팅서버]를 닫으려면 q/Q를 입력하세요");
			System.out.println("----------------------------");
			
			Scanner scanner = new Scanner(System.in);
			while(true) {
				String inputKey = scanner.nextLine();
				if(inputKey.toLowerCase().equals("q")) {
					break;
				}
			}
			scanner.close();
			
			cs.stopServer();
		} catch (IOException e) {
			System.out.println(e.getMessage() + "의 문제로 [체팅서버] 열리지 않음");
		}
		
		
	}

}
