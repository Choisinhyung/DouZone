package DouZoneHomework;

public class Ex01_0801 {

	public static void main(String[] args) {
		// 부분합 변수 + 숫자 1개씩 추가 / for문 /  => 35 ( 1~5) : 1 + (1+2) + (1+2+3) ...
	
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				sum += j;
			}
		}
		System.out.println(sum);
		
		System.out.println("==================");
		
		int sum2 = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
			 sum2 -= i;
			} else if ( i % 2 == 0 )
				sum2 += i;
		}
		System.out.println(sum2);
		
		System.out.println("==================");
		
		double sum3 = 0;
		
		for(double i = 1; i < 10; i++) {
			sum3 += i / (i+1);
		}
		System.out.printf("result = %.2f", sum3);
	}

}
