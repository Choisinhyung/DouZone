package ex05.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;

public class ClientChat {

	public static void main(String[] args) throws IOException {
		
		int port = 8000;
		String ip, str;
		
		PrintStream ps = new PrintStream(System.out);
		//키보드로부터 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		ps.print("접속할 서버 ip ==> "); 
		ip = br.readLine();

		ps.print("전송할 메세지 ==> "); 
		str = br.readLine();
	
		byte[] buffer = str.getBytes("UTF-8"); // or euc-kr
		String message = new String(buffer, "UTF-8");
		
		Socket client = new Socket(ip, port); // server ip & port number socket create
		OutputStream os = client.getOutputStream(); // 네트워크를 ip통해서 쓰기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		bw.write(message, 0, message.length());
		bw.flush();
		
		bw.close();
		client.close();
		ps.println(ip + "에 메시지 전송 성공");
		ps.close();
		
	}

}
