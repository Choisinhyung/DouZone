package quiz;

import java.util.Scanner;

public class QuizScore {

	public static void main(String[] args) {
		
		// Scanner를 이용한 성적 처리 프로그램 만들기
		
		/*  결과 출력 예시 (입력받기)
		 *  *** 최신형님의 성적표 ***
		 *  국어 : 100, 영어 : 100, 전산 : 100
		 *  총점 : 278
		 *  평균 : 92.66.... 소수점 2자리
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아래에 국어, 영어, 전산 성적을 순서대로 입력해주세요 ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		
		int total;
		float avg = 0;
		String name = "최신형";
		
		total = kor + eng + com;
		avg = (float)total / 3;
		
		System.out.println("*** " + name + "님의 성적표 ***");
		System.out.println("국어 : " + kor + "  영어 : " + eng + "  전산 : " + com);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f", avg);

	}

}
