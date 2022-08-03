package quiz;

import java.util.Scanner;

public class QuizEx01_사칙연산함수 {

	public static void add(int x, int y) {
		System.out.println(x + y);
	}
	
	public static int sub(int x, int y) {
		int tmp, result = 0;
		if(x < y) {
			tmp = x;
			x = y;
			y = tmp;
		
		}
		result = x - y;
		
		return result;
	}
	
	public static int mul(int x, int y) {
		return x * y;
	}
	

	
	public static void div(int x, int y) {
		try {
			
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다. ");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void line() {
		for(int i = 0; i < 4; i++) {
			System.out.println("--------------------");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요 ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		add(1, 2);
		int cha = sub(x, y);
		System.out.println(cha);
		System.out.println(sub(x, y));
	}

}
