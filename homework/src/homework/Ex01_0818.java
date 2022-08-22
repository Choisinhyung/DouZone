package homework;

import java.util.Scanner;

public class Ex01_0818 {

	public static void main(String[] args) {
		
		// 카드의 합이 m 넘지않는 선에서 합을 최대한 크게 만드는 게임
		
		// 첫 줄에 카드의 개수가 주어짐 (n / m)
		// 둘째 줄에는 카드에 쓰여있는 수가 주어진다. 
		// 합이 m을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어짐
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		// 각 카드의 수가 들어갈 배열에 입력값 저장
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 만약 배열 안에 있는 요소의 값 중 3개를 합쳤을 때
		// m을 넘지 말아야 함.
		
		for(int i = 0; i < n; i++) {
			//배열의 요소 3개를 랜덤으로 더해야해서 값을 뽑아온 뒤 m과 비교해서
			//작거나 같으면 출력한다.
			//출력한 값 중 가장 큰 값을 출력
			for(int j = i+1; j < n - 1; j++) {
				for(int z = j+1; z < n; z++) {
					
				}
			}
			
		}
		
	}

}
