package ex04.Switch;

import java.util.Scanner;

public class NewSwitch {

	public static void main(String[] args) {
		// 31일(나머지 1), 30일(나머지 0), 2월은 28일

		
		System.out.println("원하는 달의 일수 확인하기");
		int month = new Scanner(System.in).nextInt();
		int day = 0;
		
		//14버전부터 아래의 코드로 사용 가능함. 형식 알아두기, yield값이 변수에 저장됨
//		int day = switch(month) {
//				case 1, 3, 5, 7, 8, 10, 12 -> {
//					System.out.println("31일까지 있습니다");
//					yield 31;
//				}
//				case 4, 6, 9, 11 -> {
//					System.out.println("30일까지 있습니다");
//					yield 30;
//				}
//				case 2 -> {
//					System.out.println("28일까지 있습니다.");
//					yield 28;
//				}
//				default -> {
//					System.out.println("없는 달입니다. ");
//					yield 0;
//				}
//				
//			};

		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31; break;
		case 2:
			System.out.println("year = ");
			int year = new Scanner(System.in).nextInt();
			if(year % 4 == 0) {
				if(year % 100 != 0 || year % 400 == 0) {
					day = 29;
				}
			}
			day = 28; break;
		case 4: case 6: case 9: case 11: day = 30; break;
		}
		
		System.out.println(month + "월=> " + day + "일까지 있습니다. ");
	}

}
