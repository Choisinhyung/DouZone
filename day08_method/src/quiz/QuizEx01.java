package quiz;

import java.util.Scanner;

public class QuizEx01 {
	//사칙연산 프로그램 만들기
	
	
	public static void info() {
		//이름, 나이, 연락처 출력
		// 리턴타입없고 매개변수 없음
		String name = "최신형";
		String num = "010-2266-3644";
		String address = "경기도 수원시";
		System.out.println("이름은 " + name + " 번호는 " + num + " 주소는 " + address + "입니다. ");
	}
	
	public static void abs(int x) {
		//절대값, 매개 변수 있고 리턴 없음3
		if(x < 0) {
			x = -x;
		}
		
		System.out.println("x의 절대값 : " + x);
		
	}
	
	public static int max() {
		//매개변수 없고 리턴타입 있음
		// 두개 정수 입력 받아서 큰 수 리턴
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int max = 0;
		
		if(num1 > num2) {
			max = num1;
		} else if(num1 < num2){
			max = num2;
		}
		
		return max;
		
	}
	
	public static int add(int x, int y) {
		// 더하기
		return x + y;
		
	}
	
	public static int sub(int x, int y) {
		// 빼기
		return x - y;
		
	}
	
	public static int mul(int x, int y) {
		// 곱하기
		return x * y;
		
	}
	
	public static void div(int x, int y) {
		// 나누기, 예외처리해야 함
		int num = 0;
		
		try {
			num = x / y;
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("오류");
		}
	}

	public static void main(String[] args) {
		info();
		abs(5);
		max();
		add(1, 5);
		sub(1, 5);
		mul(1, 5);
		div(1, 5);
	}

}
