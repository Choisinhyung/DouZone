package ex8.DoWhile;

import java.util.Scanner;

public class MainDoWhile {

	public static void main(String[] args) {
		// 정수를 입력 받을 때 잘못 입력했을 경우 다시 돌아가게 하기. 
		int su;
		
		while(true) {
		do {
			
			System.out.print("Score(0 ~ 100사이만 입력) = ");
			su = new Scanner(System.in).nextInt();
			System.out.println(su);			
			
		} while (su >= 0 && su <= 100);
		
		System.out.println("점수를 더 입력 받으시겠습니까? ");
		char yesno = new Scanner(System.in).next().charAt(0);
		
		if ( yesno == 'n' || yesno == 'N' ) break;
		}
		System.out.println("0 ~ 100 사이의 숫자가 아닙니다.");

	}

}
