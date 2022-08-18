package ex04.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx02 {

	public static void main(String[] args) throws IOException { // 예외처리 위임
		
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      
	       //String str1 = br.readLine();
	       //String str2 = br.readLine();
	      
	      System.out.print("input : ");
	      int su1 = Integer.parseInt(br.readLine());
	      
	      System.out.print("input : ");
	      int su2 = Integer.parseInt(br.readLine());
	      
	      System.out.println(su1 + ", " + su2);
	      System.out.println(su1 + su2); // 연산처리
	     

	}

}
