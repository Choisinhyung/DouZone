package ex04.Switch;

import java.util.Scanner;

public class SwitchBreak {

	public static void main(String[] args) {
		// 스위치문이용해서 도시선택하고 목록에 없으면 예외처리
		
		System.out.print("당신의 포인트 점수는? (1~3점) input => ");
		
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		
		switch ((int)point) { 
		case 1: System.out.print("집 ");    //break;
		case 2: System.out.print("피아노 "); //break;
		case 3: System.out.print("우산 ");  //break;
	} 
		
		System.out.println("상품에 당첨 되셨습니다. 축하합니다~~!!");
	}

}
