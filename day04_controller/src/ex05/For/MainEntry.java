package ex05.For;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		// 반복문 -> for문
		
//		for(int i = 1; i <= 3; i++) {
//			System.out.print(i);
//		}
//		System.out.println("\n---------------------");
//		
//		// [문제]
//		for(int i = 0; i < 5; i++) {
//			System.out.print("*");
//		}
		
		//[문제2] 원하는 단을 입력 받아서 구구단 출력하기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("계산할 단수를 입력해주세요");
//		int input = sc.nextInt();	
		
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++ ) {
//				System.out.println(i + "X" + j + "=" + (i*j));
//			}
//		}
		
		//[문제3] 1 ~ 100까지 중에서 3의 배수의 개수와 합을 구하는 프로그램 작성
		// 답은 1600 얼마~
		int sum = 0;
		int count = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%3 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
		

	}

}
