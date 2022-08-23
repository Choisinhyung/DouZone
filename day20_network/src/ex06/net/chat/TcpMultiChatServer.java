package ex06.net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpMultiChatServer { // outer class
	
	// 닉네임 메세지 같이 들어오게~ : map(key value)가 적당
	HashMap clients;
	
	public TcpMultiChatServer() { // 생성자 함수
		clients = new HashMap(); // HashMap 객체 생성
		Collections.synchronizedMap(clients); // 동기화

	}
	
	public void start() { // 사용자가 만든 유저 메소드
		ServerSocket ss = null; // server socket 1
		Socket s = null; // client socket 2
		
		try {
			// 객체 생성
			ss = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다. 채팅 시작!");
			
			while(true) {
				// 언제 어떻게 끝날지 모르니까~~
				// 소켓을 이용하자
				s = ss.accept(); // 응답대기 : 누구한테 말 걸어줘~
				System.out.println("[ " + s.getInetAddress() + " : " + s.getPort() + " ] 에서 접속하셨습니다.");
				ServerReceiver thread = new ServerReceiver(s); // user class
				
				// run메소드 유도하기, 스레드 작업이 이루어진다 
				thread.start(); // 위에있는 유저 메소드와 헷갈리지 말것, 실제 스레드가 가지고있는 메시지임 
			} // end while
		} catch (Exception e) { 
			e.printStackTrace(); // 문제생기면 너가 알아서해조
		} 
		
	} // end start()
	
	
	public void sendToAll(String msg) { // 메시지 보낼 함수
		// Iterator를 사용해서 해당하는 데이터를 꺼내오자
		Iterator it = clients.keySet().iterator(); // key(닉네임) 출력
		
		while(it.hasNext()) { // 요소가 있다면
			try {
				DataOutputStream dos = (DataOutputStream)clients.get(it.next()); // 해당 키 값으로 value값 출력
				System.out.println("dos.toString = " + dos.toString());
				dos.writeUTF(msg); // 메시지~~~~
			} catch (Exception e) {
				e.printStackTrace(); // 문제생기면 너가 알아서해조
			}
			
		}
		
	} // end sendToAll
	
	
	class ServerReceiver extends Thread {// inner class
		Socket s; // client socket
		DataInputStream dis; // readXXX(); : XXX에는 자료형이 들어감
		DataOutputStream dos; // writeXXX();

		public ServerReceiver(Socket s) { // 매개변수를 가지고있는 client, 생성자함수
			this.s = s;
			
			//io객체들은 문제 발생 소지가 있기에 예외처리 해주자
			try {
				dis = new DataInputStream(s.getInputStream()); // 네트워크 통해서 읽기
				dos = new DataOutputStream(s.getOutputStream()); // 네트워크 통해서 쓰기
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // end Constructer

		@Override
		public void run() { // 스레드 실행부(구현부)
			// 여기서 메시지를 주고 받자
			String name = "";
			
			try {
				name = dis.readUTF(); // 읽어오자
				sendToAll("#" + name + "님이 입장하셨습니다."); // sendToAll에 메시지를 보내자
				System.out.println(dos.toString().hashCode());
				clients.put(name,  dos); // HashMap 넣기
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + " 입니다.");

				while(dis != null) {
					// 읽어들인 글이 빈값이 아니면 메시지를 읽어서 보내라
					sendToAll(dis.readUTF());
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				sendToAll("#" + name + " 님이 퇴장하셨습니다.");
				clients.remove(name); // 접속자 수 제거하기
				System.out.println("[ " + s.getInetAddress() + " : " + s.getPort() + " ] 에서 접속을 종료하셨습니다.");
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + " 입니다.");
			}
			
		} // end run()
		
	} // end ServerReceiver

	public static void main(String[] args) {
		new TcpMultiChatServer().start();

	}

}
