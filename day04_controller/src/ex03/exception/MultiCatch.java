/* package ex03.exception;

import java.util.InputMismatchException;
import java.util.MissingResourceException;
import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		// Exception(예외처리)
		
		System.out.print("x, y = ");
		int x, y, result = 0;

		try {
			
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y;  // 문제 발생 소지가 있는 코드		
			
			System.out.println(result);
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (InputMismatchException e) { //타입이 안맞는다..
			System.out.println("InputMismatchException");
		} catch (Exception e) {// 모든 예외처리
			System.out.println("Exception"); // 최상위 예외는 제일 밑으로..!
		} //try end
		
	}

} */