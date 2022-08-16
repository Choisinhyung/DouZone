package DouZoneHomework;

import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = (int)(Math.random() * 100 + 1); //num에 1 ~ 100까지의 랜덤 숫자 저장
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("숫자를 입력해주세요");
			int input = sc.nextInt();
			
			if(num > input) {
				if(i == 4) {
					System.out.println("실패입니다.");
					System.out.println("정답은 " + num + "입니다.");
					break;
				}
				System.out.println("작은 값을 입력하셨습니다. UP!");
			} else if(num < input) {
				System.out.println("큰 값을 입력하셨습니다. Down!");
			} else if(num == input) {
				System.out.println("정답!");
				break;
			}
		}
	}
}
