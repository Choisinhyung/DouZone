package ex05.For;

public class ForStar {

	public static void main(String[] args) {

		// 별찍기

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("================");

		// 정사각형
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("===============");

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 6 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("==============");

		// 공백for문 출력for문 개행for문
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5-i; j++) System.out.print(" "); //공백 for문
			for (int j = 0; j < i; j++) System.out.print("*");  //별찍기 for문 
			System.out.println();
		}
		
		System.out.println("==============");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5-i; j++) System.out.print(" ");
			for (int j = 0; j < 2*i-1; j++) System.out.print("*");
			System.out.println();
		}
		
		System.out.println("==============");
		
		
		
	}

}
