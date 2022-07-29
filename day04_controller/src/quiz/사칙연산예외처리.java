package quiz;

import java.util.Scanner;

public class 사칙연산예외처리 {

	public static void main(String[] args) {
		
		/* 과제2 : 사칙연산 프로그램 작성(예외처리하기)
		 * 숫자 2개를 입력 받고 연산자 1개를 입력받는다
		 * 만약 0으로 나누었을 때 에러가 발생한다. ★★예외 처리★★를 해야한다.
		 */ 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x, y = ");
		int x, y, result = 0;

		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			System.out.print("op ( +, -, *, / ) = ");
			String op = sc.next();
			
			if(op.equals("+")) {
				result = x + y;
			} else if (op.equals("-")) {
				result = x - y;
			} else if (op.equals("*")) {
				result = x * y;
			} else if (op.equals("/")) {
				result = x / y;
			}
			
			System.out.printf("%d %s %d = %d 입니다. ", x, op, y, result);
			
		} catch(ArithmeticException e) {
			
			System.out.println("0으로 나눌 수 없습니다. ");
			
		} catch (Exception e) {
			
			System.out.println("0으로 나눌 수 없습니다. "); //user message			
		}
		

		
	}

}
