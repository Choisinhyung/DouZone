package quiz;

import java.util.Scanner;

public class QuizIf {

	public static void main(String[] args) {
		// 문제 : 숫자 2개를 입력 받아 둘 중에 큰 수를 출력하시오. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 2개 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max;
		
		// 1
		if( a > b ) {
			System.out.print("큰 수 => " + a);
		} else {
			System.out.print("큰 수 => " + b);
		}
		
		// 2
		if( a > b ) max = a;
		else max = b;
		
		System.out.println("\nmax => " + max);
		
		// 3
		System.out.println(sc.nextInt() > sc.nextInt());
		
	}
}