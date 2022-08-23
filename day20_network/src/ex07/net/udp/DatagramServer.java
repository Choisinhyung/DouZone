package ex07.net.udp;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServer { // UDP

	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataOutputStream dos = null;
		
		int port = 5000;
		String str;
		File file = null;
		
		try {
			
			System.out.println("@@@ UDP File Server@@@");
			//포트번호 생성
			
			ds = new DatagramSocket(port);
			
			while(true ) {
				dp = new DatagramPacket(new byte[65536], 65536);
				ds.receive(dp);
				
				//패킷을 이용한 데이터 크기만큼 0부터 시작해서 공백을 제거한 길이만큼의 문자를 넣겠다~
				str = new String(dp.getData(), 0, dp.getLength()).trim();
				
				if(str.equalsIgnoreCase("start")) {
					System.out.println("전송 되고 있음!");
					file = new File("신형.txt");
					
					//쓰기 그릇을 이용 :  버퍼 파일 객체 생성
					dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
					
				} else if (str.equalsIgnoreCase("end")) {
					System.out.println("end");
					break;
				} else {
					System.out.println(str);
					dos.write(dp.getData(), 0, dp.getLength());
				} //end if
			} // end while
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			} 
		} // end try
	}

}
