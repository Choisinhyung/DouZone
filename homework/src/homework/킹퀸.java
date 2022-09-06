package homework;

import java.util.Arrays;
import java.util.Scanner;

public class 킹퀸 {

	public static void main(String[] args) {
		// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개 => 총 16개
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1, 1, 2, 2, 2, 8};
		int[] num = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			num[i] = sc.nextInt();
			
			if(num[i] == arr[i]) {
				num[i] = 0;
			} else if (num[i] != arr[i]) {
				num[i] = arr[i] - num[i];
			}
			System.out.print(num[i] + " ");
		}
	}

}
