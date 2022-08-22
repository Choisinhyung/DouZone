package ex02.net;

import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByName2 {
   public static void main(String[] args) throws UnknownHostException{ // 예외 위임
	  
	   InetAddress address = InetAddress.getLocalHost(); // 예외 발생
	   System.out.println("로컬 호스트 이름 : " + address.getHostName());
	   System.out.println("로컬 호스트 IP address : " + address.getHostAddress());
	   System.out.println("-----------------------------------");
	   
	   address = InetAddress.getByName("www.sw.or.kr");
	   System.out.println("로컬 호스트 이름 : " + address.getHostName());
	   System.out.println("로컬 호스트 IP address : " + address.getHostAddress());
	   System.out.println("-----------------------------------");
	  	   
	   
	   byte[] addr = new byte[4]; // 192.168.110.4
	   addr[0] = (byte)192;
	   addr[1] = (byte)168;
	   addr[2] = (byte)110;
	   addr[3] = (byte)4;
	   
	   address = InetAddress.getByAddress(addr);
	   System.out.println("로컬 호스트 이름 : " + address.getHostName());
	   System.out.println("로컬 호스트 이름 : " + address.getCanonicalHostName());
	   System.out.println("로컬 호스트 IP address : " + address.getHostAddress());
	   System.out.println("-----------------------------------");
	   
//	   InetAddress[] arr = InetAddress.getAllByName("www.google.com");
	   InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
	   for(InetAddress item : arr) {
		   System.out.println("로컬 호스트 이름 : " + item.getHostName());
		   System.out.println("로컬 호스트 IP address : " + item.getHostAddress());
		   System.out.println("-----------------------------------");
		   
	   }
	   
	   
   }
}