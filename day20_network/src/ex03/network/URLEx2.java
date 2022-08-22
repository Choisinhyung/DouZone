package ex03.network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {
   public static void main(String[] args) throws MalformedURLException {
      URL url = new URL("https://www.google.co.kr/search?sxsrf=ALiCzsaIRYnlnwKGRC_iLgtYlyV2f2E00w:1661152448485&q=%EB%8D%94%EC%A1%B4&spell=1&sa=X&ved=2ahUKEwjp---M89n5AhXnqFYBHQsPDFAQBSgAegQIAhA5&biw=958&bih=923&dpr=1");   //예외발생
      
      // URL이 갖고 있는 함수들 사용
      System.out.println("프로토콜 : " + url.getProtocol());
      System.out.println("호스트와 포트 : " + url.getAuthority());
      System.out.println("호스트 : " + url.getHost());
      System.out.println("포트 : " + url.getPort());
      System.out.println("경로 : " + url.getPath());
      System.out.println("질의 : " + url.getQuery());
      System.out.println("파일명 : " + url.getFile());
      System.out.println("참조 : " + url.getRef());
      
   }
}