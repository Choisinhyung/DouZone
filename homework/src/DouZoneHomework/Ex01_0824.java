package DouZoneHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_0824 {

	public static void main(String[] args) {
		
		//피보나치수
		//피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 
		//1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
		//n=17일때 까지 피보나치 수를 써보면 다음과 같다.
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int result;
		
		if(n >= 1) {
			arr[0] = 0;
			arr[1] = 1;
			for(int i = 0; i < n-1; i++) {
				//2번째부터 합이 출력되니까 i+2
				//2번째인덱스에 0번인덱스와 1번인덱스를 더해야함 그걸 반복
				arr[i+2] = arr[i] + arr[i+1];
			}
		}
		result = arr[n];
		System.out.println(result);
		
	}

}
