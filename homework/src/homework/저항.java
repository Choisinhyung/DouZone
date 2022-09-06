package homework;

import java.util.Scanner;

public class 저항 {

	public static void main(String[] args) {
		// 색 3개를 선택
		// 처음 색 2개는 저항의 값
		// 마지막 색은 곱해야하는 값
		
//        색    값   곱
//		black	0	1
//		brown	1	10
//		red	    2	100
//		orange	3	1,000
//		yellow	4	10,000
//		green	5	100,000
//		blue	6	1,000,000
//		violet	7	10,000,000
//		grey	8	100,000,000
//		white	9	1,000,000,000
		
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3];
		String[] color = {"black", "brown", "red", "orange", "yellow",
						  "green", "blue", "violet", "grey", "white"};
		int[] value = new int[10];
		int[] x = new int[10];
		
		//색 3가지 입력받기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		
		//값 넣기
		for (int i = 0; i < value.length; i++) {
			value[i] = i;	
//			System.out.println(value[i]);
		}
		
		//곱 넣기
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		//입력받은 색(1, 2번째)이 color의 i값과 같다면
		//value[i]을 출력한다. (String으로 변환할것)
		//3번쨰 색이 color의 i값과 같다면 위의 결과물을 int로 변환하여 x의 값을 곱한다. 
		
		
		
	}

}
