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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.println("아래에 국어, 영어, 전산 성적을 순서대로 입력해주세요 ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		
		int total;
		double avg = 0;
		total = kor + eng + com;
		avg = (float)total / 3;
		
		//학점(평점) 구하기
		String grade = null;
		
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
		
		System.out.println("*** " + name + "님의 성적표 ***");
		System.out.println("국어 : " + kor + "  영어 : " + eng + "  전산 : " + com);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f", avg);
		System.out.print("\t학점 : " + grade);

	}

}
