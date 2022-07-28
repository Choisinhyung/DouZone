package quiz;

public class QuizScore {

	public static void main(String[] args) {
		// 성적 처리 프로그램 만들기
		
		/*  결과 출력 예시
		 *  result : 
		 *  *** 최신형님의 성적표 ***
		 *  국어 : 90, 영어 : 88, 전산 : 100
		 *  총점 : 278
		 *  평균 : 92.66.... 소수점 2자리
		 */
		int kor = 90, eng = 88, com = 100;
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
