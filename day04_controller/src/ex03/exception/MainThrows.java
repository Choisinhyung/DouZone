package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainThrows {

	public static void main(String[] args) throws Exception { // 예외 위임하기(던지다)
		
		System.out.print("x, y = ");
		int x, y, result = 0;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		result = x / y; // 예외발생
		
		System.out.println(x + "/" + y + "=" +  result);

	}

}
