package ex04.Operator;

//최단산쉬관논삼대콤
public class OperatorTest {

	public static void main(String[] args) {
		
		/*   논리연산자
		 * - 2진 논리 => &, |, ^ : 결과를 값으로 출력하는 것
		 * - 10진 논리 => &&, ||, ! : 결과를 참,거짓으로 출력  
		 */ 
		
		//2진
		int x = 4, y = 7;
		
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println((x ^ y) + "\n");
		System.out.println(4 & 7);
		System.out.println(4 | 7);
		System.out.println((4 ^ 7) + "\n");
		
		//10진
		int a = 10, b = 20, c = 30;
		boolean result = true;
		
		result = (a > b) && (b > c); // &&연산은 앞의 조건이 거짓이면 뒤의 조건은 수행하지 않는다.
		System.out.println("&& : " + result);
		
		result = (a < b) && (b < c); // true
		System.out.println("&& : " + result);
		
		result = (a < b) || (b > c); // || 연산은 앞의 조건이 참이면 뒤는 수행하지 않는다. 
		System.out.println("|| : " + result);
		
		System.out.println("! : " + !result);
		
	}

}

/*package ex04.Operator;

//최단산쉬관논삼대콤
public class OperatorTest {

	public static void main(String[] args) {
		//관계연산자 : <, >, =>, =<, ==, !=
		//크거나 같다, 작거나 같다 사용시 =기호가 먼저 나오게 작성하기
		
		int x = 3, y = 5;
		
		//플래그 변수
		boolean flag = true;
		
		System.out.println(flag); //true
		System.out.println(!flag); //false
		
		if(x > y) {
			System.out.println("max : " + x);
		} else {
			System.out.println("max : " + y);
		}
		
		
		if(x == y) {
			System.out.println("same");
		} else {
			System.out.println("Not same");
		}
		
		if(x != y) {
			System.out.println("Not same");
		} else {
			System.out.println("same");
		}
	}

}*/
