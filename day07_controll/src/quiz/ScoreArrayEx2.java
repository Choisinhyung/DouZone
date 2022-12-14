package quiz;

import java.util.Scanner;

public class ScoreArrayEx2 {

		public static void main(String[] args) {
			int SU = 3; // 학생수 
			int NO = 3; // 국어, 영어, 전산
			int[][] arr = new int[SU][NO];
			int[][] nUserInfo = new int[SU][NO];// 총,평,학
			String[] strName = new String[SU];
			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < arr.length; i++) { //배열 행의 길이만큼 반복
				System.out.printf("%d번째 학생 이름 입력: \n", i + 1);
				strName[i] = sc.next(); //이름 저장
				
				for (int j = 0; j < arr[0].length; j++) { // 배열 각 행의 열에 아래코드 저장
					switch (j) { //배열 해당되는 열 출력구문
					case 0:	System.out.print("국어점수 입력: ");
						break;
					case 1:	System.out.print("영어점수 입력: ");
						break;
					case 2:	System.out.print("전산점수 입력: ");
						break;
					} // end switch
					arr[i][j] = sc.nextInt(); // 배열의 각 행과 열에 입력값 저장(점수)
				} // j   end
			}  // i  end

			int nSum = 0, nGrade = 0;
			double fAvg = 0;
			String strmsg = " ";
			char szGrade = ' ';
			
			for (int i = 0; i < arr.length; i++) { //행의 길이만큼 반복 0 1 2 
				nSum = 0;
				fAvg = 0.0f;
				nGrade = 0;
				System.out.printf("[ %s ] 학생 점수 ==================\n ", strName[i]); // 이름배열에 저장된 값 출력
				for (int j = 0; j < arr[0].length; j++) { //배열의 열만큼 반복 0 1 2 
					strmsg = " ";
					switch (j) { // 열의 숫자가 아래와 같다면~
						case 0:	strmsg = "국어 ";		break;
						case 1:	strmsg = "영어 ";		break;
						case 2:	strmsg = "전산 ";		break;
					}
					nSum += arr[i][j]; // 점수 누적 합치기
					System.out.printf("[ %s ] : %d \n", strmsg, arr[i][j]); // 국어는 100점 ...
				} // end for 
				
				fAvg = (double) nSum / arr.length;
				nGrade = (int) fAvg / 10;
				switch (nGrade) {
					case 10:
					case 9:	szGrade = 'A';	break;
					case 8:	szGrade = 'B';		break;
					case 7:	szGrade = 'C';		break;
					case 6:	szGrade = 'D';	break;
					default:	szGrade = 'F';
				} // end switch
				
				System.out.println("\n**************** [ " + strName[i] + " ] 번 학생 점수 결과 ****************");
				System.out.printf("[ 총점: %d ]\t[ 평균: %.2f ]\t[ 학점 : %s ]\t", nSum, fAvg, szGrade);
				System.out.println("\n=================================================\n");
			}
		}
	}
