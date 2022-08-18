package homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex01_0817 {

	public static void main(String[] args) {
		
		// 점수가 가장 높은 k명의 사람들은 상을 받는다. 이 때 커트라인이 몇 점인지 구하여라
		// 커트라인은 k명의 사람중 가장 점수가 낮은 사람의 점수이다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 응시자수 n
		int k = sc.nextInt(); // 상을 받는 사람의 수 k
		Integer[] x = new Integer[n]; // 각 학생의 점수 x가 공백을 사이에 두고 주어진다.
		
		// x배열에 점수 저장
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		
		//정렬
		Arrays.sort(x, Collections.reverseOrder());
		
		//정렬된 x배열의 값 중 k - 1번의 인덱스를찾아서 출력. // 인덱스는 0번부터이기 떄문에~
		System.out.println(x[k - 1]);

	}

}
