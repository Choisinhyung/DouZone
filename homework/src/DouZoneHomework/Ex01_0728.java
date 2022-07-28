package DouZoneHomework;

import java.util.Scanner;

public class Ex01_0728 {

	public static void main(String[] args) {
		/* 숫자 3개를 입력 받아서 큰 수를 출력하는 프로그램 작성
		 * 논리연산(&&, ||), 교환알고리즘(tmp), if이용
		 * 
		 * 입력 예시 : 4 3 5
		 * 출력 예시 : 5 4 3 -> 숫자가 큰 순서대로 출력(3줄 정도로 끝날 수 있음)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 3개 입력해주세요 -> ");
		int input1 = sc.nextInt(); //4
		int input2 = sc.nextInt(); //3
		int input3 = sc.nextInt(); //5
		int tmp;
		
		if(input2 < input1 && input1 > input3) {
			tmp = input1;
		}
		System.out.println();
		
	}

}
