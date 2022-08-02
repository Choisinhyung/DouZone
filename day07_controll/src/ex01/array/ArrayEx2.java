package ex01.array;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		//임의적인 데이터 5개 임력 받아서 합 구하는 프로그램 작성하기
		System.out.print("5개의 숫자를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) { 
			arr[i] = sc.nextInt(); // 배열의 각 인덱스에 입력요소 저장
			sum += arr[i]; // 각 배열 누적더하기
			System.out.println("arr[" + i + "]" + " + " + "arr[" + i + "] = " + sum + "입니다. ");
		}
		System.out.println("총 합은 " + sum + " 입니다. "); // 합 출력
		

		

	}

}

/*package ex01.array;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.print(sum + " ");  // 각 배열 요소를 더한 순서를 모두 출력
		}
		System.out.println("\n" + sum); // 총 합만 출력

	}

} */
