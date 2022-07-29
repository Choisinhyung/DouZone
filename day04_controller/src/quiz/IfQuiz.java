package quiz;

import java.util.Scanner;

public class IfQuiz {

	public static void main(String[] args) {
		/* 윤년/평년 판정 프로그램 작성
		 * 
		 * 년도를 입력 받았을 때 4로 나눈 나머지가 0이 되어야 함
		 * if(년도 % 4 == 0)
		 * 	  if(년도 % 100 != 0) || (년도 % 400 == 0)
		 *      "윤년"
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = sc.nextInt();
		String result = null;
		boolean flag = false;
		
/*		if(year % 4 == 0 ) { // 4의 배수 이면서
			if(year % 400 == 0) { // 400의 배수이면
				System.out.println("입력하신 년도는 윤년입니다. ");
			} else if(year%100 == 0){ //만약 4의 배수이면서 100의 배수가 아니면
				System.out.println("입력하신 년도는 평년입니다. "); 
			}
		} else { // 4의 배수가 아니면 
			System.out.println("입력하신 년도는 평년입니다. "); 
		} */
		
		if(year % 4 == 0) {
			if(year % 100 != 0 || year % 400 == 0) {
				flag = true;
			}
		}
		
		result = (flag == true) ? "윤년" : "평년";

	}

}
