package ex03.exception;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		// Exception(예외처리)
		
		System.out.print("x, y = ");
		int x, y, result = 0;

		try {
			
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y;  // 문제 발생 소지가 있는 코드		
			
			System.out.println(result);
			
		} catch (Exception e) {// 모든 예외처리
			System.out.println("0으로 나눌 수 없습니다. "); //user message
			System.out.println(e.getMessage());
			e.printStackTrace(); //에러처리를 단계적으로 찾아줌
		} //try end

	}

}

/*
 * package ex03.exception;
 * 
 * import java.util.Scanner;
 * 
 * public class MainEntry {
 * 
 * public static void main(String[] args) { // Exception(예외처리)
 * 
 * System.out.print("x, y = "); int x, y, result = 0;
 * 
 * // 1. 입력을 받을 때 처리 // 2. result에서 처리
 * 
 * x = new Scanner(System.in).nextInt();
 * 
 * y = new Scanner(System.in).nextInt();
 * 
 * if (y == 0) { System.out.println("0으로 나눌 수 없습니다."); return; // 제어권 넘기기 } else
 * { result = x / y; }
 * 
 * result = x / y;
 * 
 * System.out.println(result);
 * 
 * }
 * 
 * }
 */
