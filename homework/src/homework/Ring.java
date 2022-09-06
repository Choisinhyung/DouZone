package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ring {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		//배열안에 각 원의 반지름 저장
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열의 i값에 있는 요소를 서로 나누어서 몫을 첫 번째로 출력
		// 입력값이 8 4 2면 8/4해서 몫을 받는다. 
		// 즉 0번인덱스 / 1번인덱스       :     0번인덱스 / 2번인덱스

		for(int i = 1; i < arr.length; i++) {
			if(arr[0] % arr[i] == 0) {
				System.out.println((arr[0] / arr[i]) + "/1");
			} else {
				// 12를 100으로 가정할 때 8은 12의 3/2이다. 
				int num = 0;
				int num2 = 0;
				num = Math.min(n, arr[i]);
				for(int j = 1; j <= num; j++) {
					if(arr[0] % j == 0 && arr[i] % j == 0) {
						num2 = j;
					}
				}
				if(num == 1) {
					System.out.println(arr[0] + "/" + arr[i]);
				} else {
					System.out.println((arr[0]/num2) + "/" + (arr[i]/num2));
				}
			}

		}
		
	}

}
