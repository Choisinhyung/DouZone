package quiz;

import java.util.Scanner;

public class 사칙연산 {

	public static void main(String[] args) {
		
		/* 과제2 : 사칙연산 프로그램 작성(예외처리하기)
		 * 숫자 2개를 입력 받고 연산자 1개를 입력받는다
		 * 만약 0으로 나누었을 때 에러가 발생한다. ★★예외 처리★★를 해야한다.
		 */ 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x, y = ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = 0;
		
		System.out.print("op ( +, -, *, / ) = ");
//		char op = sc.next().charAt(0); 
		
		/* char타입은 잘 나왔는데 string으로 했을 때에는 else출력문이 같이 뜬다. 왜?
		 * ==은 실제 데이터가 들어있는 곳(heap)만 비교하기 때문이다
		 * stack영역에서 주소값이 들어가 있는데 stack영역의 주소값과 ==은 다를 수 밖에 없다
		 * equals를 사용해야 함.
		 */ 
		
		String op = sc.next();
//		if(op == '+') {
//			result = x + y;
//		} else if (op == '-') {
//			result = x - y;
//		} else if (op == '*') {
//			result = x * y;
//		} else if (op == '/') {
//			result = x / y;
//		} else {
//			System.out.println("잘못 입력하셨습니다. +, -, *, / 중 한 가지를 입력하세요.");
//		}
		
		if(op.equals("+")) {
			result = x + y;
		} else if (op.equals("-")) {
			result = x - y;
		} else if (op.equals("*")) {
			result = x * y;
		} else if (op.equals("/")) {
			result = x / y;
		} else {
			System.out.println("잘못 입력하셨습니다. +, -, *, / 중 한 가지를 입력하세요.");
		}
		System.out.printf("%d %s %d = %d 입니다. ", x, op, y, result);
		
	}

}
