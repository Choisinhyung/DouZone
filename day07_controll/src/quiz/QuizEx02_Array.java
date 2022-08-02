package quiz;

import java.util.Scanner;

public class QuizEx02_Array {

	public static void main(String[] args) {
		//문제2) 8월 한달간의 강수량을 입력 받아서, 평균 구하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		double[] rainFall = new double[31]; //배열 생성
		double sum = 0; // 총합
		float avg; // 평균
		for(int i = 0; i < rainFall.length; i++) {
			System.out.println((i+1) + "일의 강수량을 입력하세요.");
			rainFall[i] = sc.nextDouble(); //각 배열의 요소에 입력 값 저장
			sum += rainFall[i]; // 배열의 요소 더하기 
		}
		
		avg = (float)sum / rainFall.length; // 평균 = 총합 / 배열의 크기
		
		System.out.printf("8월 강수량의 평균은 %.2f 입니다. ", avg);

	}

}
