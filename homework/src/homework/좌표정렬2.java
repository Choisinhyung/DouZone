package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class 좌표정렬2 {

	public static void main(String[] args) throws IOException {
		
		// 2차원 평면 위 점 n개 주어짐
		// 좌표를 y좌표가 증가하는 순으로
		// y좌표가 같으면 x좌표가 증가하는 순서로 정렬 => 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //n개의 줄
		int[][] arr = new int[n][2]; // n행 2열 배열안에 x와 y값을 넣기
		
		StringTokenizer st;

	      for (int i = 0; i < n; i++) {
	          st = new StringTokenizer(br.readLine());
	          for (int j = 0; j < 2; j++) {
	             arr[i][j] = Integer.parseInt(st.nextToken());
	          }
	       }
	       
	       // 2차원 배열 정렬하기 (오름차순)
			Arrays.sort(arr, new Comparator<int[]>() { //Comparator 클래스 사용
			    @Override
				public int compare(int[] o1, int[] o2) {
			    	 if(o1[1] == o2[1]) {
			    		 return o1[0] - o2[0];
			    	 }else {
			    		 return o1[1] - o2[1]; 
			    	 }
		           }
		        });
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.print(arr[i][j] + " ");
				}System.out.println();
			}
		
	}

}
