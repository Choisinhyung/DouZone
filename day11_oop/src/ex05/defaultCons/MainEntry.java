package ex05.defaultCons;

//default constructor / API Docs create

public class MainEntry {
	// 한줄주석
	/* 여러줄 주석 */
	/** document 주석
	 * @param args 메인은 아무 값도 넘겨 받지 않습니다. 
	 * @param x 곱을 구하는 것에 첫 번째 정수형 변수
	 * @param y 곱을 구하는 것에 두 번째 정수형 변수
	 * @param gob 변수는 x와 y의 두 정수의 곱을 저장하는 변수
	 * 
	 */ 
	
	public static void main(String[] args) {
		
		int x, y, gob = 1;
		String message;
		char ch = 'A';
		
		x = 5;
		y = 10;
		
		message = "DouZone Th3 화이팅!";
		gob = gob(x, y);
		
		System.out.println(ch);
		System.out.println(message);
		System.out.println(x + " * " + y + " = " + gob);
	}
	
	public static int gob (int x, int y) {
		return x * y;
	}

}
