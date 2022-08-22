package ex03.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
   public static void main(String[] args) throws MalformedURLException, IOException {
      URL google = new URL("https://www.sw.or.kr");   //예외발생
      
      // System.in : 표준입력(키보드로부터)
      // 웹 상에서 읽을 때 통로를 연결해준다는 개념
      BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream()));
      
      String inputLine;
      while( (inputLine = br.readLine()) != null) {
         System.out.println(inputLine);
      }
      
      br.close();
   }
}