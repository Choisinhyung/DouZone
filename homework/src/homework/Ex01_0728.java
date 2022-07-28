package homework;

import java.util.Scanner;

public class Ex01_0728 {

	public static void main(String[] args) {
		
		/* 오븐 시계 : 요리를 시작하는 시각과 필요한 시간이 분단위로 주어졌을 때요리가 끝나는 시작을 계산해보자
		 * 
		 * 입력 예시 : 14 30 
		 * 			 20 
		 * 출력 예시 : 14 50
		 * 
		 * a b - c = 끝나는 시간
		 * 분을 60으로 만들자
		 * a에서 b를 더했을 때 b가 59이상이면 a에서 1을 더해야 함
		 * b에서 c를 더했을 때 c가 1000 이상이면 b에 1을 더해야 함
		 * a b - c = 출력할 시간
		 */

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		
		
		h += c/60; // 초를 60으로 나눈 후 시간에 더해서 누적
		m += c%60; // 초를 60으로 나눈 나머지를 분에 더해서 누적
		
		//분이 60이 넘어갔을 때
		if(m > 59) {
			h += 1; // 시간에 1을 누적
			m -= 60; // 분에 -60을 누적
		}
		
		//시간이 23보다 클 때
		if(h > 23) {
			h -= 24;
		}
		System.out.printf("%d %d", h, m);
	}
}
