package ex02.If;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		// 양수, 음수, 0 판정 if
		System.out.print("Integer data : ");
		int su = new Scanner(System.in).nextInt();
		
		if(su > 0) {
			System.out.println(su + " => 양수");			
		} else if(su == 0) {
			System.out.println(su + " => 0입니다. ");
		} else {
			System.out.println(su + " => 음수");
		} //end if
		
//		else if(su < 0) {
//			System.out.println(su + " => 음수");
//		} else {
//			System.out.println(su + " => 0입니다. ");
//		}

	}

}
