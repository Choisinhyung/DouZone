package ex04.sort;

import java.util.Arrays;

public class ArraysSortTest {

	public static void main(String[] args) {
		
		int[] a = {7, 3, 5, 2, 8};
		
		System.out.println("sort전 출력");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		//sort
		System.out.print("\n오름차순");
		Arrays.sort(a); // 정렬알고리즘이 이미 내부적으로 처리되어 있는 메소드
		
		System.out.println("\nsort후 출력");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		//내부적으로 내림차순을 지원하는 메소드는 없다.
		System.out.println("\n내림차순");
		for(int i = a.length - 1; i >= 0; i--) {//인덱스 번호가 0번부터라서 초기값은 길이 -1
			System.out.print(a[i] + "\t");
		}

	}

}
