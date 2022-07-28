package homework;

import java.util.Scanner;

public class Ex02_0727 {

	public static void main(String[] args) {
		// 윤년
		
		/* 윤년이면 1 / 아니면 0
		 * 2000입력시 1출력 / 1999입력시 0출력
		 * 
		 * 중첩 if 사용하면 될 것 같음
		 * 
		 * 입력값은 4의 배수이면서 ( if )
		 * 100의 배수가 아니라서 윤년이다 ( else )
		 * 
		 * 입력값은 100의 배수이고 400의 배수가 아니라서 0이다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if(input%4 == 0 ) { // 4의 배수 이면서
			if(input%400 == 0) { // 400의 배수이면
				System.out.println("1"); // 1을 출력
			} else if(input%100 == 0){ //만약 4의 배수이면서 100의 배수가 아니면
				System.out.println("0"); // 0을 출력
			}
		} else { // 4의 배수가 아니면 
			System.out.println("0"); // 0을 출력
		}

	}

}
