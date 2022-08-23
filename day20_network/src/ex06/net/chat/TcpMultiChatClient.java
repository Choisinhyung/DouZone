package ex06.net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpMultiChatClient { // outer class

	public static void main(String[] args) {
		
		if(args.length != 1)  {// 1이 아니면 아무것도 안뜬다는 말
			System.out.println("USAGE : java TcpMultiChatClient nicName ? ");
			System.exit(0);
		} // end if
		
		try {
			// ip주소
			String ip = "192.168.110.4";
			// client 소켓 생성 : 서버쪽과 일치해야 함
			Socket s = new Socket(ip, 7777);
			System.out.println("서버와 연결이 되었습니다. ");
			//스레드 객체 생성 (부모로 가능)
			//대화 주고 받기
			Thread sender = new Thread(new ClientSender(s, args[0]));
			Thread receiver = new Thread(new ClientRecievier(s));
			
			//run메소드 유도
			sender.start();
			receiver.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	} // end main
	
	static class ClientSender extends Thread { // inner class
		
		Socket s;
		DataOutputStream dos;
		String name;
		
		public ClientSender(Socket s, String name) { // 생성자 함수
			this.s = s;
			
			try {
				dos = new DataOutputStream(s.getOutputStream()); // 네트워크 통해서 쓰기
				this.name = name;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 

		@Override
		public void run() { //스레드 상속받았으니까 run 오버라이드~
			Scanner sc = new Scanner(System.in); // 키보드로부터 입력 받기
			
			try {
				if(dos != null) {
					dos.writeUTF(name);
				} // end if
				
				while(dos != null ) {
					dos.writeUTF("[" + name + "] " + sc.nextLine());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	} // end CliendSender
	
	static class ClientRecievier extends Thread { // inner class
		
		// 소켓 객체 선언
		Socket s;
		DataInputStream dis;
		
		public ClientRecievier(Socket s) { // 생성자 함수
			this.s = s;
			
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() { //스레드 상속받았으니까 run 오버라이드~
			while( dis != null ) {
				
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} // end run
		
	} // end ClientRecievier

}
