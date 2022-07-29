package DouZoneHomework;

import java.util.Scanner;

public class Ex01_0728 {

	public static void main(String[] args) {
		
		/* 
		 * 숫자 3개를 입력 받아서 큰 수를 출력하는 프로그램 작성
		 * 논리연산(&&, ||), 교환알고리즘(tmp), if이용
		 * 
		 * 입력 예시 : 4 3 5
		 * 출력 예시 : 5 4 3 -> 숫자가 큰 순서대로 출력(3줄 정도로 끝날 수 있음)
		 */
		
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in); //스캐너 객체 생성
		
		int tmp = 0;
		
		for(int i = 0; i < arr.length; i++) { //배열의 각 인덱스에 입력 값 저장
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {  //sort해서 정렬
			for(int j = i + 1; j < arr.length; j++) { 
				if(arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++ ) { //배열 출력
			System.out.print(arr[i] + " ");
		}
		
	}

}