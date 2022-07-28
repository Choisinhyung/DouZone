package ex03.Operator;

public class MainEntry {

	public static void main(String[] args) {
	
		//산술연산자 : +, -, *, /, %, .....
		int x = 10, y = 20;
		int gob = x * y;
		System.out.println("x * y = " + gob);
		System.out.println(x + " * " + y + " = " + gob);
		
		System.out.println("x * y = " + (y * x ));
		System.out.println("\n3 + 4 * 5 = " + (3+4*5));
		System.out.println("\n3 + 4 * 5 = " + (3+4)*5);
		
		// 정수 연산 정수 = 정수
		// 실수 연산 정수 = 실수
		
		System.out.println("7 / 3 = " + (7 / 3)); //값 손실
		System.out.println("7 % 3 = " + (7 % 3)); //나머지 구하기
		System.out.println("7 % 3. = " + (7 % 3.)); //나머지 구하기
		System.out.println("7 / 3. = " + 7 / (float) 3);
		
		
	}

}

/*
package ex03.Operator;

public class MainEntry {

	public static void main(String[] args) {
	
		int x = -7, y;
		y = ~x; // 비트부정 : 0의 비트부정은 -1, -1일 때는 0
		
		System.out.println("x = " + x + "\t y = " + y);
		// 비트부정의 최종 결과 : -(원래값 + 1)
	}

} */

/*
package ex03.dataType;

public class MainEntry {

	public static void main(String[] args) {
	
		// 단항연산자 : 증감 => ++, --, ~(비트연산자), .........
		int x = 10, y, z;
		

		
//		y = x++; //후위연산 : 대입먼저, 연산나중
//		y = ++x; //전위연산 : 연산먼저, 대입나중
		y = x--; //후위
		
		//단독으로 쓰이는 경우에는 전위, 후위 차이가 없음
		++x; // x++
		y = x;
		
		System.out.println("x = " + x + "\t y = " + y);

	}

} */
