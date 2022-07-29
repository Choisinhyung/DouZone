package homework;

import java.util.Scanner;

public class Ex01_0729 {

	public static void main(String[] args) {
		
		/* 알람 시계 : 45분 일찍 알람 설정하기
		 *  
		 * 입력 예시 : 10 10 / 0 30 / 23 40
		 * 출력 예시 : 9 25 / 23 45 / 22 55
		 * 
		 * 자정 이전으로 넘어가는 경우를 잘 체크해서 쿼리를 짜야 할 것 같음(시:0일 때 23으로 넘어가게~)
		 * 
		 * 0 ≤ H ≤ 23
		 * 0 ≤ M ≤ 59 : m이 0아래이면? h가 -1 되어야 함
		 * m이 45 이상이면 - 45
		 * 이하면 h -1 / m + 60 -45
		 */
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		if(minute >= 45) { //만약 분이 45이상이면 
			System.out.printf("%d %d",hour, minute - 45); // 분에서 -45해서 출력
		} else { // 분이 45이상이 아니면서
			if(hour == 0) { // 시간이 0일 때
				hour = 24; // 시간을 24로 변경해서 아래의 식으로 계산
				System.out.printf("%d %d", hour - 1, minute + 60 - 45);
			} else { // 분이 45이상이 아니고, 시간이 0이 아닐 때
				System.out.printf("%d %d", hour - 1, minute + 60 - 45);
			}
		}

	}
	
}
