package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class startlink {

	static int n;
	static int [][] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		StringTokenizer st;
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
	}
	
	public static void sum() {
		
	}

}
