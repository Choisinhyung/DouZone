package ex02.array;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 문제4) 3행 4열 배열을 생성후 1,2행은 값을 입력하고
		// 3행에는 1, 2행에 있는 값을 더해서 출력

		int[][] arr = new int[3][4];
		int sum;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) { // 각 배열의 요소에 입력값 저장
			for (int j = 0; j < 4; j++) { // 1, 2행만 입력 받아야 함
				arr[i][j] = sc.nextInt();
				arr[2][j] = arr[0][j] + arr[1][j];
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
//		 3행에 1,2에 있는 행의 값을 저장
//			arr[1행][1열] + arr[2행][1열]

	}

}
