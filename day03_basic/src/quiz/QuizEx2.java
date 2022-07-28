package quiz;

import java.util.Scanner;

public class QuizEx2 {

	public static void main(String[] args) {
		
		// 1. 월급을 단위로 계산하기 (만, 천)
			
		System.out.print("월급을 입력해주세요(백만원 단위) -> ");
		Scanner sc = new Scanner(System.in);
		int pay = sc.nextInt();
		
		System.out.println(pay / 10000 + "만" + (pay % 10000) / 1000 + "천원 입니다");
		
		
		// 2. int su = 12345; -> 시:분:초 나누기 ( 60초 = 1분 : 60으로 나눠야 분이 나옴, 60분 = 1시간 : 3600으로 나눠야 시가 나옴, 나머지는 초 )

		int su = 12345;
		
		int hour = su / 3600;
		int minute = (su % 3600) / 60;
		int second = (su % 3600) % 60; 
		
		System.out.println(hour + "시" + minute + "분" + second + "초 입니다.");

	}

}
