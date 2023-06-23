package ch19.chatPractice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

public class ClientSocket {
	
	ChatServer cs;
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	String clientIp;
	String chatName;
	
	public ClientSocket(ChatServer cs, Socket s) {
		try {
			this.cs = cs;
			this.s = s;
			this.dis = new DataInputStream(s.getInputStream());
			this.dos = new DataOutputStream(s.getOutputStream());
			
			InetSocketAddress isa = (InetSocketAddress)s.getRemoteSocketAddress();
			
			this.clientIp = isa.getHostString();
			receive();
		}catch(IOException e) {
			
		}
	}
	
	public void receive() {
		cs.threadPool.execute(()->{
			try {
				while(true) {
					String receivedJson = dis.readUTF();
					JSONObject jo = new JSONObject(receivedJson);
					String command = jo.getString("command");
					
					switch(command) {
					case "incoming" :
						this.chatName = jo.getString("data");
						cs.sendToAll(this, "들어오셨습니다");
						cs.addClientSocket(this);
						break;
					case "message" :
						String message = jo.getString("data");
						cs.sendToAll(this, message);
						break;
					}
				}
			}catch(IOException e) {
				cs.sendToAll(this, "나가셨습니다");
				cs.removeClientSocket(this);
			}
			
		});
	}
	
	public void send(String json) {
		try {
			dos.writeUTF(json);
			dos.flush();
		} catch (IOException e) {
			
		}
		
	}
	
	public void closeClientSocket() {
		try {
			s.close();
		} catch (IOException e) {
			
		}
	}

}
