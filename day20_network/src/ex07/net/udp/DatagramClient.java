package ex07.net.udp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramClient {

	public static void main(String[] args) {
		
		// server측이 만든것을 읽어야하니까 read객체가 있어야함
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		
		String str;
		int port = 5000;
		byte[] buffer = null;
		
		try {
			System.out.println("@@@ UDP File Client@@@");
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("전송 대상 (Server IP) = ");
			
			//문자열로 받아서 ip주소로 변환해야함
			String ipAddress = br.readLine(); // 192.168.110.33
			System.out.println("전송 파일 (파일명.확장자) = ");
			String fileName = br.readLine();
			
			//파일 객체 생성
			File file = new File(fileName);
			
			if(!file.exists() ) {
				System.out.println("파일이 존재하지 않습니다.");
				System.exit(-1);
			}
			
			str = "start";
			//버퍼에 담자~
			buffer = str.getBytes();
			//객체 생성
			ds = new DatagramSocket();
			// 문자열 ip주소를 실제 ip주소로~
			InetAddress iaddress = InetAddress.getByName(ipAddress); 
			dp = new DatagramPacket(buffer, buffer.length, iaddress, port);
			ds.send(dp); // 송신
			
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			
			buffer = new byte[65536];
			
			while(true) {
				int count = dis.read(buffer, 0, buffer.length);
				
				if(count == -1) break;
				
				dp = new DatagramPacket(buffer, count, iaddress, port);
				ds.send(dp);
			} // end while 
			
			str = "end";
			buffer = str.getBytes();
			
			dp = new DatagramPacket(buffer, buffer.length, iaddress, port);
			ds.send(dp);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				dis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
