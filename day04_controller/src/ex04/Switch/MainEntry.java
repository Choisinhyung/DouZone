package ex04.Switch;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		// switch - case
		
		System.out.print("당신의 포인트 점수는? (1~3점) input => ");
		
//		int point = new Scanner(System.in).nextInt();
		double point = new Scanner(System.in).nextDouble(); // 스위치문 에러 : 형변환해서 사용하자
		int point2 = (int)point;
		
		switch ((int)point) {  // 정수형, 문자형만 들어올 수 있음, 실수는 안됨!!
			case 1:  // 숫자, 문자, 문자열 (조건의 타입과 맞게~)
				System.out.println("포인트 점수는 1점 입니다. ");
				break;
			case 2:
				System.out.println("포인트 점수는 2점 입니다. ");
				break;
			case 3:
				System.out.println("포인트 점수는 3점 입니다. ");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 1~3까지만 입력 요망");
//				break; //생략 가능
		} // end switch
		
	}

}
