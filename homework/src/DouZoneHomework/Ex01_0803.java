package DouZoneHomework;

import java.util.Scanner;

public class Ex01_0803 {
		//성적 처리 프로그램 함수로 분리하기

	public static String name;
	public static int kor;
	public static int eng;
	public static int com;
	public static int total;
	public static double average;
	public static String grade;
	public static String[] sum;
	
	public static void input() {
		// 입력함수 : 이름, 국어, 영어, 전산 입력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("국어 점수를 입력하세요");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng = sc.nextInt();
		System.out.println("전산 점수를 입력하세요");
		com = sc.nextInt();
	}
	
	public static void total() {
		//총점
		total = kor + eng + com;
	}
	
	public static void average() {
		//평균
		average = (double)total / 3;
	}
	
	public static void grade() {
		//학점
		for(int i = 0; i < 1; i++) {
			switch ((int)average / 10) {
			case 10: case 9:	
				grade = "A";	
				break;
			case 8:
				grade = "B";		
				break;
			case 7:
				grade = "C";	
				break;
			case 6:
				grade = "D";	
				break;
			default:
				grade = "F";	
				break;
			} // end switch
		} //end for
	}
	
	public static void output() {
		//결과 출력
		input();
		total();
		average();
		grade();
		System.out.println("***" + name + "님의 성적표***");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.printf("총점 : %d 평균 : %.1f  평점(학점) : %s \n", total, average, grade);

		
	}
		
	public static void main(String[] args) {
		output();
	}

}
