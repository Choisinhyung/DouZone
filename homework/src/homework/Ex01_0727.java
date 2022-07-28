package homework;

import java.util.Scanner;

public class Ex01_0727 {

	public static void main(String[] args) {
		// 시험 성적
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(90 <= score && score >= 100) {
			System.out.println("A");
		} else if (80 <= score && score >= 89) {
			System.out.println("B");
		} else if (70 <= score && score >= 79) {
			System.out.println("C");
		} else if (60 <= score && score >= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
