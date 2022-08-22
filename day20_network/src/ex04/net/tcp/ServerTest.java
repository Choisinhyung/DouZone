package ex04.net.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest { // socket 2개 필요

	public static void main(String[] args) {
		
		ServerSocket ss = null;
		Socket s = null;
		
		System.out.println("Server Start!!");
		
		try {
			ss = new ServerSocket(9000); // 0 ~ 1024 포트넘버는 예약되어 있음
			s = ss.accept(); // client socket, 응답 대기
			// i  /  o 객체 생성 => io는 항상 단방향
			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream();
			
			// 읽기
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			
			// 쓰기
			String message = "안녕 client!";
			os.write(message.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
				ss.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
