package ex02.dataType;

public class MainEntry {

	public static void main(String[] args) {
		
		char ch = 'A'; // ASCII 키보드가 입력하는 모든 값은 아스키 코드를 가지고 있음
		
		System.out.println(ch + " : ASCII code = " + (int)ch);
		System.out.println('B');
		System.out.println((int)'B' + "\n");
		
		//10진수 : %d
		int num = 9;
		
		//16진수 : 0x숫자 / %x 대소문자 구별 필요
		int xnum = 0x9;
		
		//8진수 : 0숫자 / %o
		int onum = 011;
		
		//2진수 : 0b숫자 대소문자 구별 필요없음/ binary 타입
		int bnum = 0B1010;
		
		System.out.println("10진수 : " + num);
		System.out.println("16진수 : " + xnum);
		System.out.println("8진수 : " + onum);
		System.out.println("2진수 : " + bnum);
		
		System.out.println("----------------");
		System.out.printf("0xa, 0xA = %d %d\n", 0xa, 0xA); //16진수 -> 10진수 출력
		System.out.printf("012 = %d\n", 012); // 8진수 -> 10진수 출력
		System.out.printf("0b1010 = %d\n", 0b1010); //2진수 -> 10진수 출력
		
		System.out.println("----------------");
		System.out.printf("10, 10 = %x %X\n", 10, 10); //10진수 -> 16진수 
		System.out.printf("10 = %o\n", 10); //10진수 -> 8진수

	}

}
