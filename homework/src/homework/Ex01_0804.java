package homework;

import java.util.Scanner;

public class Ex01_0804 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); //배달 할 설탕의 키로 수
		int fiveCount = 0;
		int threeCount = 0;
		// input을 먼저 5로 나누었을 때 
		// 나머지가 없으면 몫을 출력해서 count한다
		
		// 나머지가 있으면 5로 나눈 몫을 count한 후
		// 나머지를 3으로 다시 나누어 본다. 
		// 나머지가 없을 경우 몫을 출력해서 count하고
		// 나머지가 있으면 -1을 출력한다. 
		
		// 만약에 5로 나누었을 때 나누어 떨어지지 않았는데
		// 3으로 나누었을 때 나누어 떨어지면.. count를 하고..
		// 나머지를 3으로 나누었는데도 나누어 떨어지지 않았다? 
		// input - (경우의 수 3가지)5 * 몫이 0이 될때까지 3으로 나눠서 경우의 수
		// 3으로 나눈 나머지
		
		
		while(true) {
			if(input % 5 == 0) {
				fiveCount = input / 5;
				System.out.println(fiveCount);
			} else if (input % 5 != 0) { // 5로 나눴을 때 나머지가 있는데 
				fiveCount = (input / 5);
				
				if(input % 3 == 0) {
					threeCount = (input / 3);
					System.out.println(threeCount);
					break;
				}
				
				if((input % 5) % 3 == 0) {
					threeCount = ((input % 5) / 3);
					System.out.println(fiveCount + threeCount);
				} else if ((input % 5) % 3 != 0) {
					System.out.println(-1);
					break;
				}
			}
		}

	}

}
