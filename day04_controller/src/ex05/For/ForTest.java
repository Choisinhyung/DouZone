package ex05.For;

public class ForTest {

	public static void main(String[] args) {
		
		int a = 1, b = 1;
		
		// 초기값, 증감식은 2개 이상 가능 ( 단, 조건은 오직 1개만 가능 )
		// 초기값, 증감식은 생략 가능 ( 단, 조건은 절대 생략 불가능 : 무한루프)
//		for(a = 1, b = 1; a <= 10; a++, b+=2) { 
//			System.out.println("a");
//		}
//		
//		for( ; a<= 10;) {
//			System.out.println();
//			a++;
//			b += 2;
//		}
		
//		for(a = 1, b = 3; ; a++, b+=2) {
//			System.out.println("a = " + a);
//			System.out.println("b = " + b);
//			if( a < 6 ) break;
//		}
		
		// 1 ~ 10까지 중에서 출력 결과는 5의 배수
		// 1일 때 5 / 2일 때 10 / 3일 때 15
		for(int i = 1; i <= 10; i++) {
			System.out.println(i * 5);
		}
		
	}

}
