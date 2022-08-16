package quiz;

import java.util.Scanner;

public class Score {
	
	private  String name = " ";
	private  int kor = 0;
	private  int eng = 0;
	private  int com = 0;
	private  int total = 0;
	private  double average = 0.0;
	private  String grade = " ";
	
	Scanner sc = new Scanner(System.in);
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		System.out.println("이름을 입력하세요");
		name = sc.next();
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor() {
		System.out.println("국어 점수를 입력하세요");
		kor = sc.nextInt();
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng() {
		System.out.println("영어 점수를 입력하세요");
		eng = sc.nextInt();
	}
	
	public int getCom() {
		return com;
	}
	
	public void setCom() {
		System.out.println("전산 점수를 입력하세요");
		com = sc.nextInt();
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal() {
		total = kor + eng +  com;
	}
	
	public double getAverage() {
		return average;
	}
	
	public void setAverage() {
		average = (double)total / 3;
	}
	
	public String getGrade() {
		return grade;
	}

	public void grade() {
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
	
	public void output() {
		//결과 출력
		System.out.println("***" + name + "님의 성적표***");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.printf("총점 : %d 평균 : %.1f  평점(학점) : %s \n", total, average, grade);
	}

}
