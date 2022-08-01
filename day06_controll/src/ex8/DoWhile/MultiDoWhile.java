package ex8.DoWhile;

public class MultiDoWhile {

	public static void main(String[] args) {
		

		int a = 2; // 변수 초기화
		
		do {
			int b = 1; // 안쪽 변수 초기화
			do {
				System.out.println(a + "*" + b + "=" + (a*b));
			} while (b++ < 9); System.out.println(); //비교와 증감을 같이~ 
		} while (a++ < 9);
	}	

}
