package quiz;

import java.util.Scanner;

public class ScoreArray {

		public static void main(String[] args) {
			
			double avg = 0.0;
			String grade = null;
			int kor = 0, eng = 0 , com = 0;
			int total = 0;
			int[] score = new int[4];
			String name = null;
			boolean flag = true;
			Scanner sc = new Scanner(System.in);
			
				System.out.println("이름을 입력하세요");
				name = sc.nextLine();
				
			for(int i = 0; i < score.length-1; i++) {
				if(i == 0) {
					while(true) {
					do {
						System.out.println("국어 성적을 입력해주세요 ");
						score[i] = sc.nextInt(); // score의 각 요소에 과목 별 점수 입력 받기.
					} while(kor < 0 && kor > 100);
						break;
					}
				}	
				if(i == 1) {
					while(true) {
						do {
							System.out.println("영어 성적을 입력해주세요");
							score[i] = sc.nextInt();
						} while(eng < 0 && eng > 100);
							break;
					}
				}
				if(i == 2) {
					while(true) {
					do {
						System.out.println("전산 성적을 입력해주세요");
						score[i] = sc.nextInt();
					} while(com < 0 && com > 100);
						break;
					}
				}
					
					score[3] += score[i]; //total
					avg = score[3] / 3.0;
					
				} //for
			
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
				} //switch
				
				System.out.println("*** " + name + "님의 성적표 ***");
				System.out.println("국어 : " + score[0] + "  영어 : " + score[1] + "  전산 : " + score[2]);
				System.out.println("총점 : " + score[3]);
				System.out.printf("평균 : %.2f", avg);
				System.out.print("\t학점 : " + grade + "\n");
		} // main
	} // class
