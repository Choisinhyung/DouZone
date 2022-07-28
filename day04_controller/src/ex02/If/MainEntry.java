package ex02.If;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		/*  < 제어문 >
		 *  - 비교문(조건문) : if / if-else
		 *  - 선택문 : switch ~ case
		 *  - 반복문 : for / while / do ~ while
		 *  - 기타 : break / continue
		 */
		
		//짝/홀수 판정
		System.out.print("Integer data : ");
		int su = new Scanner(System.in).nextInt();
		
		if(su % 2 == 0) {
			System.out.println(su + " => 짝수");
		} else {
			System.out.println(su + " => 홀수");
		}
		
		String sam = (su % 2 == 0) ? su + " => 짝수" : su + " => 홀수";
		System.out.println(sam);
		
	}
}
