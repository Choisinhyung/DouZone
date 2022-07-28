package ex01.scanner;

import java.util.Scanner;

public class MainEntry extends Object{ // object 모두 상속(자동)

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 객체 생성 : 메모리 할당, 생성자 함수 자동 호출
		int x = 9;
		System.out.print("값을 입력해주세요 -> ");
		int input = sc.nextInt();
		
		double y = sc.nextDouble();
		char ch = sc.next().charAt(0); // .charAt(인덱스번호) : 위치값 찾기
		
		System.out.println(x + ", " + input);
	}

}
