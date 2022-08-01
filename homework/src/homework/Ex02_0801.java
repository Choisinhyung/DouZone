package homework;

import java.util.Scanner;

public class Ex02_0801 {

	public static void main(String[] args) {
		//더하기 사이클
		//주어진 수가 10보다 작으면 앞에 0을 붙여 두 자리 수로 만들어 각 숫자를 더한다.
		//주어진 수의 오른쪽 자리와 합의 오른쪽 자리를 이어 붙여서 사이클의 길이를 구해보자
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); // 입력값
		int first = input; //첫번째 자리수
		int count = 0; // 사이클
		
		while(true) {
			// 첫째자리수 
			input = ((input % 10) * 10) + (((input / 10) + (input % 10)) % 10);
			count++;
			
			if (first == input) {
				break;
			}
		}
		
		System.out.println(count);
	}

}
