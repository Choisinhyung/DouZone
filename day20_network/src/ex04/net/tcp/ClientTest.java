package ex04.net.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest { // socket 1개 필요

	public static void main(String[] args) {
		
		Socket s = null;
		
		try {
			s = new Socket("192.168.110.34", 9000); // server ip & port number
		
			// i  /  o
			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream(); // write
			
			String str = "안녕 Server~~~ 나는 시녕이야~~~";
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

	}

}
