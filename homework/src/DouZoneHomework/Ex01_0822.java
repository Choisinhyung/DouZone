package DouZoneHomework;

import java.io.*;
import java.util.StringTokenizer;

public class Ex01_0822 {
    public static void main(String[] args) throws IOException {
			// 첫 줄에는 테스트 케이스 개수가 주어진다
			// 둘째 줄에는 각 테스트케이스마다 학생의 수가 첫 수로 주어지고
			// 이어서 n명의 점수가 주어진다
			// 점수는 0보다 크거나 같고 100보다 작거나 같은 정수이다.
			// 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 까지 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] arr;
        int sum, count;
        int C = Integer.parseInt(br.readLine());
        for (int i = 0; i < C; i++) {
            sum = 0;
            count = 0;
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            for (int j = 0; j < N; j++) {
                if ((float) sum / N < arr[j]) count++;
            }
            System.out.printf("\n%.3f%%\n", ((float) count / N) * 100);
        }
    }
}