package ex04.Switch;

import java.util.Scanner;

public class MainSwitch {

	public static void main(String[] args) {
		// 스위치문이용해서 도시선택하고 목록에 없으면 예외처리
		
		System.out.print("도시를 선택하세요(s, d, b, j) -> ");
		
		Scanner sc = new Scanner(System.in);
//		String select = sc.next();
		char select = sc.next().charAt(0);
		
		switch(select) {
			case 's': System.out.print("서울"); break;
			case 'd': System.out.print("대구"); break; 
			case 'b': System.out.print("부산"); break;
			case 'j': System.out.print("제주"); break;
			default : System.out.print("잘못 선택하셨습니다. s, d, b, j 중에서만 선택하세요.");
			System.exit(0); //프로그램 강제종료
		}
		
		System.out.println("을(를) 선택하셨습니다. ");
		
	}

}
