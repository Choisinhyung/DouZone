package ex06.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UriCopy {
   public static void main(String[] args) throws IOException {
	   //구글이미지를 저장해보자~
      URL url = new URL("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
      
      InputStream is = url.openStream();
      OutputStream os = new FileOutputStream("google.jpg");
      byte[] buffer = new byte[1024*8];
      
      long start = System.currentTimeMillis();
      
      while(true)
      {
         int inputData = is.read();
         if(inputData ==-1)break;
         os.write(inputData);
      }
      
      long end = System.currentTimeMillis();
      System.out.println(end-start); 
      is.close();
      os.close();
      System.out.println("성공");
      
   }
}