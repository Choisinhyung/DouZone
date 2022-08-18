package ex04.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx {

   public static void main(String[] args) throws IOException {
         // 예외 위임 - JVM
            
//      InputStream is = System.in;
//      Reader reader = new InputStreamReader(is);
//      BufferedReader br = new BufferedReader(reader);

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("charactor input = ");
      String str = br.readLine();
      
      System.out.println(str);
   }

}