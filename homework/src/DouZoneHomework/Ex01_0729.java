package DouZoneHomework;

import java.util.Scanner;

public class Ex01_0729 {

	public static void main(String[] args) {
		//전산 영어 국어 점수 입력 받아서 평균 60점 이상이고,
		//각 과목 과락 40점 이하면 과목 불합격 처리하는 프로그램 작성
		// 어느과목때문에~ 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("전산 영어 국어 점수를 순서대로 입력하시오");
		int com = sc.nextInt();
		int eng = sc.nextInt();
		int kor = sc.nextInt();
		int sum = com + eng + kor;
		double avg = sum / 3.0;
		

		if(avg >= 60) {
			if((com >= 40) && (eng >= 40) && (kor >= 40)) {
				System.out.println("합격입니다. ");
			} else {
				System.out.println("불합격입니다. ");
			}
		} else {
			System.out.println("불합격입니다. ");
		}
	}

}
