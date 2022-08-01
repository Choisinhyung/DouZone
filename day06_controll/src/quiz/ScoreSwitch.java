package quiz;

import java.util.Scanner;

public class ScoreSwitch {

	public static void main(String[] args) {
		
		// Scanner를 이용한 성적 처리 프로그램 만들기
		// if문을 사용하여 학점 구하기
		
		/*  결과 출력 예시 (입력받기)
		 *  *** 최신형님의 성적표 ***
		 *  국어 : 100, 영어 : 100, 전산 : 100
		 *  총점 : 278
		 *  평균 : 92.66.... 소수점 2자리
		 *  학점 : -
		 */
		
		
		//점수 : 0 ~ 100점까지만 입력 받게 처리
		//반복적으로 원하는 만큼 입력 받게 처리
		int kor;
		int eng;
		int com;
		int total;
		double avg = 0;
		String grade = null;
		boolean flag = true;
		
		while(flag) {
			do {
				Scanner sc = new Scanner(System.in);
				System.out.print("이름을 입력해주세요 : ");
				String name = sc.nextLine();
				System.out.println("아래에 국어, 영어, 전산 성적을 입력해주세요 ");
				
				kor = sc.nextInt();
				eng = sc.nextInt();
				com = sc.nextInt();
				
				total = kor + eng + com;
				avg = (float)total / 3;
				
				switch((int)avg/10) {
				case 10 : case 9 : 
					grade = "A";
					break;
				case 8 : 
					grade = "B";
					break;
				case 7 : 
					grade = "C";
					break;
				case 6 : 
					grade = "D";
					break;
				default : 
					grade = "F";
				}	
				if(kor >= 0 && kor <= 100 && eng >= 0 && eng <= 100 && com >= 0 && com <= 100) {
					System.out.println("*** " + name + "님의 성적표 ***");
					System.out.println("국어 : " + kor + "  영어 : " + eng + "  전산 : " + com);
					System.out.println("총점 : " + total);
					System.out.printf("평균 : %.2f", avg);
					System.out.print("\t학점 : " + grade + "\n");
				}
				
			} while (kor >= 0 && kor <= 100 && eng >= 0 && eng <= 100 && com >= 0 && com <= 100);
			System.out.println("점수를 잘못 입력하셨습니다. 다시 입력해주세요 (0 ~ 100)" );
		}
	}
}
