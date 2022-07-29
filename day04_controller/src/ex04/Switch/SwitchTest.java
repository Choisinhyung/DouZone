package ex04.Switch;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		
		System.out.print("input score(k, e, c) = ");
		Scanner sc = new Scanner(System.in);
		
		int total = (sc.nextInt() + sc.nextInt() + sc.nextInt());
		
		double avg = (double)total / 3;
		String grade;
		
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
		System.out.print("\t학점 : " + grade);

	}

}
