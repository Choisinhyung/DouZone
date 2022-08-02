package homework;

import java.util.Scanner;

public class Ex01_0802 {

	public static void main(String[] args) {
		//크로아티아 알파벳 입력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 문자열을 입력해주세요. ");
		String input = sc.nextLine();
		
		String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		//입력한 문자열이 배열의 요소를 포함하고 있는지 반복해서 찾아내자
		for(int i = 0; i < alpha.length; i++) {
			if(input.contains(alpha[i])) { //만약 문자열이 배열의 요소를 포함하고 있으면
				input = input.replace(alpha[i], "a"); // a로 변경을 해서 저장
			}
		}
		
		System.out.println(input.length());

	}

}
