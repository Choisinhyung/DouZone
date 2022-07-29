package quiz;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// 문제 : 숫자 1개를 입력받아서 짝/홀수 판정 P/G
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 => ");
		int num = sc.nextInt();
		
		
//		if(num % 0 == 0) {
//			System.out.println("짝수입니다. ");
//		} else if(num % 1 == 1) {
//			System.out.println("홀수입니다. ");
//		}
		
		switch(num % 2) {
			case 0: System.out.println("짝수입니다. "); break;
			case 1: System.out.println("홀수입니다. "); break;
		}

	}

}
