package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex01_0803 {

	public static void main(String[] args) throws IOException {
		// 달팽이는 올라가고 싶다.
		
		/*
		 * a = 올라갈수있는 미터
		 * b = 미끄러지는 미터
		 * c = 총 높이
		 * (a - b) = 하루에 올라갈 수 있는 높이
		 */
		
//		2 1 5
//		5 - (2 - 1) =  4
//		5 - (1 + 2 - 1) = 3
//		5 - (2 + 2 - 1) = 2
//		5 - (3 + 2 - 1) = 1 // 여기서 1만 더 올라가면 정상임. 미끄러지지 말아야 함.
//		5 - (4 + 2)
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
		int a = Integer.parseInt(st.nextToken()); // 올라갈 수 있는 높이
		int b = Integer.parseInt(st.nextToken()); // 미끄러지는 높이
		int c = Integer.parseInt(st.nextToken()); // 총 높이
		int count = 0; // 총 기간
		int day = a - b; // 하루에 올라갈 수 있는 높이
		int location = c - a; // 현재 위치 ( 마지막 날 도달하게 되면 더 이상 미끄러지지 않기 때문)
		
		// 만약에 현재위치가 낮에 올라가는 높이보다 낮을 경우 경우의 수 2가지
		// 총 높이가 올라가는 높이보다 작거나 같을 경우
		// 총 높이가 올라가는 높이보다 큰 경우
		if(location < day) {
			if(c <= a) {
				count = 1;
			} else {
				count = 2;
			}
		// 현재 위치가 낮에 올라가는 높이와 같거나 큰 경우
		// 현재 위치를 day로 나눈 나머지가 0일 경우
		// 현재 위치를 day로 나눈 나머지가 0이 아닐 경우
		} else {
			if(location % day == 0) { // 목표지점 도달, 첫 날에 총 높이에서 낮에 올라가는 높이를 뺐기 때문에 + 1
				count = location / day + 1;
			} else { // 이동 거리가 남았음, 이 나머지만큼 하루가 더 소비된다는 뜻 + 2
				count = location / day + 2;
			}
		}
		System.out.println(count);
	}

}
