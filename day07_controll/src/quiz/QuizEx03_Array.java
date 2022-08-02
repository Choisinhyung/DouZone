package quiz;

import java.util.Scanner;

public class QuizEx03_Array {

	public static void main(String[] args) {
		// 문제3) 임의의 2차원 배열에 데이터 입력 받아서, 입력 받은 값 출력하기
		int[][] arr = new int[2][3];
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요");
		
		//input
		for(int i = 0; i < arr.length; i++) { // rowr : 배열명.length 
			for(int j = 0; j < arr[i].length; j++) { // col : 배열명[행크기].length 
				arr[i][j] = sc.nextInt();
			}
		}
		
		//output
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
