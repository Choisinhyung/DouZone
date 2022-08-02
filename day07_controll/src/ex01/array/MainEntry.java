package ex01.array;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		// 1차원 배열
		
		// 1.
		char[] ch; // 배열 선언
		ch = new char[4]; // 배열 생성(메모리 할당)
		
		// 2. 
		int num = 4;
//		int num = new Scanner(System.in).nextInt();
		char[] ch2 = new char[num]; // 선언 및 생성
		ch2[0] = 'J';// 배열 초기화
		ch2[1] = 'A';
		ch2[2] = 'V';
		ch2[3] = 'A';
		
		System.out.print(ch2[0]);
		System.out.println(ch2[3]);
		System.out.println("=============");
		
		for(int i = 0; i < ch2.length; i++) {
			System.out.print("ch2[" + i + "] = " + ch2[i] + "\t");
		}
		
		System.out.println();
		
//		 3. 선언과 동시에 초기화를 같이~ -> 배열의 길이가 가변적
		char[] ch3 = {'J', 'A', 'V', 'A'};
		for(int i = 0; i < ch3.length; i++) {
			System.out.print("ch3[" + i + "] = " + ch3[i] + "\t");
		}
		
		System.out.println();
		
		String[] str = {"ABC", "DEF", "GHI"};
		for(int i = 0; i < str.length; i++) {
			System.out.print("str[" + i + "] = " + str[i] + "\t");
		}
		
	}

}
