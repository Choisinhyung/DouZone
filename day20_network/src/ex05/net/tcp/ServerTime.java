package ex05.net.tcp;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTime {


	public static void main(String[] args) {
		
		int port = 7000;
		
		try {
			System.out.println("서버 시작!");
			ServerSocket ss = new ServerSocket(port); // socket1
			
			while(true) {
				Socket s = ss.accept(); // socket2
				
				OutputStream os = s.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject(new Date());
				oos.flush();
				s.close();
				
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		

	}

}
