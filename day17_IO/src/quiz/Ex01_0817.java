package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01_0817 {

	public static void main(String[] args) throws IOException {
		
		
		  try {
			

	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      // 연산자 입력받기
	      
	      System.out.println("연산자를 입력해주세요 (+, -, x, ÷)");
	      String input = br.readLine();
	      System.out.print("연산을 할 숫자 두개를 입력해주세요 : ");
	      int num1 = Integer.parseInt(br.readLine());
	      int num2 = Integer.parseInt(br.readLine());
	      
	      switch(input) {
	      case "+" : 
	    	  System.out.println("결과는 " + (num1 + num2) + " 입니다.");
	      	  break;
	      case "-" : 
	    	  System.out.println("결과는 " + (num1 - num2) + " 입니다.");
	      	  break;
	      case "x" : 
	    	  System.out.println("결과는 " + (num1 * num2) + " 입니다.");
	      	  break;
	      case "÷" : 
	    	  System.out.println("결과는 " + (num1 / num2) + " 입니다.");
	      	  break;
	      }
	      
			} catch (Exception e) {
				
				
			}
		  
	}

}
