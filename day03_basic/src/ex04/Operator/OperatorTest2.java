package ex04.Operator;

public class OperatorTest2 {

	public static void main(String[] args) {
		// 대입(배정)연산자 : =, +=ㅡ -+ㅡ >>=, <<=, /=, %=, *=, ....
		int x = 3, y = 5, result;
		
		result = x + y;
		System.out.println(result);
		
		x = x + y; //
		x += y; //
	}

}


/* package ex04.Operator;

public class OperatorTest2 {

	public static void main(String[] args) {
		// 삼항(조건) 연산자 : if문 대체 / (조건식) ? 참 : 거짓
		
		int x = 20, y = 10;
		String msg = null; // msg = "";
		
		msg = ( x != y) ? "Not Same" : "Same";
		
		System.out.println(msg);
		
		int a = 10, b = 20, c = 30, result;
		
		result = (a > b) ? a : (b > c)? b : c; // 여러개의 조건을 사용할 수 있다~
		System.out.println(result);
	}

} */
