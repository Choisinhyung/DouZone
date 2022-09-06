package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 부녀회장이될테야 {

	public static void main(String[] args) throws IOException {
		
		// a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼
		// 사람들을 데려와 살아야한다.
		// 비어있는 집은 없고 k와 n에 대해 
		// k층 n호에는  명이 살고있는지 출력해라
		// 아파트는 0층부터 있고 각 층에는 1호부터 있다. 
		// 0층의 i호에는 i명이 산다
		
//		    1호   2호   3호
//		3층  1    5     15
//		2층  1    4     10
//		1층  1    3     6
// 		0층  1    2     3-

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int k = Integer.parseInt(br.readLine()); // 테스트케이스
		int floor = 0;
		int numHouse = 0;
		int[][] arr = new int[15][15]; // 아파트는 15층 15호까지 있음
		
	
		// 몇층의 몇호를 알아볼건지 입력받기
//		for(int i = 0; i < k; i++) { // 테스트케이스 반복횟수
//			floor = Integer.parseInt(br.readLine()); // 층수 입력받기
//			numHouse = Integer.parseInt(br.readLine()); // 호수 입력받기
//		}

		// 기본값 지정 : 0층의 각 호에 사는 인원들 값 넣어주기 0열 i호
		for(int i = 1; i < arr.length; i++) {
			arr[0][i] = i;
		}
		
		// 예를 들자
		// 1층의 1호에는 arr[0][0] 명이 살고, 1층의 2호에는 arr[0][0] + arr[0][1] 명이 산다
		// 2층의 1호에는 arr[1][0] 명이 살고, 2층의 2호에는 arr[1][0] + arr[1][1] 명이 산다
		// 반복하기
		for(int i = 1; i < arr.length; i++) {
			// 1층의 1호에 처음 더하는 값은 0이니까 num을 0으로 초기화해놓기
			int num = 0;
			for(int j = 1; j < arr[i].length; j++) {
				// 1층의 1호에는 = 0층의 1호
				// 1층의 2호에는 = 0층의 1호 + 0층의 2호
				arr[i][j] = arr[i-1][j] + num;
				num = arr[i][j];
//				System.out.println(arr[j][i]); // 디버깅용
			}
		}
		
		// 출력
		for(int i = 0; i < k; i++) {
			floor = Integer.parseInt(br.readLine()); // 층수 입력받기
			numHouse = Integer.parseInt(br.readLine()); // 호수 입력받기
			sb.append(arr[floor][numHouse] + "\n");
		}
		
		System.out.println(sb);
	}
}
