package ex07.While;

import java.util.Scanner;

public class GuGuMain {

	public static void main(String[] args) {
		// 구구단 단을 입력받아 while문으로 출력하기
		
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		int a = 1;
		
		while(a < 10) {
			System.out.println(dan + "*" + a + "=" + (a*dan));
			a++;
		}
		
		//do while로 전체 구구단 출력하기
		
	}

}
