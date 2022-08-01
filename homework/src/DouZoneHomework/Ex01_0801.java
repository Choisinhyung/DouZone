package DouZoneHomework;

public class Ex01_0801 {

	public static void main(String[] args) {
		// 부분합 변수 + 숫자 1개씩 추가 / for문 /  => 35 ( 1~5) : 1 + (1+2) + (1+2+3) ...
		
		int part = 0;
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j < i + 1; i++) {
				System.out.println(i);
//				part = i + j;
			}
		}

	}

}
